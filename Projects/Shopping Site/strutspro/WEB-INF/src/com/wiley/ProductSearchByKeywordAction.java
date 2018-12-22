package com.wiley;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;

import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public class ProductSearchByKeywordAction extends Action {
	protected ArrayList getProducts( String inSearchKeyword){
		Product product = null;
		ArrayList products = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
		}
		catch(SQLException ae){
			System.out.println("Exception Caught in connection ======"+ae);
		}
		System.out.println("***** befor execute**********"); 
		stmt = conn.createStatement();
		String lQueryString = null;
		if( inSearchKeyword != null && inSearchKeyword.length() > 0 ) 	{
			lQueryString = "select * from OLNS_PRODUCTS where name LIKE '%"+inSearchKeyword.trim()+"%' ";
			lQueryString = lQueryString + " OR description LIKE '%"+inSearchKeyword.trim()+"%' ";
		}
		else {
			lQueryString = "select * from OLNS_PRODUCTS";
		} 
		rs = stmt.executeQuery(lQueryString);
		System.out.println("*****befor next********** lQueryString="+lQueryString);
		while ( rs.next() ){
			System.out.println("********************");
			product = new Product();
			product.setProduct_id(new Long(rs.getLong("product_id")));  
			product.setCategory_id(new Long(rs.getLong("category_id")));
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("description"));
			product.setPrice(new Double(rs.getDouble("price")));
			products.add(product);
			System.err.println("ProductId : "+ product.getProduct_id()+ " Category Id : " + rs.getString("category_id"));
		}
	}
	catch (SQLException e){
		System.err.println(e.getMessage());
	}
	finally{
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
			try{
				stmt.close();
			}
			catch (SQLException sqle){
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
	return products;
}

public ActionForward execute(ActionMapping mapping,
							ActionForm form,
							HttpServletRequest request,
							HttpServletResponse response)throws IOException, ServletException {
	// Forward to the appropriate View
	String target = "success";
	System.out.println("i am in product search by keyword");
	String lSearchKeyword = "";
	lSearchKeyword = (String)request.getParameter("search_keyword");
	System.out.println("lSearchKeyword == "+lSearchKeyword);
	ArrayList products = (ArrayList)getProducts(lSearchKeyword);
	System.out.println("size of ArrayList == "+products.size());
	if ("request".equals(mapping.getScope())) {
		System.out.println("scope =request==== "+mapping.getScope()); 
		request.setAttribute("products",products);
	}
	else {
		System.out.println("scope ===session== "+mapping.getScope());
		HttpSession session = request.getSession();
		session.setAttribute("products", products);
	}
	return (mapping.findForward(target));
}
}