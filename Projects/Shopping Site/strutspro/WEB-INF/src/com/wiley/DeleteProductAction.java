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

public class DeleteProductAction extends Action {
	protected void deleteProduct( String inProductId ,String inCategoryId ) throws Exception {
		System.err.println("///////////// i m  in deleteProduct method fast ///////////");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			// conn = dataSource.getConnection();
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
			stmt = conn.createStatement();
			System.err.println("///////////// i m  in delete method after stmt ///////////");
			StringBuffer sqlString = new StringBuffer("delete from OLNS_PRODUCTS ");
			sqlString.append(" where product_id=" +inProductId+" and category_id=" + inCategoryId);
			System.out.println("Delet query == "+sqlString); 
			stmt.execute(sqlString.toString());
			System.err.println("///////////// i m  in deleteProduct method last ///////////");
		}
		finally {
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
		HttpServletResponse response) throws IOException, ServletException {
		// Default target to success
		String target = "success";
		if ( isCancelled(request) ){
			// Cancel pressed back to Category list
			return (mapping.findForward("success"));
		}
		try {
			System.err.println("///////////// i m  in delete action ///////////");
			String lProductId  = "";
			String lCategoryId = "";
			lProductId = (String)request.getParameter("product_id");
			lCategoryId = (String)request.getParameter("category_id");
			deleteProduct( lProductId , lCategoryId );
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