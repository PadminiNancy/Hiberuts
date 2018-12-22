<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">

    <body style="background-color: white">

        <html:form action="/Register2Serv" method="post" enctype="multipart/form-data">

            <table border="0">

                <tbody>
                    <tr>
                        <td>Roll</td>
                        <td><html:text property="roll"/></td>
                        <td><html:errors property="roll"/></td>
                    </tr
                     <c:forEach var="d" items="${requestScope.data}">
                    <tr>

                        <td>User Name:</td>
                        <td><html:text property="uname" value="${d.uname}"/></td>
                        <td><html:errors property="loginid"/></td>
                    </tr>
                     <tr>
                        <td>Password:</td>
                        <td><html:text property="pass" value="${d.pass}"/></td>
                        <td><html:errors property="pass"/></td>
                    </tr>
                     </c:forEach>
                    <tr>
                        <td>Email id:</td>
                        <td><html:text property="email"/></td>
                        <td><html:errors property="email"/></td>
                    </tr>
                    
                    <tr>
                       <td>Photo:</td>
                       <td><html:file property="theFile"/></td>
                        <td><html:errors property="theFile"/></td>
                    </tr>
                    <tr>
                        <td><html:submit value="Save"/></td>

                    </tr>
                </tbody>
            </table>


        </html:form>

    </body>
</html:html>
