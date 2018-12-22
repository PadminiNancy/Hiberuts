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

public class CategoryListAction extends Action {
	protected ArrayList getCategories(){
		Category category = null;
		ArrayList categories = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:"+"orcl","scott","tiger");
		}
		catch(SQLException ae){
			System.out.println("Exception Caught in connection ======"+ae);
		}
		System.out.println("***** befor execute**********"); 
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from OLNS_PROD_CATEGORIES");
		System.out.println("*****befor next**********");
		while ( rs.next() ){
			System.out.println("********************");
			category = new Category();
			category.setCategory_id(new Long(rs.getLong("category_id")));
			category.setCategory(rs.getString("category"));
			categories.add(category);
			System.err.println("CategoryId : "+ category.getCategory_id()+ " Category : " + rs.getString("category"));
		}
	}
	catch (SQLException e){
		System.err.println(e.getMessage());
	}
	finally{
		if (rs != null){
		try{
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
		return categories;
}
public ActionForward execute(ActionMapping mapping
                             , ActionForm form
                             , HttpServletRequest request
                             , HttpServletResponse response)
                             throws IOException, ServletException {
	// Forward to the appropriate View
	ArrayList categories = (ArrayList)getCategories();
	System.out.println("size of ArrayList == "+categories.size());
	//request.setAttribute("categories",categories);
	HttpSession session = request.getSession();
	session.setAttribute("categories",categories);
	String target = "success";
	return (mapping.findForward(target));
	}
}