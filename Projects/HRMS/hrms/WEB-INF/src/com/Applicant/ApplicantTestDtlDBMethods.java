package com.Applicant;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import com.Applicant.*;

public class ApplicantTestDtlDBMethods{
	public String DBUser;
	public String DBPswd;
	public String DBUrl ;
	public ApplicantTestDtlDBMethods(){ }
	
	public ApplicantTestDtlDBMethods(String inDBUser, String inDBPswd, String inDBUrl ){
		DBUser = inDBUser ;
		DBPswd = inDBPswd;
		DBUrl  = inDBUrl;
	}
	public void initializeApplicantTestDtlDBObj(ApplicantTestDtlDBObj inApplicantTestDtlDBObj ){
		inApplicantTestDtlDBObj.test_id =  "";
		inApplicantTestDtlDBObj.test_name = "";
		inApplicantTestDtlDBObj.applicant_id= "";
		inApplicantTestDtlDBObj.applicant_name= "";
		inApplicantTestDtlDBObj.test_date = "";
		inApplicantTestDtlDBObj.test_time  = "";
		inApplicantTestDtlDBObj.present_status = "";
		inApplicantTestDtlDBObj.total_marks= 0;
		inApplicantTestDtlDBObj.marks_gained = 0;
		inApplicantTestDtlDBObj.test_status= "";
		inApplicantTestDtlDBObj.pass_fail= "";
		inApplicantTestDtlDBObj.next_round = "";
	}
	public ApplicantTestDtlDBObj getRecordByPrimaryKey(String inApplicantId){
		ApplicantTestDtlDBObj  applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
		java.util.Date date=new java.util.Date();
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from APPLICANT_TEST_DETAIL  ";
			lSqlString = lSqlString + "where applicant_id='"+inApplicantId+"' ";
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			System.out.println("lSqlString====trtrt==within getRecordByPrimaryKey== "+lSqlString);
			if( rs.next()){
				System.out.println("test id==="+rs.getString("test_id"));
				applicantTestDtlDBObj.test_id =  rs.getString("test_id");
				applicantTestDtlDBObj.test_name = rs.getString("test_name");
				applicantTestDtlDBObj.applicant_id = rs.getString("applicant_id");
				applicantTestDtlDBObj.applicant_name = rs.getString("applicant_name");

				date=rs.getDate("test_date");
				if(date!=null)
				applicantTestDtlDBObj.test_date = date.toString();

				String time=rs.getString("test_time");
				if(time!=null)
				applicantTestDtlDBObj.test_time  =time.substring(11,16);

				applicantTestDtlDBObj.present_status = rs.getString("present_status");
				applicantTestDtlDBObj.total_marks = rs.getLong("total_marks");
				applicantTestDtlDBObj.marks_gained  = rs.getLong("marks_gained");
				applicantTestDtlDBObj.test_status = rs.getString("test_status");
				applicantTestDtlDBObj.pass_fail = rs.getString("pass_fail");
				applicantTestDtlDBObj.next_round  = rs.getString("next_round");
				System.out.println("fffff==="+rs.getString("test_id"));
			}
			else{
				initializeApplicantTestDtlDBObj(applicantTestDtlDBObj);
			}
			System.out.println("fffff====="+applicantTestDtlDBObj.test_id);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return applicantTestDtlDBObj;
	}
	public ArrayList selectApplicantTestDtlByCriteria(String inCriteria){
		ArrayList ApplicantList = new ArrayList();
		java.util.Date date=new java.util.Date();
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from APPLICANT_TEST_DETAIL";
			if( inCriteria != null && inCriteria.length() > 0 ){
				lSqlString = lSqlString +" "+inCriteria+"" ;
			}
			System.out.println("Criteria===== "+inCriteria+" and query="+lSqlString);
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			while( rs.next()){
				ApplicantTestDtlDBObj  applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
				applicantTestDtlDBObj.test_id =  rs.getString("test_id");
				applicantTestDtlDBObj.test_name = rs.getString("test_name");
				applicantTestDtlDBObj.applicant_id = rs.getString("applicant_id");
				applicantTestDtlDBObj.applicant_name = rs.getString("applicant_name");
				
				date=rs.getDate("test_date");
				if(date!=null)
				applicantTestDtlDBObj.test_date = date.toString();

				String time=rs.getString("test_time");
				if(time!=null)
				applicantTestDtlDBObj.test_time  = time.substring(11,16);
				
				applicantTestDtlDBObj.present_status = rs.getString("present_status");
				applicantTestDtlDBObj.total_marks = rs.getLong("total_marks");
				applicantTestDtlDBObj.marks_gained  = rs.getLong("marks_gained");
				applicantTestDtlDBObj.test_status = rs.getString("test_status");
				applicantTestDtlDBObj.pass_fail = rs.getString("pass_fail");
				applicantTestDtlDBObj.next_round  = rs.getString("next_round");
				ApplicantList.add(applicantTestDtlDBObj);
			}
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return ApplicantList;
	}
	public int updateApplicantTestDtl(ApplicantTestDtlDBObj inApplicantTestDtlDBObj){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"update APPLICANT_TEST_DETAIL set test_date=to_date('"+inApplicantTestDtlDBObj.test_date+"','yyyy-mm-dd')  "; 
		lQuery = lQuery +" , applicant_name='"+inApplicantTestDtlDBObj.applicant_name+"' ";

		lQuery = lQuery +" , test_time=to_date('"+inApplicantTestDtlDBObj.test_time+"', 'HH24:MI') ";
		
		if( inApplicantTestDtlDBObj.present_status != null )
			lQuery = lQuery +" , present_status='"+inApplicantTestDtlDBObj.present_status+"' ";
		else 
			lQuery = lQuery +" , present_status='' ";
		lQuery = lQuery +" , total_marks="+inApplicantTestDtlDBObj.total_marks+" ";
		lQuery = lQuery +" , marks_gained ="+inApplicantTestDtlDBObj.marks_gained+" ";
		lQuery = lQuery +" , test_status='"+inApplicantTestDtlDBObj.test_status+"' ";
		if (inApplicantTestDtlDBObj.pass_fail != null)
			lQuery = lQuery +" , pass_fail='"+inApplicantTestDtlDBObj.pass_fail+"' ";
		else
			lQuery = lQuery +" , pass_fail='' ";
		if(inApplicantTestDtlDBObj.next_round != null)
		    lQuery = lQuery +" , next_round='"+inApplicantTestDtlDBObj.next_round+"' ";
		else
			lQuery = lQuery +" , next_round='' ";
		lQuery = lQuery +" where test_id='"+inApplicantTestDtlDBObj.test_id+"' ";
		lQuery = lQuery +" and test_name='"+inApplicantTestDtlDBObj.test_name+"' ";
		lQuery = lQuery +" and applicant_id='"+inApplicantTestDtlDBObj.applicant_id+"' ";
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
	public ApplicantTestDtlDBObj populateApplicantTestDtlDBObjFromReq(HttpServletRequest inReq){
		ApplicantTestDtlDBObj  applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
		applicantTestDtlDBObj.test_id   =  (String)inReq.getParameter("test_id");
		applicantTestDtlDBObj.test_name = (String)inReq.getParameter("test_name"); 
		applicantTestDtlDBObj.applicant_id = (String)inReq.getParameter("applicant_id");
		applicantTestDtlDBObj.applicant_name = (String)inReq.getParameter("applicant_name");

		applicantTestDtlDBObj.test_date  = (String)inReq.getParameter("test_date");
		applicantTestDtlDBObj.test_time   = (String)inReq.getParameter("test_time");
		
		applicantTestDtlDBObj.present_status = (String)inReq.getParameter("present_status");
		if(inReq.getParameter("total_marks") == null){
			applicantTestDtlDBObj.total_marks = 0;
		}
		else
			applicantTestDtlDBObj.total_marks = Long.parseLong((String)inReq.getParameter("total_marks"));
		if(inReq.getParameter("marks_gained") == null){
			applicantTestDtlDBObj.marks_gained = 0;
		}
		else
			applicantTestDtlDBObj.marks_gained = Long.parseLong((String)inReq.getParameter("marks_gained"));
		applicantTestDtlDBObj.test_status = (String)inReq.getParameter("test_status");
		applicantTestDtlDBObj.pass_fail = (String)inReq.getParameter("pass_fail");
		applicantTestDtlDBObj.next_round  = (String)inReq.getParameter("next_round");
		return applicantTestDtlDBObj;
	}
	
	public int insertApplicantTestDtl(ApplicantTestDtlDBObj inApplicantTestDtlDBObj){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"insert into APPLICANT_TEST_DETAIL  values ( ";
		lQuery = lQuery +" '"+inApplicantTestDtlDBObj.test_id+"'  ";
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.test_name+"'  ";
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.applicant_id+"' ";
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.applicant_name+"' ";

		lQuery = lQuery +" , to_date('"+inApplicantTestDtlDBObj.test_date+"','yyyy-mm-dd')  "; 
		lQuery = lQuery +" , to_date('"+inApplicantTestDtlDBObj.test_time+"','HH24:MI') ";
		
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.present_status+"' ";
		lQuery = lQuery +" , "+inApplicantTestDtlDBObj.total_marks+" ";
		lQuery = lQuery +" , "+inApplicantTestDtlDBObj.marks_gained+" ";
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.test_status+"' ";
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.pass_fail+"' ";
		lQuery = lQuery +" , '"+inApplicantTestDtlDBObj.next_round +"' ";
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
	
	public void deleteApplicant(String inApplicantId){
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lQuery = "";
			lQuery = lQuery +"delete from APPLICANT_TEST_DETAIL "; 
			lQuery = lQuery +" where test_id='"+inApplicantId+"' ";
			System.out.println("lSqlString===:"+lQuery);
			stmt.executeQuery(lQuery);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
	}
}