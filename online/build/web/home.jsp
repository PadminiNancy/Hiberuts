<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>
 <%response.sendRedirect("index.jsp");%>
<html:html lang="true">
    <center><h1>Welcome to online test </h1></center>
    <body  class="one"style="background-color: white">
        <form>
            <a href="login.jsp">Login</a>
            <a href="register.jsp">Register</a>
             <a href="adminlogin.jsp">Admin</a>

        </form>
    </body>
</html:html>
