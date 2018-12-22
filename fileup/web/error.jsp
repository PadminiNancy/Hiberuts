<%-- 
    Document   : error
    Created on : Jan 20, 2012, 11:45:10 PM
    Author     : LG
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
     <h1><%out.println(request.getParameter("msg")); %></h1>
    </body>
</html>
