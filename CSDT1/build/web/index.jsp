<%-- 
    Document   : index
    Created on : Jun 23, 2015, 1:41:44 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
             out.print("Today is "+java.util.Calendar.getInstance().getTime());
             String n = request.getParameter("text1");
             //HttpSession hs = request.getSession();
             session.setAttribute("name",n);
             out.println(n);
             %>

        </h1>
            
    </body>
</html>
