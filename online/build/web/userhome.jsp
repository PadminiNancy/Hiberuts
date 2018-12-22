<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>
<%@ page import="java.io.*,java.util.*" %>

<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">

   <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>
    <%
      HttpSession hs = request.getSession();
      String photo = (String)hs.getAttribute("photo");
      
    %>
    <body class="one">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/user_topnav.html" />
    <center> <h1> Welcome ${sessionScope.uname} </h1>
       

        <a href="startTest.jsp">Start Test </a>
        <br>
         <a href="TestHistoryServ.do">View your Test History </a>
         <br>
      <br>

      <table>
        <tbody>

            <tr>
                <% if(photo!=null) {
                %>
                <td rowspan="7"> <img src="uphoto/${sessionScope.uname}.jpg" height="120px" width="120px"/></td>
                <td>   </td>
                <td>   </td>
                <% }%>
            </tr>
                
                    <tr>
                        <td>User Name:</td>
                        <td>   </td>
                        <td>${sessionScope.uname}</td>

                    </tr>
                    <c:forEach var="d" items="${sessionScope.userdata}">
                    <tr>
                        <td>Date of Birth:</td>
                        <td>   </td>
                        <td>${d.dob}</td>

                    </tr>

                    <tr>
                        <td>Email Id:</td>
                        <td>   </td>
                        <td>${d.email}</td>

                    </tr>
                    <tr>
                        <td>Qualification:</td>
                        <td>   </td>
                        <td>${d.quali}</td>

                    </tr>
                    <tr>
                        <td>Institute:</td>
                        <td>   </td>
                        <td>${d.inst}</td>

                    </tr>
                     <tr>
                        <td>Phone:</td>
                         <td>   </td>
                        <td>${d.phone}</td>

                    </tr>

                </tbody>
            </table>
</c:forEach> </center>
         <jsp:include page="page/footer.htm" />
     <jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
