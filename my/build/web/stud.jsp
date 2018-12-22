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

        <html:form action="/StudServ" method="post">
            <table>
                <tr>
                    <td>roll</td>
                    <td> <html:text property="roll" /></td>
                </tr><tr>
                    <td>name</td>
                    <td> <html:text property="name" /></td>
                </tr>
                <tr>
                    <td>doa</td>
                    <td> <html:text property="doa" /></td>
                </tr>
                 <tr>
                    <td>pass</td>
                    <td> <html:text property="pass" /></td>
                </tr>
                 <tr>
                     <td> &nbsp;</td>
                    <td> <html:submit value="submit" /></td>
                </tr>



            </table>
        </html:form>


    </body>
</html:html>
