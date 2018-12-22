<%-- 
    Document   : userProf
    Created on : Apr 26, 2015, 8:17:25 AM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head><%@page contentType="text/html"%>


<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>

    </head>
    <body style="background-color: white">
        Welcome ${sessionScope.student.uname} <img src="uphoto/${sessionScope.student.uname}.jpg" height="120px" width="120px"/>
    </body>
</html:html>
</html>
