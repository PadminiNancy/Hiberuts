package com.UserLogin;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import com.UserLogin.UserLoginDBObj;

public class UserLoginDBMethods{
	public String DBUser;
	public String DBPswd;
	public String DBUrl ;
	public UserLoginDBMethods(){ }
	public UserLoginDBMethods(String inDBUser, String inDBPswd, String inDBUrl ){
		DBUser = inDBUser ;
		DBPswd = inDBPswd;
		DBUrl  = inDBUrl;
	}
	public void initializeUserLoginDBObj(UserLoginDBObj inUserLoginDBObj ){
		inUserLoginDBObj.user_id =  "";
		inUserLoginDBObj.user_name = "";
		inUserLoginDBObj.old_pswd = "";
		inUserLoginDBObj.new_pswd = "";
	  	inUserLoginDBObj.pswd_eff_date = "";
	  	inUserLoginDBObj.pswd_exp_date = "";
	}
	public UserLoginDBObj getRecordByPrimaryKey(String inUserId, String inUserName, String inUserPswd){
		UserLoginDBObj  userLoginDBObj = new UserLoginDBObj();
		try{
			System.out.println("DBUser=="+DBUser+",DBPswd=="+DBPswd+",DBUrl=="+DBUrl);
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from HRMS_USER_LOGIN  ";
			lSqlString = lSqlString + "where user_id='"+inUserId+"' ";
			lSqlString = lSqlString + "and user_name='"+inUserName+"' ";
			lSqlString = lSqlString + "and new_pswd='"+inUserPswd+"' ";
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			System.out.println("lSqlString====trtrt==within getRecordByPrimaryKey== "+lSqlString);
			if( rs.next()){
				System.out.println("fffff==="+rs.getString("user_id"));
				userLoginDBObj.user_id =  rs.getString("user_id");
				userLoginDBObj.user_name = rs.getString("user_name");
				userLoginDBObj.old_pswd = rs.getString("old_pswd");
				userLoginDBObj.new_pswd = rs.getString("new_pswd");
				userLoginDBObj.pswd_eff_date = rs.getString("pswd_eff_date");
				userLoginDBObj.pswd_exp_date = rs.getString("pswd_exp_date");
				System.out.println("fffff==="+rs.getString("user_id"));
			}
			else{
				initializeUserLoginDBObj(userLoginDBObj);
			}
				System.out.println("fffff====="+userLoginDBObj.user_id);
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return userLoginDBObj;
	}
	
	public int updateUserLoginByPrimaryKey(UserLoginDBObj inUserLoginDBObj){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"update HRMS_USER_LOGIN set old_pswd='"+inUserLoginDBObj.old_pswd+"'  "; 
		lQuery = lQuery +" , new_pswd='"+inUserLoginDBObj.new_pswd+"' ";
		lQuery = lQuery + "where user_id='"+inUserLoginDBObj.user_id+"' ";
		lQuery = lQuery + "and user_name='"+inUserLoginDBObj.user_name+"' ";
		lQuery = lQuery + "and new_pswd='"+inUserLoginDBObj.old_pswd+"' "; 
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
	
	public UserLoginDBObj populateUserLoginDBObjFromReq(HttpServletRequest inReq){
		UserLoginDBObj  userLoginDBObj = new UserLoginDBObj();
		userLoginDBObj.user_id   =  (String)inReq.getParameter("user_id");
		userLoginDBObj.user_name = (String)inReq.getParameter("user_name"); 
		userLoginDBObj.old_pswd  = (String)inReq.getParameter("old_pswd");
     	userLoginDBObj.new_pswd  = (String)inReq.getParameter("new_pswd");
     	userLoginDBObj.pswd_eff_date = (String)inReq.getParameter("pswd_eff_date");
	    userLoginDBObj.pswd_exp_date = (String)inReq.getParameter("pswd_exp_date");
		return userLoginDBObj;
	}
}
