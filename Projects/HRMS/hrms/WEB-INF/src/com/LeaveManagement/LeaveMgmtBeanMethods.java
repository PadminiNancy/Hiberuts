package com.LeaveManagement;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import com.LeaveManagement.LeaveRequest;

public class LeaveMgmtBeanMethods{
	public String DBUser;
	public String DBPswd;
	public String DBUrl ;
	public LeaveMgmtBeanMethods(){ }
	public LeaveMgmtBeanMethods(String inDBUser, String inDBPswd, String inDBUrl ){
		DBUser = inDBUser ;
		DBPswd = inDBPswd;
		DBUrl  = inDBUrl;
	}
	public void initializeLeaveRequest(LeaveRequest inLeaveRequest ){
		inLeaveRequest.req_id =""; 
		inLeaveRequest.emp_id ="";         
		inLeaveRequest.emp_name ="";       
		inLeaveRequest.today_date="";   
		inLeaveRequest.level_id="";
		inLeaveRequest.dept_id="";
		inLeaveRequest.from_date="";   
		inLeaveRequest.to_date="";   
		inLeaveRequest.days= 0;   
		inLeaveRequest.reason="";  
		inLeaveRequest.leave_type=""; 
		inLeaveRequest.activity_1="";
		inLeaveRequest.activity_2="";
		inLeaveRequest.activity_3="";
		inLeaveRequest.person_1="";
		inLeaveRequest.person_2="";
		inLeaveRequest.person_3="";
		inLeaveRequest.detail_1="";
		inLeaveRequest.detail_2="";
		inLeaveRequest.detail_3="";
		inLeaveRequest.leave_status="";
		inLeaveRequest.remark="";
		inLeaveRequest.address="";
	}
	public LeaveRequest getRecordByPrimaryKey(String inReqId, String inEmpId){
		LeaveRequest  leaveRequest = new LeaveRequest();
		java.sql.Date date;
		try{
			System.out.println("DBUser=="+DBUser+",DBPswd=="+DBPswd+",DBUrl=="+DBUrl);
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from LEAVE_REQUEST  ";
			lSqlString = lSqlString + "where req_id='"+inReqId+"' ";
			lSqlString = lSqlString + "and emp_id='"+inEmpId+"' ";
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			System.out.println("lSqlString====trtrt==within getRecordByPrimaryKey== "+lSqlString);
			if( rs.next()){
				System.out.println("fffff==="+rs.getString("emp_id"));
				leaveRequest.req_id   =  (String)rs.getString("req_id");
				leaveRequest.emp_id   =  (String)rs.getString("emp_id");
				leaveRequest.emp_name = (String)rs.getString("emp_name"); 
				
				date=rs.getDate("today_date");
				leaveRequest.today_date  = date.toString();
				date=rs.getDate("from_date");
				leaveRequest.from_date  = date.toString();
				date=rs.getDate("to_date");
				leaveRequest.to_date = date.toString();

				
				leaveRequest.level_id = (String)rs.getString("level_id");
				leaveRequest.dept_id = (String)rs.getString("dept_id");
				leaveRequest.days =    rs.getInt("days");
				leaveRequest.reason = (String)rs.getString("reason");
				leaveRequest.leave_type = (String)rs.getString("leave_type");
				leaveRequest.activity_1 = (String)rs.getString("activity_1");
				leaveRequest.activity_2 = (String)rs.getString("activity_2");
				leaveRequest.activity_3 = (String)rs.getString("activity_3");
				leaveRequest.person_1 = (String)rs.getString("person_1");
				leaveRequest.person_2 = (String)rs.getString("person_2");
				leaveRequest.person_3 = (String)rs.getString("person_3");
				leaveRequest.detail_1 = (String)rs.getString("detail_1");
				leaveRequest.detail_2 = (String)rs.getString("detail_2");
				leaveRequest.detail_3 = (String)rs.getString("detail_3");
				leaveRequest.leave_status = (String)rs.getString("leave_status");
				leaveRequest.address = (String)rs.getString("address");
				leaveRequest.remark = (String)rs.getString("remark");
				System.out.println("fffff==="+rs.getString("emp_id"));
			}
			else{
				initializeLeaveRequest(leaveRequest);
			}
			System.out.println("fffff====="+leaveRequest.emp_id);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return leaveRequest;
	}
	public ArrayList selectLeaveRequestByCriteria(String inCriteria) {
		ArrayList LeaveRequestList = new ArrayList();
		java.sql.Date date;
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from LEAVE_REQUEST  ";
			if( inCriteria != null && inCriteria.length() > 0 ){
				lSqlString = lSqlString +" "+inCriteria+"" ;
			}
			System.out.println("Criteria===== "+inCriteria+" and query="+lSqlString);
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			while( rs.next()){
				LeaveRequest  leaveRequest = new LeaveRequest();
				leaveRequest.req_id   =  (String)rs.getString("req_id");
				leaveRequest.emp_id   =  (String)rs.getString("emp_id");
				leaveRequest.emp_name = (String)rs.getString("emp_name"); 

				date=rs.getDate("today_date");
				leaveRequest.today_date  = date.toString();
				date=rs.getDate("from_date");
				leaveRequest.from_date  = date.toString();
				date=rs.getDate("to_date");
				leaveRequest.to_date = date.toString();

				leaveRequest.level_id = (String)rs.getString("level_id");
				leaveRequest.dept_id = (String)rs.getString("dept_id");
				leaveRequest.days =    rs.getInt("days");
				leaveRequest.reason = (String)rs.getString("reason");
				leaveRequest.leave_type = (String)rs.getString("leave_type");
				leaveRequest.activity_1 = (String)rs.getString("activity_1");
				leaveRequest.activity_2 = (String)rs.getString("activity_2");
				leaveRequest.activity_3 = (String)rs.getString("activity_3");
				leaveRequest.person_1 = (String)rs.getString("person_1");
				leaveRequest.person_2 = (String)rs.getString("person_2");
				leaveRequest.person_3 = (String)rs.getString("person_3");
				leaveRequest.detail_1 = (String)rs.getString("detail_1");
				leaveRequest.detail_2 = (String)rs.getString("detail_2");
				leaveRequest.detail_3 = (String)rs.getString("detail_3");
				leaveRequest.leave_status = (String)rs.getString("leave_status");
				leaveRequest.address = (String)rs.getString("address");
				leaveRequest.remark = (String)rs.getString("remark");
				LeaveRequestList.add(leaveRequest);
			}
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return LeaveRequestList;
	}
	public int updateLeaveRequestByPrimaryKey(LeaveRequest inLeaveRequest){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"update LEAVE_REQUEST set emp_name='"+inLeaveRequest.emp_name+"'  "; 

		lQuery = lQuery +" , today_date=to_date('"+inLeaveRequest.today_date+"','yyyy-mm-dd') ";

		lQuery = lQuery +" , level_id='"+inLeaveRequest.level_id+"' ";
		lQuery = lQuery +" , dept_id='"+inLeaveRequest.dept_id+"' ";

		lQuery = lQuery +" , from_date=to_date('"+inLeaveRequest.from_date+"', 'yyyy-mm-dd') ";
		lQuery = lQuery +" , to_date=to_date('"+inLeaveRequest.to_date+"', 'yyyy-mm-dd') ";

		lQuery = lQuery +" , days='"+inLeaveRequest.days+"' ";
		lQuery = lQuery +" , reason='"+inLeaveRequest.reason+"' ";
		lQuery = lQuery +" , leave_type='"+inLeaveRequest.leave_type+"' ";
		lQuery = lQuery +" , activity_1='"+inLeaveRequest.activity_1+"' ";
		lQuery = lQuery +" , activity_2='"+inLeaveRequest.activity_2+"' ";
		lQuery = lQuery +" , activity_3='"+inLeaveRequest.activity_3+"' ";
		lQuery = lQuery +" , person_1='"+inLeaveRequest.person_1+"' ";
		lQuery = lQuery +" , person_2='"+inLeaveRequest.person_2+"' ";
		lQuery = lQuery +" , person_3='"+inLeaveRequest.person_3+"' ";
		lQuery = lQuery +" , detail_1='"+inLeaveRequest.detail_1+"' ";
		lQuery = lQuery +" , detail_2='"+inLeaveRequest.detail_2+"' ";
		lQuery = lQuery +" , detail_3='"+inLeaveRequest.detail_3+"' ";
		lQuery = lQuery +" , address='"+inLeaveRequest.address+"' ";
		lQuery = lQuery +" , remark='"+inLeaveRequest.remark+"' ";
		lQuery = lQuery +" , leave_status='"+inLeaveRequest.leave_status+"' ";
		lQuery = lQuery + "where req_id='"+inLeaveRequest.req_id+"' ";
		lQuery = lQuery + "and emp_id='"+inLeaveRequest.emp_id+"' ";
		System.out.println("lSqlString===:"+lQuery);
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			recupd  = stmt.executeUpdate(lQuery);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return recupd;
	}
	public LeaveRequest populateLeaveRequestFromReq(HttpServletRequest inReq){
		LeaveRequest  leaveRequest = new LeaveRequest();
		leaveRequest.req_id   =  (String)inReq.getParameter("req_id");
		leaveRequest.emp_id   =  (String)inReq.getParameter("emp_id");
		leaveRequest.emp_name = (String)inReq.getParameter("emp_name"); 
		leaveRequest.today_date  = (String)inReq.getParameter("today_date");
		leaveRequest.from_date  = (String)inReq.getParameter("from_date");
		leaveRequest.to_date = (String)inReq.getParameter("to_date");
		leaveRequest.level_id = (String)inReq.getParameter("level_id");
		leaveRequest.dept_id = (String)inReq.getParameter("dept_id");
		leaveRequest.days = Integer.parseInt((String)inReq.getParameter("days"));
		leaveRequest.reason = (String)inReq.getParameter("reason");
		leaveRequest.leave_type = (String)inReq.getParameter("leave_type");
		leaveRequest.activity_1 = (String)inReq.getParameter("activity_1");
		leaveRequest.activity_2 = (String)inReq.getParameter("activity_2");
		leaveRequest.activity_3 = (String)inReq.getParameter("activity_3");
		leaveRequest.person_1 = (String)inReq.getParameter("person_1");
		leaveRequest.person_2 = (String)inReq.getParameter("person_2");
		leaveRequest.person_3 = (String)inReq.getParameter("person_3");
		leaveRequest.detail_1 = (String)inReq.getParameter("detail_1");
		leaveRequest.detail_2 = (String)inReq.getParameter("detail_2");
		leaveRequest.detail_3 = (String)inReq.getParameter("detail_3");
		leaveRequest.leave_status = (String)inReq.getParameter("leave_status");
		leaveRequest.address = (String)inReq.getParameter("address");
		leaveRequest.remark = (String)inReq.getParameter("remark");
		return leaveRequest;
	}
	public int insertLeaveRequest(LeaveRequest inLeaveRequest){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"insert into LEAVE_REQUEST  values ( ";
		lQuery = lQuery +" '"+inLeaveRequest.req_id+"'  ";
		lQuery = lQuery +" , '"+inLeaveRequest.emp_id+"'  ";
		lQuery = lQuery +" , '"+inLeaveRequest.emp_name+"'  ";

		lQuery = lQuery +" , to_date('"+inLeaveRequest.today_date+"','yyyy-mm-dd')  "; 
		lQuery = lQuery +" , '"+inLeaveRequest.level_id+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.dept_id+"' ";
		
		lQuery = lQuery +" , to_date('"+inLeaveRequest.from_date+"', 'yyyy-mm-dd') ";
		lQuery = lQuery +" , to_date('"+inLeaveRequest.to_date+"','yyyy-mm-dd') ";
		
		lQuery = lQuery +" , "+inLeaveRequest.days+" ";
		lQuery = lQuery +" , '"+inLeaveRequest.reason+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.leave_type+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.activity_1+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.activity_2+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.activity_3+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.person_1+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.person_2+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.person_3+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.detail_1+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.detail_2+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.detail_3+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.address+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.remark+"' ";
		lQuery = lQuery +" , '"+inLeaveRequest.leave_status+"' ";
		lQuery = lQuery + " )";
		System.out.println("lSqlString===:"+lQuery);
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			recupd  = stmt.executeUpdate(lQuery);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return recupd;
	}
}