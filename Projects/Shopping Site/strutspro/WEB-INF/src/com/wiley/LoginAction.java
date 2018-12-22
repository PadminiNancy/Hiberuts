package com.wiley;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;

import org.apache.struts.action.ActionError;
import javax.sql.DataSource;

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class LoginAction extends Action {
	protected String getUser(String lUserId, String lUserPswd) {
		String user = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ServletContext context = servlet.getServletContext();
		try {
			try{				                       
			     DriverManager.registerDriver(new OracleDriver());
				 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
			}
			catch(SQLException ae){
				System.out.println("Exception Caught in connection ======"+ae);
			}
			stmt = conn.createStatement();
			String lQuery = "select * from user_login where " + "user_id='" + lUserId + "' " + "and user_pswd='" + lUserPswd + "'" ;
			System.out.println("sql query==="+lQuery);
			rs = stmt.executeQuery("select * from user_login where " + "user_id='" + lUserId + "' " + "and user_pswd='" + lUserPswd + "'");
			if ( rs.next() ) {
				user = rs.getString("user_id");
				// Iterate over the results
				System.err.println("User Id : "	+ rs.getString("user_id")+ " User Pswd : " + rs.getString("user_pswd"));
			}
			else {
				System.err.println("---->User not found<----");
			}
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException sqle) {
					System.err.println(sqle.getMessage());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				}
				catch (SQLException sqle) {
					System.err.println(sqle.getMessage());
				}
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				}
				catch (SQLException sqle) {
					System.err.println(sqle.getMessage());
				}
				conn = null;
			}
		}
		return user;
	}
	public ActionForward execute(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		String user = null;
		// Default target to success
		String target = "success";
		// Use the LoginForm to get the request parameters
		String lUserId = ((LoginForm)form).getUsername();
		String lUserPswd = ((LoginForm)form).getPassword();
		System.out.println("lUserId==="+lUserId);
		System.out.println("lUserPswd==="+lUserPswd);
		user = getUser(lUserId, lUserPswd);
		System.out.println("user==="+user);
		// Set the target to failure
		if ( user == null ) {
			target = "login";
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("errors.login.unknown", lUserId));
			// Report any errors we have discovered back to the
			// original form
			if (!errors.empty()) {
				saveErrors(request, errors);
			}
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("USER", user);
		}
		// Forward to the appropriate View
		return (mapping.findForward(target));
	}
}