<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">
     <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>
   
      <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/admin_topnav.html" />
     <body class="one">
     <a href="subentry.jsp">Add Subject</a>
     <a href="topicentry.jsp">Add Topic</a>
     <a href="setques.jsp">Set Questions</a>
     <a href="settest.jsp">Set Test</a>
      <a href="FetchAllQuestServ.do">View Questions</a>
      <a href="editAdminProf.jsp">Edit you Profile</a>

      <br>
      <br>

      <table align="center">
        <tbody>
            
            <tr>
                <td rowspan="7"> <img src="aphoto/${sessionScope.aname}.jpg" height="120px" width="120px"/></td>
                <td>   </td>
                <td>   </td>
            </tr>
                
                    <tr>
                        <td>User Name:</td>
                        <td>   </td>
                        <td>${sessionScope.aname}</td>
                        
                    </tr>
                    <c:forEach var="d" items="${sessionScope.adata}">
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
                        <td>Post:</td>
                        <td>   </td>
                        <td>${d.post}</td>
                        
                    </tr>
                     <tr>
                        <td>Phone:</td>
                         <td>   </td>
                        <td>${d.phone}</td>
                       
                    </tr>

                </tbody>
            </table>
</c:forEach> 
    <jsp:include page="page/footer.htm" />
<jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
