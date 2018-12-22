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

public class DeleteCategoryAction extends Action {
	protected void deleteCategory( String inCategoryId ) throws Exception {
		System.err.println("///////////// i m  in delete method fast ///////////");
		String user = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
			stmt = conn.createStatement();
			System.err.println("///////////// i m  in delete method after stmt ///////////");
			StringBuffer sqlString = new StringBuffer("delete from OLNS_PROD_CATEGORIES ");
			sqlString.append(" where category_id=" + inCategoryId);
			System.out.println("Delet query == "+sqlString); 
			stmt.execute(sqlString.toString());
			System.err.println("///////////// i m  in delete method last ///////////");
		}
		finally{
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) { 
				conn.close();
			}
		}
	}
	public ActionForward execute( ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws IOException, ServletException{
		// Default target to success
		String target = "success";
		if ( isCancelled(request) ){
			// Cancel pressed back to Category list
			return (mapping.findForward("success"));
		}
		try {
			System.err.println("///////////// i m  in delete action ///////////");
			deleteCategory( request.getParameter("category_id"));
		}
		catch (Exception e) {
			System.err.println("Setting target to error");
			target = "error";
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("errors.database.error",e.getMessage()));
			// Report any errors
			if (!errors.empty()) {
				saveErrors(request, errors);
			}
		}
		// Forward to the appropriate View
		return (mapping.findForward(target));
	}
}