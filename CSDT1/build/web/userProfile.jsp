<%-- 
    Document   : userProfile
    Created on : Jun 26, 2015, 2:29:24 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
       <%@ include file="header.html"%>
       <%@ include file="menu.html"%>
       <%

          String uname = request.getParameter("uname");
          String pass = request.getParameter("pass");
          String rpass = request.getParameter("rpass");
          String dob = request.getParameter("dob");
          String quali = request.getParameter("quali");
          String clg = request.getParameter("clg");
          try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
           Statement st = con.createStatement();
           if(rpass.equals(pass)){
           st.executeUpdate("Insert into Studdetail values('"+uname+"','"+pass+"','"+dob+"','"+quali+"','"+clg+"')");
            System.out.println("You are Successfully registered!!!!!!!!!!!!");
           }
           else
               response.sendRedirect("register.jsp?msg="+"Unmatch password");
           con.commit();
           con.close();
          }
          catch(Exception e)
                {
               out.println(e.toString());
              }

       %>
      
      
       <%@ include file="footer.html"%>
    </body>

</html>
