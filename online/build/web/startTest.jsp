<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

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

        <html:form action="/StartTestServ" method="post">


            <table border="0">

                <tbody>
                    <tr>
                        <td>Select Subject:</td>
                       
                        <td> <html:select property="scode">
                           <html:option value="select">select</html:option>
	                <c:forEach var="d" items="${sessionScope.sublist}">
                            <html:option value="${d.scode}">${d.sname}</html:option>

	               </c:forEach>
                            </html:select>
                        </td>



                        <td><html:submit value="Start Test"/></td>
                    </tr>



            </tbody>
            </table>
        </html:form>
     <jsp:include page="page/footer.htm" />
     <jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
