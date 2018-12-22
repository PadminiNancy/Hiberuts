<%-- 
    Document   : login
    Created on : Jan 6, 2015, 11:39:59 AM
    Author     : Nancy
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page  import="login.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="loginserv" method="POST">
            <c:if test="${param.msg!=null}">
                          ${param.msg}
             </c:if>
            <table border="0">
                <tbody>
                    <tr>
                        <td>User Name:</td>
                        <td><input type="text" name="uname" value="${data.uname}" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="text" name="pass" value="${data.pass}" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                    </tr>
                </tbody>
            </table>
            <a href="newuser.jsp"> New user registration</a>
        </form>
    </body>
</html>
