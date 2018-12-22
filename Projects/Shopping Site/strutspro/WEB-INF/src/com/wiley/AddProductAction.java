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
import com.wiley.*;

import java.sql.*;


public class AddProductAction extends Action {
	protected void insertProduct(ActionForm form)throws Exception {
		System.err.println("********** inside------AddProductAction********** before connection");
		String user = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			ProductForm productForm = (ProductForm)form;
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
			stmt = conn.createStatement();
			
			System.err.println("********** inside------addProductAction**********after connection");
			System.err.println("**********productForm.getCategory_id() "+productForm.getCategory_id());
			System.err.println("**********productForm.getProduct_id"+productForm.getProduct_id());
			System.err.println("****");
			StringBuffer lQueryString =	new StringBuffer("insert into OLNS_PRODUCTS ");
			
			lQueryString.append("values ("+ productForm.getProduct_id() + ", ");
			lQueryString.append(productForm.getCategory_id() + ", ");
			lQueryString.append("'"+ productForm.getName() + "' , ");
			lQueryString.append("'" + productForm.getDescription() + "' , ");
			lQueryString.append(productForm.getPrice() + ")");
			System.out.println(" Inside the AddProductActionlQueryString================"+lQueryString);
			stmt.execute(lQueryString.toString());
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
	public ActionForward execute(ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)throws IOException, ServletException {
		
		System.err.println("********** inside------addCategoryAction**********");
		// Default target to success
		String target = "success";
		if ( isCancelled(request) ){
			// Cancel pressed back to Category list
			return (mapping.findForward("success"));
		}
		
		try {
			insertProduct(form);
		}
		catch (Exception e) {
			System.err.println("Setting target to error");
			target = "error";
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("errors.database.error", e.getMessage()));
			// Report any errors
			if (!errors.empty()) {
				saveErrors(request, errors);
			}
		}
		// Forward to the appropriate View
		return (mapping.findForward(target));
	}
}