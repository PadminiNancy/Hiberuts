<%--
    Document   : loggerdisplay
    Created on : Apr 21, 2014, 10:26:35 AM
    Author     : chand
--%>
<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">

   <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>

    <body class="one">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/user_topnav.html" />
     <center>
        <h1 class="blue"> Previous Tests </h1>

   <c:if test="${param.msg != null }">
          <b>${param.msg}</b>
   </c:if>
          <table class="Alter" id="grid" border="1" >


              <tr class="up">
 <th>Date </th><th> Subject  </th><th>Total Marks </th><th> Obtained Marks </th><th> Weak Area </th>
 </tr>
	 <c:forEach var="d" items="${requestScope.history}">
	 <tr>
             <td><c:out value="${d.dot}"/></td>
             <td><c:out value="${d.scode}"/></td>
             <td><c:out value="${d.tmarks}"/></td>
             <td><c:out value="${d.omarks}"/></td>
             <td><c:out value="${d.wa}"/></td>

	 </tr>
	 </c:forEach>
 
          </table>       <br>
          <a href="userhome.jsp">Back</a>
        </center>
       <jsp:include page="page/footer.htm" />
     <jsp:include page="page/copywrite.htm" />
    </body>
</html>
