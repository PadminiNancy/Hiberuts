<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
         <style>
            .trans{ background-image:url(template/images/main.png);
                    border-radius:20px;
                    color:#666666;

}
        </style>
    </head>
    <body background="template/images/back.jpg">
        <html:form action="/AdminRegServ" method="post" enctype="multipart/form-data">
             <table class="trans" width="1000px" align="center">
            <tbody>
            <tr><td colspan="2"><%@include file="template/header.html"%></td></tr>

            <tr><td colspan="2" style="border-radius:10px;border-shadow:100px"><%@include file="template/menu.html"%></td></tr>
            <tr><td align="center"> <br><br><br><br> <table style="color:#339966; height: 200px">

                 <tr>
                     <td>Name</td>
                     <td><html:text property="uname" value="${sessionScope.aname}"/></td>
                </tr> <c:forEach var="d" items="${sessionScope.adata}">
                <tr>
                     <td>Address</td>
                     <td><html:text property="addr" value="${d.addr}"/></td>
                </tr>
                <tr>
                     <td>Email id</td>
                     <td><html:text property="eid" value="${d.eid}"/></td>
                </tr>
                <tr>
                     <td>phone</td>
                     <td><html:text property="cno" value="${d.cno}"/></td>
                </tr
                <tr>
                     <td>pic</td>
                     <td><html:file property="photo1" value="${d.photo1}"/></td>
                </tr></c:forEach> <br>
                <tr><td><html:submit value="Submit"/></td></tr>
                    </table></td></tr>
            <tr><td colspan="2"><br><br><br><br><br><br><%@include file="template/footer.html"%></td></tr>
            </tbody>
             </table>
        </html:form>



    </body>
</html:html>
