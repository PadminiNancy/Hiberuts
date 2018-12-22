<%--
    Document   : view
    Created on : Feb 16, 2015, 8:08:12 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head><%--
    Document   : loggerdisplay
    Created on : Apr 21, 2014, 10:26:35 AM
    Author     : chand
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import = "com.myapp.struts.*" %>
   <c:if test="${param.msg != null }">
          <b>${param.msg}</b>
   </c:if>
       <table width="600" cellpadding="3" cellspacing="0">



 <tr bgcolor="#dfecf7" style="font-weight:bold">
 <td>Questions </td><td> Level </td>
 </tr>
	 <c:forEach var="d" items="${requestScope.data}">
	 <tr>
		
		 <td><c:out value="${d.clev}"/></td>


	 </tr>
	 </c:forEach>
 <tr bgcolor="#dfecf7">
     <td colspan="4"><a href="admin.jsp">Back</a></td>
 </tr>
 </table>

    </body>
</html>

