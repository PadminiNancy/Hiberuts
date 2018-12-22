package com.Payroll;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import com.Payroll.EmployeeAgreement;

public class PayrollBeanMethods{
	public String DBUser;
	public String DBPswd;
	public String DBUrl ;
	public PayrollBeanMethods(){ }
	
	public PayrollBeanMethods(String inDBUser, String inDBPswd, String inDBUrl ){
		DBUser = inDBUser ;
		DBPswd = inDBPswd;
		DBUrl  = inDBUrl;
	}
	public void initializeEmployeeAgreement(EmployeeAgreement inEmployeeAgreement){
		inEmployeeAgreement.emp_id = "";        
		inEmployeeAgreement.emp_name = "";      
		inEmployeeAgreement.level_id = "";      
		inEmployeeAgreement.allowance_type ="" ;
		inEmployeeAgreement.allowance_name ="";
		inEmployeeAgreement.amt  = 0;          
		inEmployeeAgreement.taxable  ="";      
		inEmployeeAgreement.percentage =  0;  
		inEmployeeAgreement.agreement_date = "";
	}
	public EmployeeAgreement getEmployeeAgreementRecord(String inEmpId, String inAllowanceName){
		EmployeeAgreement  employeeAgreement = new EmployeeAgreement();
		java.sql.Date date;
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from EMPLOYEE_AGREEMENT  ";
			lSqlString = lSqlString + "where emp_id='"+inEmpId+"' ";
			lSqlString = lSqlString + "and allowance_name='"+inAllowanceName+"' ";
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			System.out.println("lSqlString====trtrt==within getRecordByPrimaryKey== "+lSqlString);
			if( rs.next()){
				System.out.println("fffff==="+rs.getString("emp_id"));
				employeeAgreement.emp_id   =  (String)rs.getString("emp_id");
				employeeAgreement.emp_name = (String)rs.getString("emp_name"); 
				employeeAgreement.level_id = (String)rs.getString("level_id");
				employeeAgreement.allowance_type = (String)rs.getString("allowance_type");
				employeeAgreement.allowance_name =    rs.getString("allowance_name");
				employeeAgreement.amt = rs.getDouble("amt");
				employeeAgreement.taxable = (String)rs.getString("taxable");
				employeeAgreement.percentage = rs.getDouble("percentage");
				date=rs.getDate("agreement_date");
				if(date!=null)
				employeeAgreement.agreement_date = date.toString();
				System.out.println("fffff==="+rs.getString("emp_id"));
			}
			else{
				initializeEmployeeAgreement(employeeAgreement);
			}
			System.out.println("fffff====="+employeeAgreement.emp_id);
			if(rs != null)
				rs.close();
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return employeeAgreement;
	}
	public ArrayList selectEmployeeAgreementByCriteria(String inCriteria) {
		ArrayList EmployeeAgreementList = new ArrayList();
		java.sql.Date date;
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from EMPLOYEE_AGREEMENT  ";
			if( inCriteria != null && inCriteria.length() > 0 ){
				lSqlString = lSqlString +" "+inCriteria+"" ;
			}
			System.out.println("Criteria===== "+inCriteria+" and query="+lSqlString);
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			while( rs.next()){
				EmployeeAgreement  employeeAgreement = new EmployeeAgreement();
				employeeAgreement.emp_id   =  (String)rs.getString("emp_id");
				employeeAgreement.emp_name = (String)rs.getString("emp_name"); 
				employeeAgreement.level_id = (String)rs.getString("level_id");
				employeeAgreement.allowance_type = (String)rs.getString("allowance_type");
				employeeAgreement.allowance_name =    rs.getString("allowance_name");
				employeeAgreement.amt = rs.getDouble("amt");
				employeeAgreement.taxable = (String)rs.getString("taxable");
				employeeAgreement.percentage = rs.getDouble("percentage");
				date=rs.getDate("agreement_date");
				if(date!=null)
				employeeAgreement.agreement_date = date.toString();
				EmployeeAgreementList.add(employeeAgreement);
			}
			if(rs != null)
				rs.close();
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return EmployeeAgreementList;
	}
	public int updateEmployeeAgreementByPrimaryKey(EmployeeAgreement inEmployeeAgreement){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"update EMPLOYEE_AGREEMENT set emp_name='"+inEmployeeAgreement.emp_name+"'  "; 
		lQuery = lQuery +" , level_id='"+inEmployeeAgreement.level_id+"' ";
		lQuery = lQuery +" , allowance_type='"+inEmployeeAgreement.allowance_type+"' ";
		lQuery = lQuery +" , amt="+inEmployeeAgreement.amt+" ";
		lQuery = lQuery +" , taxable='"+inEmployeeAgreement.taxable+"' ";
		lQuery = lQuery +" , percentage="+inEmployeeAgreement.percentage+" ";

		lQuery = lQuery +" , agreement_date=to_date('"+inEmployeeAgreement.agreement_date+"','yyyy-mm-dd') ";
		lQuery = lQuery + "where emp_id='"+inEmployeeAgreement.emp_id+"' ";
		lQuery = lQuery + "and allowance_name='"+inEmployeeAgreement.allowance_name+"' ";
		System.out.println("lSqlString===:"+lQuery);
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			recupd  = stmt.executeUpdate(lQuery);
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return recupd;
	}
	public EmployeeAgreement populateEmployeeAgreementFromReq(HttpServletRequest inReq){
		EmployeeAgreement  employeeAgreement = new EmployeeAgreement();
		employeeAgreement.emp_id   =  (String)inReq.getParameter("emp_id");
		employeeAgreement.emp_name = (String)inReq.getParameter("emp_name"); 
		employeeAgreement.level_id = (String)inReq.getParameter("level_id");
		employeeAgreement.allowance_type = (String)inReq.getParameter("allowance_type");
		employeeAgreement.allowance_name =    inReq.getParameter("allowance_name");
		if( (String)inReq.getParameter("amt") != null && ((String)inReq.getParameter("amt")).length() > 0 )
			employeeAgreement.amt = Double.parseDouble((String)inReq.getParameter("amt")) ;
		else
			employeeAgreement.amt = 0;
		employeeAgreement.taxable = (String)inReq.getParameter("taxable");
		if( (String)inReq.getParameter("percentage") != null && ((String)inReq.getParameter("percentage")).length() > 0)
			employeeAgreement.percentage = Double.parseDouble((String)inReq.getParameter("percentage"));
		else
			employeeAgreement.percentage = 0;
		employeeAgreement.agreement_date = (String)inReq.getParameter("agreement_date");
		return employeeAgreement;
	}
	public int insertEmployeeAgreement(EmployeeAgreement inEmployeeAgreement){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"insert into EMPLOYEE_AGREEMENT  values ( ";
		lQuery = lQuery +" '"+inEmployeeAgreement.emp_id+"'  ";
		lQuery = lQuery +" , '"+inEmployeeAgreement.emp_name+"'  ";
		lQuery = lQuery +" , '"+inEmployeeAgreement.level_id+"' ";
		lQuery = lQuery +" , '"+inEmployeeAgreement.allowance_type+"' ";
		lQuery = lQuery +" , '"+inEmployeeAgreement.allowance_name+"' ";
		lQuery = lQuery +" , "+inEmployeeAgreement.amt+" ";
		lQuery = lQuery +" , '"+inEmployeeAgreement.taxable+"' ";
		lQuery = lQuery +" , "+inEmployeeAgreement.percentage+" ";
		lQuery = lQuery +" , to_date('"+inEmployeeAgreement.agreement_date+"','yyyy-mm-dd') ";
		lQuery = lQuery + " )";
		System.out.println("lSqlString===:"+lQuery);
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			recupd  = stmt.executeUpdate(lQuery);
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return recupd;
	}
	public int insertEmpSal(EmpSal inEmpSal){
		int recupd = 0; 
		String lQuery = "";
		lQuery = lQuery +"insert into EMP_SAL  values ( ";
		lQuery = lQuery +" '"+inEmpSal.emp_id+"'  ";
		lQuery = lQuery +" , "+inEmpSal.year+"  ";
		lQuery = lQuery +" , "+inEmpSal.month+" ";
		lQuery = lQuery +" , '"+inEmpSal.allowance_type+"' ";
		lQuery = lQuery +" , '"+inEmpSal.allowance_name+"' ";
		lQuery = lQuery +" , "+inEmpSal.amt+" ";
		lQuery = lQuery +" , '"+inEmpSal.taxable+"' ";
		lQuery = lQuery +" , "+inEmpSal.percentage+" ";
		lQuery = lQuery + " )";
		System.out.println("lSqlString===:"+lQuery);
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			recupd  = stmt.executeUpdate(lQuery);
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return recupd;
	}
	public ArrayList selectEmpSalByCriteria(String inCriteria){
		ArrayList EmpSalList = new ArrayList();
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lSqlString =	"select * from EMP_SAL  ";
			if( inCriteria != null && inCriteria.length() > 0 ){
				lSqlString = lSqlString +" "+inCriteria+"" ;
			}
			System.out.println("Criteria===== "+inCriteria+" and query="+lSqlString);
			ResultSet rs  = null;
			rs  = stmt.executeQuery(lSqlString);
			while( rs.next()){
				EmpSal  empSal = new EmpSal();
				empSal.emp_id   =  (String)rs.getString("emp_id");
				empSal.year = rs.getInt("year"); 
				empSal.month = rs.getInt("month");
				empSal.allowance_type = (String)rs.getString("allowance_type");
				empSal.allowance_name =    rs.getString("allowance_name");
				empSal.amt = rs.getDouble("amt");
				empSal.taxable = (String)rs.getString("taxable");
				empSal.percentage = rs.getDouble("percentage");
				EmpSalList.add(empSal);
			}
			if(rs != null)
				rs.close();
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
		return EmpSalList;
	}
	public void deleteEmployeeAgreement(String inEmpId , String inAllowanceName){
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn= DriverManager.getConnection(DBUrl,DBUser,DBPswd);
			Statement stmt = conn.createStatement();
			String lQuery = "";
			lQuery = lQuery +"delete from EMPLOYEE_AGREEMENT "; 
			lQuery = lQuery +" where emp_id='"+inEmpId+"' and allowance_name='"+inAllowanceName+"' ";
			System.out.println("lSqlString===:"+lQuery);
			stmt.executeQuery(lQuery);
			if( conn != null)
				conn.close();
		}
		catch(SQLException  ex){
			ex.printStackTrace();
		}
	}
}

