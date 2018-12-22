import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.sql.*;
import com.Applicant.*;

public class applicant_test_dtl extends HttpServlet{
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
		String lDBOpr = "";
		lDBOpr = (String)request.getParameter("dbopr");
		session.setAttribute("dbopr",lDBOpr);
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("call_for_written")) ){
			action = "hrms_applicant_select";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("call")) ){
			action = "hrms_applicant_call";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("remove")) ){
			action = "hrms_applicant_remove";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("detail")) ){
			action = "hrms_applicant_detail";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("upd_wrtn_performance"))){
			action = "upd_applicant_wrtn_performance";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("upd_tech_performance"))){
			action = "upd_applicant_tech_performance";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("upd_hr_performance"))){
			action = "upd_applicant_hr_performance";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("upd_wrtn_record"))){
			action = "upd_wrtn_record";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("upd_tech_record"))){
			action = "upd_tech_record";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("upd_hr_record"))){
			action = "upd_hr_record";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("shortlist_after_wrtn"))){
			action = "shortlist_after_wrtn";
		}
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("shortlist_after_tech"))){
			action = "shortlist_after_tech";
		}
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("shortlist_after_hr"))){
			action = "shortlist_after_hr";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("applicant_call_for_tech"))){
			action = "applicant_call_for_tech";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("applicant_call_for_hr"))){
			action = "applicant_call_for_hr";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("applicant_call_for_final"))){
			action = "applicant_call_for_final";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("delete")) ){
			action = "applicant_remove_for_tech";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("discard")) ){
			action = "applicant_remove_for_hr";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("discard_for_final")) ){
			action = "applicant_remove_for_final";
		}
		else
		if( (lDBOpr != null && lDBOpr.length() > 0) && (lDBOpr.equals("final_selected")) ){
			action = "applicant_final_selected";
		}
		String action_submit = request.getParameter("action_submit");
		String action_wrtn_dtl_submit = request.getParameter("action_wrtn_dtl_submit");
		String action_edit = request.getParameter("action_edit");
		String action_select = request.getParameter("action_select");
		
		System.out.println("action_submit=="+action_submit+"action_wrtn_dtl_submit=="+action_wrtn_dtl_submit);
		
		if ( action_submit != null || action_edit != null || action_select != null || action_wrtn_dtl_submit != null  ){
			if ( request.getParameter("submit").equals("Submit") ){
				System.out.println("in the  Submit");
				if ( action_submit != null && action_submit.equals("hrms_applicant_register_submit") ){
					System.out.println("in the hrms_applicant_register_submit ");
					action = "hrms_applicant_register_submit";
				}
			}
			else 
			if ( request.getParameter("submit").equals("Update") ){
				if ( action_edit.equals("hrms_applicant_edit_submit") )
					action = "hrms_applicant_edit_submit";
			}  
			else 
			if ( request.getParameter("submit").equals("Enter Test Detail") ){
				if (action_select.equals("applicant_call_for_wrtn_test_submit")){
					action = "applicant_call_for_wrtn_test_submit";
				}
			}  
			else
			if ( request.getParameter("submit").equals("Submit Detail") ){
				if ( action_submit.equals("hrms_applicant_wrtn_test_dtl_submit") ){
					System.out.println("in the hrms_applicant_wrtn_test_dtl_submit ");
					action = "hrms_applicant_wrtn_test_dtl_submit";
				}
			}
			else
			if ( request.getParameter("submit").equals("Update Detail") ){
				if ( action_submit.equals("hrms_applicant_wrtn_test_dtl_upd_submit") ){
					System.out.println("in the hrms_applicant_wrtn_test_dtl_upd_submit ");
					action = "hrms_applicant_wrtn_test_dtl_upd_submit";
				}
			}
			else
			if ( request.getParameter("submit").equals("Call For Tech") ){
				if ( action_submit.equals("applicant_call_tech_dtl_submit") ){
					System.out.println("in the applicant_call_tech_dtl_submit ");
					action = "applicant_call_tech_dtl_submit";
				}
			}
			else
			if ( request.getParameter("submit").equals("Call For HR") ){
				if ( action_submit.equals("applicant_call_hr_dtl_submit") ){
					System.out.println("in the applicant_call_hr_dtl_submit ");
					action = "applicant_call_hr_dtl_submit";
				}
			}
			else
			if ( request.getParameter("submit").equals("Select Final") ){
				if ( action_submit.equals("applicant_select_for_final_submit") ){
					System.out.println("in the applicant_select_for_final_submit ");
					action = "applicant_select_for_final_submit";
				}
			}
		}
		if (action!=null) {
			System.out.println("in the  "+action);
			if (action.equals("upd_wrtn_record") || action.equals("upd_tech_record") || action.equals("upd_hr_record")){
			String lApplicantId = "";
		    lApplicantId = (String)request.getParameter("applicantid");
			System.out.println("lApplicantId======******="+lApplicantId);
			ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			
if (action.equals("upd_wrtn_record"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'W' and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			}
if (action.equals("upd_tech_record"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'T' and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			}


if (action.equals("upd_hr_record"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'HR' and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			}
			//applicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestDtlDBMethods.getRecordByPrimaryKey(lApplicantId);
			int rval = 0; 
			if ( (applicantTestDtlDBObj.applicant_id != null ) ){ 
				session.setAttribute("applicantTestDtlDBObj",applicantTestDtlDBObj);
				target = "/jsp/applicant_test_dtl_update.jsp";
			}
			else{
				String lErrorMsg = "Applicant doesn't Exist"; 
				session.setAttribute("lErrorMsg",lErrorMsg);
				target = "/jsp/hrms_default.jsp";
			}
		}
		else
		if (action.equals("hrms_applicant_wrtn_test_dtl_upd_submit")){
			String dbopr = "";
			dbopr = (String)session.getAttribute("dbopr");
			System.out.println("dbopr>>>>>>>>>>>>>>>>>>>>>>>>>"+dbopr);
		    ArrayList testrecords = new ArrayList();
			String lApplicantId = "";
			String ltest_id="";
			
		    String prsntstatus = "";
			long marksgained = 0;
			String passfail = "";
			String nextround = "";
			lApplicantId = (String)request.getParameter("applicant_id");
			ltest_id = (String)request.getParameter("test_id");
			System.out.println("lApplicantId======******="+lApplicantId);
			prsntstatus = (String)request.getParameter("present_status");
			System.out.println("present_status"+lApplicantId+"======******="+prsntstatus);
			marksgained  = Long.parseLong((String)request.getParameter("marks_gained"));
			passfail   = (String)request.getParameter("pass_fail");
			nextround    = (String)request.getParameter("next_round");
			ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			String criteria="";
			criteria = "where test_id='"+ltest_id+"' and applicant_id='"+lApplicantId+"'";
		    testrecords = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
			applicantTestDtlDBObj = (ApplicantTestDtlDBObj)testrecords.get(0);
            int rval = 0; 
			if ( (applicantTestDtlDBObj.applicant_id != null ) ){   
				System.out.println("applicantTestDtlDBObj.test_id"+applicantTestDtlDBObj.test_id);
				System.out.println("applicantTestDtlDBObj.test_date"+applicantTestDtlDBObj.test_date);
				System.out.println("applicantTestDtlDBObj.test_time"+applicantTestDtlDBObj.test_time);

				ApplicantTestDtlDBObj updApplicantTestDtlDBObj = new ApplicantTestDtlDBObj();
				updApplicantTestDtlDBObj.test_id = applicantTestDtlDBObj.test_id;
				updApplicantTestDtlDBObj.test_name = applicantTestDtlDBObj.test_name;
				updApplicantTestDtlDBObj.applicant_id = applicantTestDtlDBObj.applicant_id;
				updApplicantTestDtlDBObj.applicant_name = applicantTestDtlDBObj.applicant_name;
				updApplicantTestDtlDBObj.test_date = applicantTestDtlDBObj.test_date;
				updApplicantTestDtlDBObj.test_time = applicantTestDtlDBObj.test_time;
				updApplicantTestDtlDBObj.total_marks = applicantTestDtlDBObj.total_marks ;
				updApplicantTestDtlDBObj.test_status = applicantTestDtlDBObj.test_status;

				updApplicantTestDtlDBObj.present_status = prsntstatus;
				updApplicantTestDtlDBObj.marks_gained = marksgained;
				updApplicantTestDtlDBObj.pass_fail = passfail;
				updApplicantTestDtlDBObj.next_round = nextround;

				rval = applicantTestDtlDBMethods.updateApplicantTestDtl(updApplicantTestDtlDBObj);
				ArrayList ApplicantTestDtlList = new ArrayList();
				criteria = "";
				if(dbopr != null && dbopr.equals("upd_wrtn_record")) 
					criteria = "where test_status='W'";
				else
				if(dbopr != null && dbopr.equals("upd_tech_record"))
					criteria = "where test_status='T' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('HR','confirm'))";
				else
				if(dbopr != null && dbopr.equals("upd_hr_record"))
					criteria = "where test_status='HR' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('confirm'))";
				ApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				session.setAttribute("ApplicantTestDtlList",ApplicantTestDtlList);
				target = "/jsp/applicant_test_dtl_list.jsp";
			}
			else{
				String lErrorMsg = "Applicant doesn't Exist"; 
				session.setAttribute("lErrorMsg",lErrorMsg);
				target = "/jsp/hrms_default.jsp";
			}
		}   
		else
		if (action.equals("hrms_applicant_wrtn_test_dtl_submit")) // for all written,technical and HR detail
		{
			ArrayList applicantTestList = new ArrayList();
			String dbopr = "";
            dbopr = (String)session.getAttribute("dbopr");
            System.out.println("i m in>>>>>>>>>> "+dbopr); 
			if( dbopr != null && ( dbopr.equals("applicant_call_for_tech") || dbopr.equals("applicant_call_for_hr") )){
				System.out.println("i m in>>>>>>>>>> "+dbopr); 
				applicantTestList = (ArrayList)session.getAttribute("selectApplicantTechList");
			} 
			else
              applicantTestList = (ArrayList)session.getAttribute("applicantTestList");
             
			ApplicantTestDtlDBObj popApplicantTestDtlDBObj = new ApplicantTestDtlDBObj(); 
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
            popApplicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestDtlDBMethods.populateApplicantTestDtlDBObjFromReq(request);
			if ( applicantTestList != null && applicantTestList.size() > 0 ){
				for (int lsize =1; lsize <= applicantTestList.size() ;lsize++ ){
					ApplicantTestDtlDBObj listApplicantTestDtlDBObj  = new ApplicantTestDtlDBObj();
					ApplicantDBObj applicantDBObj  = new ApplicantDBObj();
					if( dbopr != null && ( dbopr.equals("applicant_call_for_tech") || dbopr.equals("applicant_call_for_hr") )){
						listApplicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestList.get(lsize-1);  
					}
					else{
						applicantDBObj = (ApplicantDBObj)applicantTestList.get(lsize-1); 
					}
					ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
					applicantTestDtlDBObj.test_id   =  popApplicantTestDtlDBObj.test_id;
					applicantTestDtlDBObj.test_name = popApplicantTestDtlDBObj.test_name;
					if( dbopr != null && ( dbopr.equals("applicant_call_for_tech") || dbopr.equals("applicant_call_for_hr") ) ) {
						applicantTestDtlDBObj.applicant_id = listApplicantTestDtlDBObj.applicant_id;
						applicantTestDtlDBObj.applicant_name = listApplicantTestDtlDBObj.applicant_name;
					}
					else{
						applicantTestDtlDBObj.applicant_id = applicantDBObj.applicant_id;
						applicantTestDtlDBObj.applicant_name = applicantDBObj.applicant_name;
					}
					applicantTestDtlDBObj.test_date = popApplicantTestDtlDBObj.test_date;
					applicantTestDtlDBObj.test_time = popApplicantTestDtlDBObj.test_time;
					applicantTestDtlDBObj.present_status = "";
					applicantTestDtlDBObj.total_marks = popApplicantTestDtlDBObj.total_marks;
					applicantTestDtlDBObj.marks_gained = 0;
					if( dbopr != null && dbopr.equals("applicant_call_for_tech"))
					applicantTestDtlDBObj.test_status= "T";
					else
					if( dbopr != null && dbopr.equals("applicant_call_for_hr"))
					applicantTestDtlDBObj.test_status= "HR";
					else
					if( dbopr != null && dbopr.equals("shortlist_after_hr"))
					applicantTestDtlDBObj.test_status= "confirm"; 
					else
					applicantTestDtlDBObj.test_status= "W";
					
					applicantTestDtlDBObj.pass_fail= "";
					applicantTestDtlDBObj.next_round = "";
					int rval =  applicantTestDtlDBMethods.insertApplicantTestDtl(applicantTestDtlDBObj);
				}
			}
			ArrayList ApplicantTestDtlList = new ArrayList();
			String criteria = "";
			if( dbopr != null && dbopr.equals("applicant_call_for_hr")){
				criteria = " where test_status='T' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('HR','confirm'))";
			}
			else
				criteria = " where test_status not in ('T','HR','confirm') and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('T','HR','confirm'))";
			ApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
			session.setAttribute("ApplicantTestDtlList",ApplicantTestDtlList);
			System.out.println("ApplicantTestDtlList.size=====>>>>>>>>>>"+ApplicantTestDtlList.size());
			// setting prev selected list to null
			session.setAttribute("selectApplicantTechList",null);
			target = "/jsp/applicant_test_dtl_list.jsp";
		} 
		else
		if( action.equals("applicant_select_for_final_submit")){   
			ArrayList applicantTestList = new ArrayList();
			applicantTestList = (ArrayList)session.getAttribute("selectApplicantTechList");
			ApplicantTestDtlDBObj popApplicantTestDtlDBObj = new ApplicantTestDtlDBObj(); 
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			popApplicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestDtlDBMethods.populateApplicantTestDtlDBObjFromReq(request);
			if ( applicantTestList != null && applicantTestList.size() > 0 ){
				for (int lsize =1; lsize <= applicantTestList.size() ;lsize++ ){
					ApplicantTestDtlDBObj listApplicantTestDtlDBObj  = new ApplicantTestDtlDBObj();
					ApplicantDBObj applicantDBObj  = new ApplicantDBObj();
					listApplicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestList.get(lsize-1);  
					ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
					applicantTestDtlDBObj.test_id   = "final";
					applicantTestDtlDBObj.test_name = "final";
					applicantTestDtlDBObj.applicant_id = listApplicantTestDtlDBObj.applicant_id;
					applicantTestDtlDBObj.applicant_name = listApplicantTestDtlDBObj.applicant_name;
					applicantTestDtlDBObj.test_date = "";
					applicantTestDtlDBObj.test_time = "";
					applicantTestDtlDBObj.present_status = "";
					applicantTestDtlDBObj.total_marks = 0;
					applicantTestDtlDBObj.marks_gained = 0;
					applicantTestDtlDBObj.test_status= "confirm"; 
					applicantTestDtlDBObj.pass_fail= "";
					applicantTestDtlDBObj.next_round = "";
					int rval =  applicantTestDtlDBMethods.insertApplicantTestDtl(applicantTestDtlDBObj);
				}
			}
			/* select those applicant who doesn.t selected for final*/
			ArrayList ApplicantTestDtlList = new ArrayList();
			String criteria = "";
			criteria = " where test_status='confirm'"; 
			ApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
			session.setAttribute("ApplicantTestDtlList",ApplicantTestDtlList);
			System.out.println("ApplicantTestDtlList.size=====>>>>>>>>>>"+ApplicantTestDtlList.size());
			// setting prev selected list to null
			session.setAttribute("selectApplicantTechList",null);
			target = "/jsp/applicant_final_selected_list.jsp";
		}
		else
		if (action.equals("hrms_applicant_select")){        
			ApplicantDBMethods applicantDBMethods = new ApplicantDBMethods(lDBUser,lDBPswd,lDBUrl);
			ArrayList ApplicantList = new ArrayList();
			String criteria = "";
			criteria = " where applicant_id not in ( select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('W','T','HR','confirm'))";
			ApplicantList = (ArrayList)applicantDBMethods.selectApplicantByCriteria(criteria);
			session.setAttribute("ApplicantList",ApplicantList);
			target = "/jsp/applicant_list.jsp";
		}  
		else
		if (action.equals("upd_applicant_wrtn_performance") || action.equals("upd_applicant_tech_performance") || action.equals("upd_applicant_hr_performance")){        
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			ArrayList ApplicantTestDtlList = new ArrayList();
			String  criteria = "";
			if (action.equals("upd_applicant_tech_performance")){
				criteria = "where test_status='T' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('HR','confirm'))";
			}
			else
			if (action.equals("upd_applicant_hr_performance")){ 
				criteria = "where test_status='HR' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('confirm'))";
			}
			else
				criteria = "where test_status='W' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('T','HR','confirm'))";
			ApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
			session.setAttribute("ApplicantTestDtlList",ApplicantTestDtlList);
			target = "/jsp/applicant_test_dtl_list.jsp";
		} 
		else
		if (action.equals("hrms_applicant_call")){
			String lApplicantId = "";
			lApplicantId = (String)request.getParameter("applicant_id");
			ArrayList prevApplicantTestList = new ArrayList();
			prevApplicantTestList = (ArrayList)session.getAttribute("applicantTestList");
			ApplicantDBMethods applicantDBMethods = new ApplicantDBMethods(lDBUser,lDBPswd,lDBUrl);
			ApplicantDBObj applicantDBObj = new ApplicantDBObj();
			applicantDBObj = (ApplicantDBObj)applicantDBMethods.getRecordByPrimaryKey(lApplicantId); 
			int lNotAddedFlag=0;
			int lAddedFlag = 0;
			if(prevApplicantTestList != null && prevApplicantTestList.size() > 0 ){
				for( int lListSize = 1; lListSize <= prevApplicantTestList.size(); lListSize++ ){
					System.out.println("**********i m in for loop");
					ApplicantDBObj inApplicantDBObj = new ApplicantDBObj();
					inApplicantDBObj = (ApplicantDBObj)prevApplicantTestList.get(lListSize-1);
					if( !((inApplicantDBObj.applicant_id).equals((applicantDBObj.applicant_id))) ){
						lNotAddedFlag = 1;
					}
					else{
						lAddedFlag = 1;
					}
				}	
				if ( lAddedFlag == 0){
					System.out.println("**********i m in add   lAddedFlag=="+lAddedFlag); 
					prevApplicantTestList.add(applicantDBObj);
				}
				System.out.println("**********i m out of for prevApplicantTestList.size()"+prevApplicantTestList.size());
			}
			else{
				ArrayList applicantTestList = new ArrayList();
				applicantTestList.add(applicantDBObj);
				session.setAttribute("applicantTestList",applicantTestList);
			}
			target = "/jsp/applicant_list.jsp";
		}   
		else
		if (action.equals("hrms_applicant_remove")){        
			String lApplicantId = "";
			lApplicantId = (String)request.getParameter("applicant_id");
			ArrayList prevApplicantTestList = new ArrayList();
			prevApplicantTestList = (ArrayList)session.getAttribute("applicantTestList");
			ApplicantDBMethods applicantDBMethods = new ApplicantDBMethods(lDBUser,lDBPswd,lDBUrl);
			ApplicantDBObj applicantDBObj = new ApplicantDBObj();
			applicantDBObj = (ApplicantDBObj)applicantDBMethods.getRecordByPrimaryKey(lApplicantId); 
			for( int lListSize = 1; lListSize <= prevApplicantTestList.size(); lListSize++ ){
				ApplicantDBObj inApplicantDBObj = new ApplicantDBObj();
				inApplicantDBObj = (ApplicantDBObj)prevApplicantTestList.get(lListSize-1);
				if((inApplicantDBObj.applicant_id).equals(lApplicantId) ){
					int lIndex = prevApplicantTestList.indexOf(inApplicantDBObj);
					prevApplicantTestList.remove(lIndex);
				}
			}	
			session.setAttribute("applicantTestList",prevApplicantTestList);
			target = "/jsp/applicant_list.jsp";
		}   
		else
		if (action.equals("shortlist_after_wrtn") || action.equals("shortlist_after_tech") || action.equals("shortlist_after_hr") ){    	ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			session.setAttribute("selectApplicantTechList",null);
			ArrayList ApplicantTestDtlList = new ArrayList();
			String criteria = "";
			if ( action.equals("shortlist_after_wrtn")){
				criteria = " where test_status = 'W' and pass_fail='Pass' and applicant_id not in (select applicant_id from APPLICANT_TEST_DETAIL where test_status in ('T','HR','confirm'))";
			}
			else 
			if ( action.equals("shortlist_after_tech")){
				criteria = " where test_status = 'T' and pass_fail='Pass'" ;
			}
			else 
			if ( action.equals("shortlist_after_hr")){
				criteria = " where test_status = 'HR' and pass_fail='Pass'" ;
			}
			ApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
			session.setAttribute("ApplicantTestDtlList",ApplicantTestDtlList);
			target = "/jsp/applicant_test_dtl_list.jsp";
		}
		else
		if ( action.equals("applicant_final_selected") ){     	   
			System.out.println(" i m in======applicant_final_selected");
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			session.setAttribute("selectApplicantTechList",null);
			ArrayList ApplicantTestDtlList = new ArrayList();
			String criteria = "";
			criteria = " where test_status ='confirm'";
			ApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
			session.setAttribute("ApplicantTestDtlList",ApplicantTestDtlList);
			System.out.println("ApplicantTestDtlList===="+ApplicantTestDtlList.size());
			target = "/jsp/applicant_final_selected_list.jsp";
		}
		else
		if (action.equals("applicant_call_for_tech") || action.equals("applicant_call_for_hr") || action.equals("applicant_call_for_final") ) // for both tech select as wel as Hr select
		{        
			String lApplicantId = "";
			lApplicantId = (String)request.getParameter("applicant_id");
			ArrayList prevApplicantTechList = new ArrayList();
			prevApplicantTechList = (ArrayList)session.getAttribute("selectApplicantTechList");
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
			if (action.equals("applicant_call_for_hr"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'T' and pass_fail='Pass'and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			}
			else
			if (action.equals("applicant_call_for_final"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'HR' and pass_fail='Pass'and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			} 
			else
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestDtlDBMethods.getRecordByPrimaryKey(lApplicantId); 
			int lNotAddedFlag=0;
			int lAddedFlag = 0;
			if(prevApplicantTechList != null && prevApplicantTechList.size() > 0 ){
				for( int lListSize = 1; lListSize <= prevApplicantTechList.size(); lListSize++ ){
					System.out.println("**********i m in for loop");
					ApplicantTestDtlDBObj inApplicantTestDtlDBObj = new ApplicantTestDtlDBObj();
					inApplicantTestDtlDBObj = (ApplicantTestDtlDBObj)prevApplicantTechList.get(lListSize-1);
					if( !((inApplicantTestDtlDBObj.applicant_id).equals((applicantTestDtlDBObj.applicant_id))) ){
						lNotAddedFlag = 1;
					}
					else{
						lAddedFlag = 1;
					}
				}	
				if ( lAddedFlag == 0){
					System.out.println("**********i m in add   lAddedFlag=="+lAddedFlag); 
					prevApplicantTechList.add(applicantTestDtlDBObj);
				}
				System.out.println("**********i m out of for prevApplicantTestList.size()"+prevApplicantTechList.size());
			}
			else{
				ArrayList selectApplicantTechList = new ArrayList();
				selectApplicantTechList.add(applicantTestDtlDBObj);
				session.setAttribute("selectApplicantTechList",selectApplicantTechList);
				System.out.println(" selectApplicantTestList.size()$$$$$$$="+selectApplicantTechList.size());
			}
			target = "/jsp/applicant_test_dtl_list.jsp";
		}
		else
		if (action.equals("applicant_remove_for_tech") || action.equals("applicant_remove_for_hr") || action.equals("applicant_remove_for_final")){        
			String lApplicantId = "";
			lApplicantId = (String)request.getParameter("applicant_id");
			ArrayList prevApplicantTechList = new ArrayList();
			prevApplicantTechList = (ArrayList)session.getAttribute("selectApplicantTechList");
			ApplicantTestDtlDBMethods applicantTestDtlDBMethods = new ApplicantTestDtlDBMethods(lDBUser,lDBPswd,lDBUrl);
			ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
			if (action.equals("applicant_remove_for_hr"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'T' and pass_fail='Pass'and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			}
			if (action.equals("applicant_remove_for_final"))// selecting particular record  for HR interview
			{
				ArrayList dummyApplicantTestDtlList = new ArrayList();
				String criteria = "";
				criteria = " where test_status = 'HR' and pass_fail='Pass'and applicant_id='"+lApplicantId+"' " ;
				dummyApplicantTestDtlList = (ArrayList)applicantTestDtlDBMethods.selectApplicantTestDtlByCriteria(criteria);
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)dummyApplicantTestDtlList.get(0);// it has only one record always
			}
			else
				applicantTestDtlDBObj = (ApplicantTestDtlDBObj)applicantTestDtlDBMethods.getRecordByPrimaryKey(lApplicantId); 
			for( int lListSize = 1; lListSize <= prevApplicantTechList.size(); lListSize++ ){
				ApplicantTestDtlDBObj inApplicantTestDtlDBObj = new ApplicantTestDtlDBObj();
				inApplicantTestDtlDBObj = (ApplicantTestDtlDBObj)prevApplicantTechList.get(lListSize-1);
				if((inApplicantTestDtlDBObj.applicant_id).equals(lApplicantId) ){
					int lIndex = prevApplicantTechList.indexOf(inApplicantTestDtlDBObj);
					prevApplicantTechList.remove(lIndex);
				}
			}	
			System.out.println("prevApplicantTechList.size()==="+prevApplicantTechList.size()); 
			session.setAttribute("selectApplicantTechList",prevApplicantTechList);
			target = "/jsp/applicant_test_dtl_list.jsp";
		}   
		else
		if ( action.equals("applicant_call_for_wrtn_test_submit") || action.equals("applicant_call_tech_dtl_submit") || action.equals("applicant_call_hr_dtl_submit") ) {
			target = "/jsp/applicant_test_dtl_create.jsp";
		}
	} // (action== null )

	/* forwarding the request/response to the targeted view */
    RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(target);
    requestDispatcher.forward(request, response);
} // doPost closed
}// class closed


