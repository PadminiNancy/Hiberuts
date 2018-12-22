import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.sql.*;

import com.Employee.*;
import com.Payroll.*;
import com.LeaveManagement.*;
import com.TimeManagement.*;

public class hrms_payroll extends HttpServlet{
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
		String dbopr = "";
		dbopr = (String)request.getParameter("dbopr");
		session.setAttribute("dbopr",dbopr);
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("employee_agreement")) ){
			target = "/jsp/employee_search.jsp";
		}
		else
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("edit_head")) ){
			action = "edit_sal_head";
		}
		else
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("delete_head")) ){
			action = "employee_sal_head_delete";
		}
		else
		if( (dbopr != null && dbopr.length() > 0) && (dbopr.equals("calc_employee_salary")) ){
			target= "/jsp/salary_search.jsp";
		}
		String action_submit = request.getParameter("action_submit");
		System.out.println("action_submit=="+action_submit);
		if ( action_submit != null ){
			if ( request.getParameter("submit").equals("Submit") ){
				System.out.println("in the  Submit");
				if ( action_submit.equals("hrms_employee_search_submit") ){
					System.out.println("in the hrms_employee_search_submit ");
					action = "hrms_employee_search_submit";
				}
			}
			else 
			if ( request.getParameter("submit").equals("Edit") ){
				if ( action_submit.equals("employee_sal_head_edit_submit") )
					action = "employee_sal_head_edit_submit";
			}  
			else 
			if ( request.getParameter("submit").equals("Submit Detail") ){
				if ( action_submit.equals("emp_agreement_dtl_submit") )
					action = "emp_agreement_dtl_submit";
			}  
			else 
			if ( request.getParameter("submit").equals("Calc") ){
				if ( action_submit.equals("salary_calc_submit") )
					action = "salary_calc_submit";
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
				EmployeeDBMethods employeeDBMethods = new EmployeeDBMethods(dbuser,dbpswd,dburl);
				employeeDBObj = (EmployeeDBObj)employeeDBMethods.getRecordByPrimaryKey(lEmpId,lEmpFName);
				System.out.println("iiiii="+employeeDBObj.emp_id+"ffff="+employeeDBObj.emp_f_name);
				if ( (employeeDBObj.emp_id != null && employeeDBObj.emp_f_name != null) ){
					session.setAttribute("employeeDBObj",employeeDBObj);
					PayrollBeanMethods payrollBeanMethods = new PayrollBeanMethods(dbuser,dbpswd,dburl);
					ArrayList employeeAgreementList = new ArrayList();
					String criteria = "";
					criteria = " where emp_id='"+employeeDBObj.emp_id+"'";
					employeeAgreementList = ( ArrayList)payrollBeanMethods.selectEmployeeAgreementByCriteria(criteria);
					session.setAttribute("employeeAgreementList",employeeAgreementList);
					target = "/jsp/employee_agreement.jsp";
				}
				else{
					String lErrorMsg = "Employee doesn't Exist"; 
					session.setAttribute("lErrorMsg",lErrorMsg);
					target = "/jsp/hrms_default.jsp";
				}
			}
			else
			if (action.equals("edit_sal_head")){
				String empId = "";
				String allowanceName = "";
				empId = (String)request.getParameter("emp_id");
				allowanceName = (String)request.getParameter("allowance_name");
				PayrollBeanMethods payrollBeanMethods  = new PayrollBeanMethods(dbuser,dbpswd,dburl);
				EmployeeAgreement employeeAgreement = new EmployeeAgreement();
				employeeAgreement = (EmployeeAgreement)payrollBeanMethods.getEmployeeAgreementRecord(empId,allowanceName);
				session.setAttribute("employeeAgreement",employeeAgreement);
				target = "/jsp/employee_agreement_edit.jsp";
			}
			else
			if (action.equals("salary_calc_submit")){
				PayrollBeanMethods payrollBeanMethods  = new PayrollBeanMethods(dbuser,dbpswd,dburl);
				String empId = (String)request.getParameter("emp_id");
				int year = Integer.parseInt((String)request.getParameter("year"));
				int month = Integer.parseInt((String)request.getParameter("month"));
				String lEmpFName = "";
				EmployeeDBObj employeeDBObj = new EmployeeDBObj();
				EmployeeDBMethods employeeDBMethods = new EmployeeDBMethods(dbuser,dbpswd,dburl);
				employeeDBObj = (EmployeeDBObj)employeeDBMethods.getRecordByPrimaryKey(empId,lEmpFName);
				
				int totalAttendance = 0;
				totalAttendance = getTotalAttendance(empId,year,month);
				System.out.println("totalAttendance======"+totalAttendance);
				session.setAttribute("totalAttendance",Integer.toString(totalAttendance)); 
				int totalLeave = 0;
				totalLeave = getTotalLeave(empId,year,month);
				System.out.println("totalLeave======"+totalLeave);
				session.setAttribute("totalLeave",Integer.toString(totalLeave)); 
				session.setAttribute("employeeDBObj",employeeDBObj);
				session.setAttribute("year",Integer.toString(year));
				session.setAttribute("month",Integer.toString(month));	
				
				ArrayList empSalExist = new ArrayList();
				String criteria = "";
				criteria = " where emp_id='"+empId+"' and year='"+year+"' and month='"+month+"' ";
				empSalExist = ( ArrayList)payrollBeanMethods.selectEmpSalByCriteria(criteria);
				
				if ( empSalExist != null && empSalExist.size() > 0 ){
					ArrayList empSalList = new ArrayList();
					criteria = "";
					criteria = " where emp_id='"+empId+"' and year='"+year+"' and month='"+month+"' ";
					empSalList = ( ArrayList)payrollBeanMethods.selectEmpSalByCriteria(criteria);
					session.setAttribute("empSalList",empSalList);
					System.out.println("empSalList.size()======"+empSalList.size());
				}
				else
				if( totalAttendance > 0 ){
					ArrayList employeeAgreementList = new ArrayList();
					criteria = "";
					criteria = " where emp_id='"+empId+"'";
					employeeAgreementList = ( ArrayList)payrollBeanMethods.selectEmployeeAgreementByCriteria(criteria);
					for (int rec =1; rec <= employeeAgreementList.size() ; rec++ ){
						EmployeeAgreement employeeAgreement = new EmployeeAgreement();
						EmpSal empSal =  new EmpSal();
						employeeAgreement = (EmployeeAgreement)employeeAgreementList.get(rec-1);
						empSal.emp_id =  employeeAgreement.emp_id;
						empSal.year = year ;
						empSal.month = month;
						empSal.allowance_name =  employeeAgreement.allowance_name;
						empSal.allowance_type =  employeeAgreement.allowance_type;
						empSal.amt =  employeeAgreement.amt;
						empSal.taxable =  employeeAgreement.taxable;
						empSal.percentage =  employeeAgreement.percentage;
						payrollBeanMethods.insertEmpSal(empSal);
					} 
					ArrayList empSalList = new ArrayList();
					criteria = "";
					criteria = " where emp_id='"+empId+"' and year='"+year+"' and month='"+month+"' ";
					empSalList = ( ArrayList)payrollBeanMethods.selectEmpSalByCriteria(criteria);
					session.setAttribute("empSalList",empSalList);
					System.out.println("empSalList.size()======"+empSalList.size());
				}
				else{
					String lErrorMsg = "your criteria is not correct .. salary is not prepared!!!"; 
					session.setAttribute("lErrorMsg",lErrorMsg);

					if(session.getAttribute("empSalList")!=null)
						session.removeAttribute("empSalList");
					
				}
				
				target = "/jsp/salary_slip.jsp";
			}
			else
			if (action.equals("emp_agreement_dtl_submit")){
				EmployeeAgreement popEmployeeAgreement = new EmployeeAgreement(); 
				PayrollBeanMethods payrollBeanMethods = new PayrollBeanMethods(dbuser,dbpswd,dburl);
				popEmployeeAgreement = (EmployeeAgreement)payrollBeanMethods.populateEmployeeAgreementFromReq(request);
				EmployeeAgreement employeeAgreement = new EmployeeAgreement();
				employeeAgreement = (EmployeeAgreement)payrollBeanMethods.getEmployeeAgreementRecord(popEmployeeAgreement.emp_id,popEmployeeAgreement.allowance_name);
				if ( (popEmployeeAgreement.emp_id).equals(employeeAgreement.emp_id) && (popEmployeeAgreement.allowance_name).equals(employeeAgreement.allowance_name) ){
					String lErrorMsg = "Allowance Already Exist"; 
					session.setAttribute("lErrorMsg",lErrorMsg);
					target = "/jsp/employee_agreement.jsp";
				}
				else{
					int rval =  payrollBeanMethods.insertEmployeeAgreement(popEmployeeAgreement);
					EmployeeAgreement sEmployeeAgreement = new EmployeeAgreement();
					sEmployeeAgreement = (EmployeeAgreement)payrollBeanMethods.getEmployeeAgreementRecord(popEmployeeAgreement.emp_id,popEmployeeAgreement.allowance_name);
					ArrayList employeeAgreementList = new ArrayList();
					String criteria = "";
					criteria = " where emp_id='"+popEmployeeAgreement.emp_id+"'";
					employeeAgreementList = ( ArrayList)payrollBeanMethods.selectEmployeeAgreementByCriteria(criteria);
					session.setAttribute("employeeAgreementList",employeeAgreementList);
					session.setAttribute("employeeAgreement",sEmployeeAgreement);
					target = "/jsp/employee_agreement.jsp";
				}
			} 
			else
			if (action.equals("employee_sal_head_edit_submit")){ 
				EmployeeAgreement popEmployeeAgreement = new EmployeeAgreement();
				PayrollBeanMethods payrollBeanMethods = new  PayrollBeanMethods(dbuser,dbpswd,dburl);
				popEmployeeAgreement = (EmployeeAgreement)payrollBeanMethods.populateEmployeeAgreementFromReq(request); 
				int rval = payrollBeanMethods .updateEmployeeAgreementByPrimaryKey(popEmployeeAgreement);
				if ( rval > 0 ){   
					ArrayList employeeAgreementList = new ArrayList();
					String criteria = "";
					criteria = " where emp_id='"+popEmployeeAgreement.emp_id+"' ";
					employeeAgreementList = ( ArrayList)payrollBeanMethods.selectEmployeeAgreementByCriteria(criteria);
					session.setAttribute("employeeAgreementList",employeeAgreementList);
					System.out.println("employeeAgreementList.size()"+employeeAgreementList.size());
					target = "/jsp/employee_agreement.jsp";
				}
				else{
					target = "/jsp/employee_agreement_edit.jsp";
				}
			}
			else
			if (action.equals("employee_sal_head_delete")){ 
				String empId = "";
				String allowanceName = "";
				empId = (String)request.getParameter("emp_id");
				allowanceName = (String)request.getParameter("allowance_name");
				PayrollBeanMethods payrollBeanMethods = new  PayrollBeanMethods(dbuser,dbpswd,dburl);
				payrollBeanMethods.deleteEmployeeAgreement(empId,allowanceName); 
				ArrayList employeeAgreementList = new ArrayList();
				String criteria = "";
				criteria = " where emp_id='"+empId+"' ";
				employeeAgreementList = ( ArrayList)payrollBeanMethods.selectEmployeeAgreementByCriteria(criteria);
				session.setAttribute("employeeAgreementList",employeeAgreementList);
				System.out.println("employeeAgreementList.size()"+employeeAgreementList.size());
				target = "/jsp/employee_agreement.jsp";
			}
		} // (action== null )
		/* forwarding the request/response to the targeted view */
		RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(target);
		requestDispatcher.forward(request, response);
	} // doPost closed

	public int getTotalAttendance( String inEmpId, int inYear,int inMonth ){
		TimeManagementDBMethods timeManagementDBMethods = new  TimeManagementDBMethods(dbuser,dbpswd,dburl);
		int totalAttendance = 0;
		ArrayList attendanceList = new ArrayList();
		String criteria = "where emp_id ='"+inEmpId+"' and year='"+inYear+"' and month='"+timeManagementDBMethods.getMonth(inMonth-1)+"' ";   
		attendanceList = (ArrayList)timeManagementDBMethods.selectEmpDailyAttendanceByCriteria(criteria);
		if( attendanceList != null && attendanceList.size() > 0)
			totalAttendance = attendanceList.size();
		return totalAttendance;
	}

	public int getTotalLeave( String inEmpId, int inYear,int inMonth ){
		LeaveMgmtBeanMethods leaveMgmtBeanMethods = new  LeaveMgmtBeanMethods(dbuser,dbpswd,dburl);

		int totalLeave = 0;
		ArrayList leaveList = new ArrayList();
		String strtdate = "";
		String enddate = "";

		strtdate = "01"+"-"+getMonth(inMonth-1)+"-"+inYear;
		enddate  = "28"+"-"+getMonth(inMonth-1)+"-"+inYear;
		String criteria = "where emp_id ='"+inEmpId+"' and leave_status='Aprv' and from_date >='"+strtdate+"' and to_date <='"+enddate+"'  ";
		leaveList = (ArrayList)leaveMgmtBeanMethods.selectLeaveRequestByCriteria(criteria);
		if( leaveList != null && leaveList.size() > 0){
			for (int i = 1;i<=leaveList.size() ;i++ ){
				LeaveRequest leaveRequest  = new LeaveRequest();
				leaveRequest = (LeaveRequest)leaveList.get(i-1);
				totalLeave = totalLeave + leaveRequest.days;
			}
		}
		return totalLeave;
	}
	public String getMonth( int month ){
		String strMonth = "";
		if(month == 0) strMonth = "JAN";
		else if(month == 1) strMonth = "FEB";
		else if(month == 2 ) strMonth = "MAR";
		else if(month == 3) strMonth = "APR";
		else if(month == 4) strMonth = "MAY";
		else if(month == 5) strMonth = "JUN";
		else if(month == 6) strMonth = "JUL";
		else if(month == 7) strMonth = "AUG";
		else if(month == 8) strMonth = "SEP"; 
		else if(month == 9) strMonth = "OCT";
		else if(month == 10) strMonth = "NOV";
		else if(month == 11) strMonth = "DEC";
		return strMonth;
	}
}// class closed