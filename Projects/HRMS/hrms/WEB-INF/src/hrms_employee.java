import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.sql.*;

import com.Employee.EmployeeDBMethods;
import com.Employee.EmployeeDBObj;

public class hrms_employee extends HttpServlet
{
   String lDBUser  = "";
   String lDBPswd  = "";
   String lDBUrl   = "";
  	/**Initialize global variables*/
	public void init(ServletConfig config) throws ServletException{
		System.out.println("initializing controller servlet.");
		ServletContext context = config.getServletContext();
		lDBUser = "scott";
		lDBPswd = "tiger";
		lDBUrl  = "jdbc:oracle:thin:@localhost:1521:"+"orcl";
	    super.init(config);
   }

	/**Process the HTTP Get request*/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
   		doPost(request, response);
	}

  /**Process the HTTP Post request*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
   		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("lErrorMsg",null);
		String target = "";
		String action = request.getParameter("action");
		String lDBOpr = "";
		lDBOpr = (String)request.getParameter("dbopr");
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("create")) ){
			target = "/jsp/employee_insert.jsp";
		}
		else{
			target = "/jsp/employee_search.jsp";
		}
		String action_submit = request.getParameter("action_submit");
	    String action_edit = request.getParameter("action_edit");
    	System.out.println("action_submit=="+action_submit);
		if ( action_submit != null || action_edit != null ){
			if ( request.getParameter("submit").equals("Submit") ){
				System.out.println("in the  Submit");
				if ( action_submit.equals("hrms_employee_insert_submit") ){
					System.out.println("in the hrms_employee_insert_submit ");
					action = "hrms_employee_insert_submit";
				}
				else
					if (action_submit.equals("login_pswd_change_submit")){
						action = "login_pswd_change_submit";
					}
					else
						if (action_submit.equals("hrms_employee_search_submit")){
							action = "hrms_employee_search_submit";
						}
			}
			else 
				if ( request.getParameter("submit").equals("Edit") ){
					if ( action_edit.equals("hrms_employee_edit_submit") )
						action = "hrms_employee_edit_submit";
				}
		}
		if (action!=null){
			System.out.println("in the  "+action);
			if (action.equals("hrms_employee_search_submit")){
				String lEmpId = "";
				String lEmpFName = "";
				lEmpId = (String)request.getParameter("emp_id");
				lEmpFName = (String)request.getParameter("emp_f_name");
	            EmployeeDBObj employeeDBObj = new EmployeeDBObj();
				EmployeeDBMethods employeeDBMethods = new EmployeeDBMethods(lDBUser,lDBPswd,lDBUrl);
				employeeDBObj = (EmployeeDBObj)employeeDBMethods.getRecordByPrimaryKey(lEmpId,lEmpFName);
				System.out.println("iiiii="+employeeDBObj.emp_id+"ffff="+employeeDBObj.emp_f_name);
				if ( (employeeDBObj.emp_id != null && employeeDBObj.emp_f_name != null) ){
					session.setAttribute("employeeDBObj",employeeDBObj);
					target = "/jsp/employee_edit.jsp";
				}
				else{
					String lErrorMsg = "Employee doesn't Exist"; 
					session.setAttribute("lErrorMsg",lErrorMsg);
					target = "/jsp/hrms_default.jsp";
				}
			}   
			else
				if (action.equals("hrms_change_pswd_submit")){
					target = "/jsp/hrms_user_login_pswd_change.jsp";
				}
				else
					if (action.equals("hrms_employee_insert_submit")){
						EmployeeDBObj popEmployeeDBObj = new EmployeeDBObj(); 
						EmployeeDBMethods employeeDBMethods = new EmployeeDBMethods(lDBUser,lDBPswd,lDBUrl);
						popEmployeeDBObj = (EmployeeDBObj)employeeDBMethods.populateEmployeeDBObjFromReq(request);
						EmployeeDBObj employeeDBObj = new EmployeeDBObj();
						employeeDBObj = (EmployeeDBObj)employeeDBMethods.getRecordByPrimaryKey(popEmployeeDBObj.emp_id,popEmployeeDBObj.emp_f_name);
						if ( (popEmployeeDBObj.emp_id).equals(employeeDBObj) && (popEmployeeDBObj.emp_f_name).equals(employeeDBObj.emp_f_name) ){
							String lErrorMsg = "Employee Already Exist"; 
							session.setAttribute("lErrorMsg",lErrorMsg);
							target = "/jsp/employee_insert.jsp";
						}
						else{
							int rval =  employeeDBMethods.insertEmployee(popEmployeeDBObj);
							EmployeeDBObj sEmployeeDBObj = new EmployeeDBObj();
							sEmployeeDBObj = (EmployeeDBObj)employeeDBMethods.getRecordByPrimaryKey(popEmployeeDBObj.emp_id,popEmployeeDBObj.emp_f_name);
							session.setAttribute("employeeDBObj",sEmployeeDBObj);
						   target = "/jsp/employee_edit.jsp";
            			}
		
      				}   
					else
						if (action.equals("hrms_employee_edit_submit")){ 
							EmployeeDBObj popEmployeeDBObj = new EmployeeDBObj();
							EmployeeDBMethods employeeDBMethods = new EmployeeDBMethods(lDBUser,lDBPswd,lDBUrl);
							popEmployeeDBObj = (EmployeeDBObj)employeeDBMethods.populateEmployeeDBObjFromReq(request);
							int rval = employeeDBMethods.updateEmployeeByPrimaryKey(popEmployeeDBObj);
							if ( rval > 0 ){   
								EmployeeDBObj employeeDBObj = new EmployeeDBObj();
                    			employeeDBObj = (EmployeeDBObj)employeeDBMethods.getRecordByPrimaryKey(popEmployeeDBObj.emp_id,popEmployeeDBObj.emp_f_name);
								session.setAttribute("employeeDBObj",employeeDBObj);
								target = "/jsp/employee_edit.jsp";
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


