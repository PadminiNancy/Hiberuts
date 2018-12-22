package com.Applicant;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import com.Applicant.ApplicantDBObj;

public class ApplicantDBMethods{
	public String DBUser;
	public String DBPswd;
	public String DBUrl ;
	public ApplicantDBMethods(){ }
	
	public ApplicantDBMethods(String inDBUser, String inDBPswd, String inDBUrl ){
		DBUser = inDBUser ;
		DBPswd = inDBPswd;
		DBUrl  = inDBUrl;
	}
	public void initializeApplicantDBObj(ApplicantDBObj inApplicantDBObj ){
		inApplicantDBObj.applicant_id =  "";
		inApplicantDBObj.applicant_name = "";
		inApplicantDBObj.address_1= "";
		inApplicantDBObj.address_2= "";
		inApplicantDBObj.current_location= "";
		inApplicantDBObj.email = "";
		inApplicantDBObj.phone = 0;
		inApplicantDBObj.mobile = 0;
		inApplicantDBObj.dob= "";
		inApplicantDBObj.gender = "";
		inApplicantDBObj.nationality= "";
		inApplicantDBObj.work_exp= 0;
		inApplicantDBObj.skill= "";
		inApplicantDBObj.industry= "";
		inApplicantDBObj.category= "";
		inApplicantDBObj.roles= "";
		inApplicantDBObj.current_employer= "";
		inApplicantDBObj.current_sal= 0;
		inApplicantDBObj.highest_degree= "";
		inApplicantDBObj.second_highest_degree= "";
		inApplicantDBObj.domain= "";
	}
	public ApplicantDBObj getRecordByPrimaryKey(String inApplicantId){
		ApplicantDBObj  applicantDBObj = new ApplicantDBObj();
		java.sql.Date date;
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from HRMS_APPLICANT  ";
			lSqlString = lSqlString + "where applicant_id='"+inApplicantId+"' ";
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			System.out.println("lSqlString====trtrt==within getRecordByPrimaryKey== "+lSqlString);
			if( rs.next()){
				System.out.println("fffff==="+rs.getString("applicant_id"));
				applicantDBObj.applicant_id =  rs.getString("applicant_id");
				applicantDBObj.applicant_name = rs.getString("applicant_name");
				applicantDBObj.address_1 = rs.getString("address_1");
				applicantDBObj.address_2 = rs.getString("address_2");
				applicantDBObj.current_location = rs.getString("current_location");
				applicantDBObj.email = rs.getString("email");
				applicantDBObj.phone = rs.getLong("phone");
				applicantDBObj.mobile = rs.getLong("mobile");
				
				date=rs.getDate("dob");
				applicantDBObj.dob = date.toString();
				
				applicantDBObj.gender = rs.getString("gender");
				applicantDBObj.nationality = rs.getString("nationality");
				applicantDBObj.work_exp = rs.getLong("work_exp");
				applicantDBObj.skill = rs.getString("skill");
				applicantDBObj.industry = rs.getString("industry");
				applicantDBObj.category = rs.getString("category");
				applicantDBObj.roles = rs.getString("roles");
				applicantDBObj.current_employer = rs.getString("current_employer");
				applicantDBObj.current_sal = rs.getDouble("current_sal");
				applicantDBObj.highest_degree = rs.getString("highest_degree");
				applicantDBObj.second_highest_degree = rs.getString("second_highest_degree");
				applicantDBObj.domain = rs.getString("domain");
				System.out.println("fffff==="+rs.getString("applicant_id"));
			}
			else{
				initializeApplicantDBObj(applicantDBObj);
			}
			System.out.println("fffff====="+applicantDBObj.applicant_id);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return applicantDBObj;
	}
	public ArrayList selectApplicantByCriteria(String inCriteria){
		ArrayList ApplicantList = new ArrayList();
		java.sql.Date date;
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from HRMS_APPLICANT  ";
			if( inCriteria != null && inCriteria.length() > 0 ){
				lSqlString = lSqlString +" "+inCriteria+"" ;
			}
			System.out.println("Criteria===== "+inCriteria+" and query="+lSqlString);
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			while( rs.next()){
				ApplicantDBObj  applicantDBObj = new ApplicantDBObj();
				applicantDBObj.applicant_id =  rs.getString("applicant_id");
				applicantDBObj.applicant_name = rs.getString("applicant_name");
				applicantDBObj.address_1 = rs.getString("address_1");
				applicantDBObj.address_2 = rs.getString("address_2");
				applicantDBObj.current_location = rs.getString("current_location");
				applicantDBObj.email = rs.getString("email");
				applicantDBObj.phone = rs.getLong("phone");
				applicantDBObj.mobile = rs.getLong("mobile");
				date=rs.getDate("dob");
				applicantDBObj.dob = date.toString();
				applicantDBObj.gender = rs.getString("gender");
				applicantDBObj.nationality = rs.getString("nationality");
				applicantDBObj.work_exp = rs.getLong("work_exp");
				applicantDBObj.skill = rs.getString("skill");
				applicantDBObj.industry = rs.getString("industry");
				applicantDBObj.category = rs.getString("category");
				applicantDBObj.roles = rs.getString("roles");
				applicantDBObj.current_employer = rs.getString("current_employer");
				applicantDBObj.current_sal = rs.getDouble("current_sal");
				applicantDBObj.highest_degree = rs.getString("highest_degree");
				applicantDBObj.second_highest_degree = rs.getString("second_highest_degree");
				applicantDBObj.domain = rs.getString("domain");
				
				ApplicantList.add(applicantDBObj);
			}
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return ApplicantList;
	}
	
	public int updateApplicant(ApplicantDBObj inApplicantDBObj){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"update HRMS_APPLICANT set email='"+inApplicantDBObj.email+"'  "; 
		lQuery = lQuery +" , applicant_name='"+inApplicantDBObj.applicant_name+"' ";
		lQuery = lQuery +" , address_1='"+inApplicantDBObj.address_1+"' ";
		lQuery = lQuery +" , address_2='"+inApplicantDBObj.address_2+"' ";
		lQuery = lQuery +" , current_location='"+inApplicantDBObj.current_location+"' ";
		lQuery = lQuery +" , phone="+inApplicantDBObj.phone+" ";
		lQuery = lQuery +" , mobile="+inApplicantDBObj.mobile+" ";
		lQuery = lQuery +" , dob=to_date('"+inApplicantDBObj.dob+"','yyyy-mm-dd') ";
		lQuery = lQuery +" , gender='"+inApplicantDBObj.gender+"' ";
		lQuery = lQuery +" , nationality='"+inApplicantDBObj.nationality+"' ";
		lQuery = lQuery +" , work_exp="+inApplicantDBObj.work_exp+" ";
		lQuery = lQuery +" , skill='"+inApplicantDBObj.skill+"' ";
		lQuery = lQuery +" , industry='"+inApplicantDBObj.industry+"' ";
		lQuery = lQuery +" , category='"+inApplicantDBObj.category+"' ";
		lQuery = lQuery +" , roles='"+inApplicantDBObj.roles+"' ";
		lQuery = lQuery +" , current_employer='"+inApplicantDBObj.current_employer+"' ";
		lQuery = lQuery +" , current_sal="+inApplicantDBObj.current_sal+" ";
		lQuery = lQuery +" , highest_degree='"+inApplicantDBObj.highest_degree+"' ";
		lQuery = lQuery +" , second_highest_degree='"+inApplicantDBObj.second_highest_degree+"' ";
		lQuery = lQuery +" , domain='"+inApplicantDBObj.domain+"' ";
		lQuery = lQuery +" where applicant_id='"+inApplicantDBObj.applicant_id+"' ";
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
	public ApplicantDBObj populateApplicantDBObjFromReq(HttpServletRequest inReq){
		ApplicantDBObj  applicantDBObj = new ApplicantDBObj();
		applicantDBObj.applicant_id   =  (String)inReq.getParameter("applicant_id");
		applicantDBObj.applicant_name = (String)inReq.getParameter("applicant_name"); 
		applicantDBObj.address_1 = (String)inReq.getParameter("address_1");
		applicantDBObj.address_2 = (String)inReq.getParameter("address_2");
		applicantDBObj.current_location = (String)inReq.getParameter("current_location");
		applicantDBObj.email  = (String)inReq.getParameter("email");
		applicantDBObj.phone  = Long.parseLong((String)inReq.getParameter("phone"));
		applicantDBObj.mobile = Long.parseLong((String)inReq.getParameter("mobile"));
		applicantDBObj.dob = (String)inReq.getParameter("dob");
		applicantDBObj.gender = (String)inReq.getParameter("gender");
		applicantDBObj.nationality = (String)inReq.getParameter("nationality");
		applicantDBObj.work_exp = Long.parseLong((String)inReq.getParameter("work_exp"));
		applicantDBObj.skill = (String)inReq.getParameter("skill");
		applicantDBObj.industry = (String)inReq.getParameter("industry");
		applicantDBObj.category = (String)inReq.getParameter("category");
		applicantDBObj.roles = (String)inReq.getParameter("roles");
		applicantDBObj.current_employer = (String)inReq.getParameter("current_employer");
		applicantDBObj.current_sal = Double.parseDouble((String)inReq.getParameter("current_sal"));
		applicantDBObj.highest_degree = (String)inReq.getParameter("highest_degree");
		applicantDBObj.second_highest_degree = (String)inReq.getParameter("second_highest_degree");
		applicantDBObj.domain = (String)inReq.getParameter("domain");
		return applicantDBObj;
	}
	
	public int insertApplicant(ApplicantDBObj inApplicantDBObj){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"insert into HRMS_APPLICANT  values ( ";
		lQuery = lQuery +" '"+inApplicantDBObj.applicant_id+"'  ";
		lQuery = lQuery +" , '"+inApplicantDBObj.applicant_name+"'  ";
		lQuery = lQuery +" , '"+inApplicantDBObj.address_1+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.address_2+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.email+"'  "; 
		lQuery = lQuery +" , "+inApplicantDBObj.phone+" ";
		lQuery = lQuery +" , "+inApplicantDBObj.mobile+" ";
		lQuery = lQuery +" , to_date('"+inApplicantDBObj.dob+"','yyyy-mm-dd')";
		lQuery = lQuery +" , '"+inApplicantDBObj.gender+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.nationality+"' ";
		lQuery = lQuery +" , "+inApplicantDBObj.work_exp+" ";
		lQuery = lQuery +" , '"+inApplicantDBObj.skill+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.industry+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.category+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.roles+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.current_employer+"' ";
		lQuery = lQuery +" , "+inApplicantDBObj.current_sal+" ";
		lQuery = lQuery +" , '"+inApplicantDBObj.highest_degree+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.second_highest_degree+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.domain+"' ";
		lQuery = lQuery +" , '"+inApplicantDBObj.current_location+"' ";
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
			lQuery = lQuery +"delete from HRMS_APPLICANT "; 
			lQuery = lQuery +" where applicant_id='"+inApplicantId+"' ";
			System.out.println("lSqlString===:"+lQuery);
			stmt.executeQuery(lQuery);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
	}
}