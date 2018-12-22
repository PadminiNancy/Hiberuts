<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">

        <html:form action="/LoginServ" method="Post">
            <table>
                <tr>
                    <td>User Name:</td>
                    <td><html:text property="uname"/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><html:text property="pass"/></td>
                </tr>
                <tr>
                    <td>Email id:</td>
                    <td><html:text property="email"/></td>
                </tr>
                <tr>
                    <td>Photo:</td>
                    <td><html:text property="photo"/></td>
                </tr>
                <tr>
                    <td><html:submit value="Login"/></td>
                </tr>
            </table> 
        </html:form>
    </body>
</html:html>
