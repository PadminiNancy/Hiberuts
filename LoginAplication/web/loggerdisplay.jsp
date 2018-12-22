<%-- 
    Document   : loggerdisplay
    Created on : Apr 21, 2014, 10:26:35 AM
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
       <table width="600" cellpadding="3" cellspacing="0">

           <form action="SearchUser" method="post">
           <tr>
             <td>Search Username :</td><td><input type="text" name="user"/></td>
                <td><input type="submit" value="Search" name="sub"/></td>
         </tr>
           </form>

 <tr bgcolor="#dfecf7" style="font-weight:bold">
 <td>User name </td><td> password </td>
 </tr>
	 <c:forEach var="d" items="${requestScope.data}">
	 <tr>
		 <td><c:out value="${d.username}"/></td>
		 <td><c:out value="${d.pass}"/></td>
                 <td><a href="ModiServ?xx=${d.username}">change password</a></td>
                 <td><a href="DeleteLoginid?yy=${d.username}">Delete user</a></td>

	 </tr>
	 </c:forEach>
 <tr bgcolor="#dfecf7">
     <td colspan="4"><a href="homepage.jsp">Back</a></td>
 </tr>
 </table>
        
    </body>
</html>
