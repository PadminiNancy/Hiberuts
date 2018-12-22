package com.wiley;

import java.io.IOException;
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

public class GetProductAction extends Action {
	protected ActionForm buildProductForm(String inProductId,String inCategoryId) throws Exception {
		String lDBUser = "scott";
		String lDBPswd = "tiger"; 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ProductForm productForm = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl",lDBUser,lDBPswd);
			stmt = conn.createStatement();
			System.out.println();
			String lQueryString = "";
			lQueryString = "select * from OLNS_PRODUCTS " + "where product_id=" + inProductId + "";
			lQueryString = lQueryString + " and category_id=" + inCategoryId + "";
			System.out.println("in GetProductAction ====lQueryString ==: "+lQueryString);
			rs = stmt.executeQuery(lQueryString);
			if ( rs.next() ) {
				productForm = new ProductForm();
				productForm.setProduct_id(rs.getString("product_id"));
				productForm.setCategory_id(rs.getString("category_id"));
				productForm.setName(rs.getString("name"));
				productForm.setDescription(rs.getString("description"));
				productForm.setPrice(rs.getString("price"));
			}
			else {
				throw new Exception("Product Id " + inProductId + " and  Category Id " +inCategoryId+ "not found!");
			}
		}
		finally {
			if (rs != null){
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			} 
			if (conn != null) {
				conn.close();
			}
		}
		return productForm;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		// Default target to success
		String target = "success";
		if ( isCancelled(request) ) {
			// Cancel pressed back to Category list
			return (mapping.findForward(target));
		}
		try {
			// Build the CategoryForm with the Retrieved values
			System.out.println("category id=="+request.getParameter("category_id"));
			String lProductId = "";
			String lCategoryId = "";
			lProductId  = (String)request.getParameter("product_id");
			lCategoryId = (String)request.getParameter("category_id");
			form = buildProductForm(lProductId,lCategoryId);
			// Add the form to the request or session, bound to the
			// key named in the <action> attribute name
		if ("request".equals(mapping.getScope())) {
			System.out.println("************** MAPPINGS ************************=="+mapping.getAttribute());   
			request.setAttribute(mapping.getAttribute(), form);
		}
		else {
			System.out.println("************** MAPPINGS ************************=="+mapping.getAttribute()); 
			HttpSession session = request.getSession();
			session.setAttribute(mapping.getAttribute(), form);
		}
	}
	catch (Exception e){
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