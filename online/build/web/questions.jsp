<%--
    Document   : loggerdisplay
    Created on : Apr 21, 2014, 10:26:35 AM
    Author     : chand
--%>
<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
 <%@page import = "com.myapp.struts.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
         <title>Questions</title>
    <jsp:include page="page/stylehead.htm" />
    </head>
    <body>
         <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/admin_topnav.html" />
       
   <c:if test="${param.msg != null }">
          <b>${param.msg}</b>
   </c:if>
       <table width="600" cellpadding="3" cellspacing="0">

         

 <tr bgcolor="#dfecf7" style="font-weight:bold">
 <td>Questions </td><td> Correct answer </td>
 </tr>
	 <c:forEach var="d" items="${requestScope.curquest}">
	 <tr>
		 <td><c:out value="${d.ques}"/></td>
		 <td><c:out value="${d.cans}"/></td>


	 </tr>
	 </c:forEach>
 <tr bgcolor="#dfecf7">
     <td colspan="4"><a href="userhome.jsp">Back</a></td>
 </tr>
 </table>
 <jsp:include page="page/footer.htm" />
<jsp:include page="page/copywrite.htm" />
    </body>
</html>
