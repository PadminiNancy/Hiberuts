<%-- 
    Document   : welcome
    Created on : 09-Feb-2015, 20:37:15
    Author     : Anisha
--%>

<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
    </head>
    <body>
        <h1>hdcdjh</h1>
        <c:if test="${param.message!=null}">
 	<div class='boldred'>${param.message}</div>
 </c:if>

        



    </body>
</html>
