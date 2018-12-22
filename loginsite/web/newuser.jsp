<%-- 
    Document   : newuser
    Created on : Jan 6, 2015, 11:49:13 AM
    Author     : Nancy
--%>
<%@page import= "login.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>New user Registration</h1>
        <c:if test="${param.msg != null}">
			${param.msg}
	</c:if>
        <form action="NewUserServ" method="POST">
            
        <table border="0">

            <tbody>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="uname" value="${requestScope.data.uname}" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="pass" value="${requestScope.data.pass}" /></td>
                </tr>
                <tr>
                    <td>Email id:</td>
                    <td><input type="text" name="email" value="${requestScope.data.email}" /></td>
                </tr>
                <tr>
                    <td>Photograph:</td>
                    <td><input type="text" name="photo" value="${requestScope.data.photo}" /></td>
                </tr>
                <tr>

                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </tbody>
        </table>
      </form>
    </body>
</html>
