<%-- 
    Document   : error
    Created on : Jan 13, 2015, 3:45:29 PM
    Author     : EDS
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
        <% out.println(request.getParameter("msg")); %>
    </body>
</html>
