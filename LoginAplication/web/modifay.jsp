<%-- 
    Document   : modifay
    Created on : Apr 25, 2014, 10:10:51 AM
    Author     : chand
--%>

<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%@page import = "vvv.*" %>
   <c:if test="${param.msg != null }">
          <b>${param.msg}</b>
   </c:if>
          
            <form action="UpdatePass" method="post">
                Username <input type="text" name="uname" value="${requestScope.data.username}" readonly="readonly"/><br>
            Password <input type="text" name="pass" value="${requestScope.data.pass}"/><br>
           <input type="submit" name="sub" value="save"/>

        </form>
           <a href="UserListServ"> <strong>Back</strong></a>
    </body>
</html>
