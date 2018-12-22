import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.sql.*;

import com.LeaveManagement.LeaveMgmtBeanMethods;
import com.LeaveManagement.LeaveRequest;

public class leave_management extends HttpServlet{
	String dbuser  = "";
	String dbpswd  = "";
	String dburl   = "";
	/**Initialize global variables*/
	public void init(ServletConfig config) throws ServletException{
		System.out.println("initializing controller servlet.");
		ServletContext context = config.getServletContext();
		dbuser = "scott";
		dbpswd = "tiger";		
		dburl  = "jdbc:oracle:thin:@localhost:1521:"+"orcl";
		super.init(config);
	}
	/**Process the HTTP Get request*/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**Process the HTTP Post request*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("lErrorMsg",null);
		String target = "";
		String action = request.getParameter("action");
		String dbopr = "";
		dbopr = (String)request.getParameter("dbopr");
		session.setAttribute("dbopr",dbopr);
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("leave_request")) ){
			target = "/jsp/leave_request.jsp";
		}
		else
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("leave_approve")) ){
			action = "select_leave_request";
		}
		else
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("approve")) ){
			action = "leave_request_approve";
		}
		else
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("approved_leave")) ){
			action = "approved_leave_request";
		}
		String action_submit = request.getParameter("action_submit");
		System.out.println("action_submit=="+action_submit);
		if ( action_submit != null ){
			if ( request.getParameter("submit").equals("Submit") ){
				System.out.println("in the  Submit");
				if ( action_submit.equals("employee_leave_req_submit") ){
					System.out.println("in the employee_leave_req_submit ");
					action = "employee_leave_req_submit";
				}
			}
			else 
			if ( request.getParameter("submit").equals("Edit") ){
				if ( action_submit.equals("employee_leave_req_edit_submit") )
					action = "employee_leave_req_edit_submit";
			}
		}
		if (action!=null){
			System.out.println("in the  "+action);
			if (action.equals("leave_request_approve")){
			String reqId = "";
			reqId = (String)request.getParameter("req_id");
			String empId = "";
			empId = (String)request.getParameter("emp_id");
			LeaveMgmtBeanMethods leaveMgmtBeanMethods = new LeaveMgmtBeanMethods(dbuser,dbpswd,dburl);
			LeaveRequest leaveRequest = new LeaveRequest();
			leaveRequest = (LeaveRequest)leaveMgmtBeanMethods.getRecordByPrimaryKey(reqId,empId);
			session.setAttribute("leaveRequest",leaveRequest);
			target = "/jsp/leave_request_edit.jsp";
		}   
		else
		if (action.equals("select_leave_request") || action.equals("approved_leave_request")){
			LeaveMgmtBeanMethods leaveMgmtBeanMethods  = new LeaveMgmtBeanMethods(dbuser,dbpswd,dburl);
			ArrayList leaveRequestList = new ArrayList();
			String criteria = "";
			if( action.equals("select_leave_request") )
				criteria = " where leave_status='Req' ";
			else
				criteria = " where leave_status='Aprv' ";
			
			leaveRequestList = ( ArrayList)leaveMgmtBeanMethods.selectLeaveRequestByCriteria(criteria);
			session.setAttribute("leaveRequestList",leaveRequestList);
			System.out.println("leaveRequestList.size()"+leaveRequestList.size());
			target = "/jsp/leave_request_list.jsp";
		}   
		else
		if (action.equals("employee_leave_req_submit")){
			LeaveRequest popLeaveRequest = new LeaveRequest(); 
			LeaveMgmtBeanMethods leaveMgmtBeanMethods = new LeaveMgmtBeanMethods(dbuser,dbpswd,dburl);
			popLeaveRequest = (LeaveRequest)leaveMgmtBeanMethods.populateLeaveRequestFromReq(request);
			popLeaveRequest.leave_status = "Req";
			LeaveRequest leaveRequest = new LeaveRequest();
			leaveRequest = (LeaveRequest)leaveMgmtBeanMethods.getRecordByPrimaryKey(popLeaveRequest.req_id,popLeaveRequest.emp_id);
			if ( (popLeaveRequest.emp_id).equals(leaveRequest.emp_id) && (popLeaveRequest.req_id).equals(leaveRequest.req_id) ){
				String lErrorMsg = "Employee Already Exist"; 
				session.setAttribute("lErrorMsg",lErrorMsg);
				target = "/jsp/leave_request.jsp";
			}
			else{
				int rval =  leaveMgmtBeanMethods.insertLeaveRequest(popLeaveRequest);
				LeaveRequest sLeaveRequest = new LeaveRequest();
				sLeaveRequest = (LeaveRequest)leaveMgmtBeanMethods.getRecordByPrimaryKey(popLeaveRequest.req_id,popLeaveRequest.emp_id);
				session.setAttribute("leaveRequest",sLeaveRequest);
				target = "/jsp/leave_request_edit.jsp";
			}
		}   
		else
		if (action.equals("employee_leave_req_edit_submit")){ 
			LeaveRequest popLeaveRequest = new LeaveRequest();
			LeaveMgmtBeanMethods leaveMgmtBeanMethods = new  LeaveMgmtBeanMethods(dbuser,dbpswd,dburl);
			String ldbopr = (String)session.getAttribute("dbopr");
			System.out.println("dbopr????????????????//"+ldbopr);
			popLeaveRequest = (LeaveRequest)leaveMgmtBeanMethods.populateLeaveRequestFromReq(request); 
			if(ldbopr != null && ldbopr.equals("approve"))
				popLeaveRequest.leave_status = "Aprv"; 
			else
				popLeaveRequest.leave_status = "Req"; 
			System.out.println("dbopr????????????????//"+popLeaveRequest.leave_status);
			int rval = leaveMgmtBeanMethods .updateLeaveRequestByPrimaryKey(popLeaveRequest);
			if ( rval > 0 ){   
				LeaveRequest LeaveRequest = new LeaveRequest();
				LeaveRequest = (LeaveRequest)leaveMgmtBeanMethods.getRecordByPrimaryKey(popLeaveRequest.req_id,popLeaveRequest.emp_id);
				session.setAttribute("LeaveRequest",LeaveRequest);
				ArrayList leaveRequestList = new ArrayList();
				String criteria = "";
				criteria = " where leave_status='Req' ";
				leaveRequestList = ( ArrayList)leaveMgmtBeanMethods.selectLeaveRequestByCriteria(criteria);
				session.setAttribute("leaveRequestList",leaveRequestList);
				System.out.println("leaveRequestList.size()"+leaveRequestList.size());
				target = "/jsp/leave_request_list.jsp";
			}
			else{
				target = "/jsp/employee_edit.jsp";
			}
		}
		} // (action== null )
		/* forwarding the request/response to the targeted view */
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(target);
		requestDispatcher.forward(request, response);
	} // doPost closed
}// class closed