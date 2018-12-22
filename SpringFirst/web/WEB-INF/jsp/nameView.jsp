<%-- 
    Document   : nameView
    Created on : Jul 2, 2015, 3:17:02 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter</title>
    </head>
    <body>
        <h1>Enter Your Name</h1>
        <spring:nestedPath path="name">
    <form action="" method="post">
        Name:
        <spring:bind path="value">
            <input type="text" name="${status.expression}" value="${status.value}">
        </spring:bind>
        <input type="submit" value="OK">
    </form>
</spring:nestedPath>
    </body>
</html>
