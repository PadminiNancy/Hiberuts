<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>

    </head>
    <body style="background-color: white">
        <html:form action="/StudSaveServ" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td>roll</td>
                        <td><html:text property="roll" /></td>
                        <td><html:errors property="roll" /></td>
                    </tr>
                    <tr>
                        <td>name</td>
                        <td><html:text property="name" /></td>
                        <td><html:errors property="name" /></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><html:text property="age" /></td>
                        <td><html:errors property="age" /></td>
                    </tr>
                    <tr>
                        <td>Adm Date</td>
                        <td><html:text property="doa" /></td>
                        <td><html:errors property="doa" /></td>
                    </tr>
                    <tr>

                        <td><html:submit value="submit" /></td>
                    </tr>
                </tbody>
            </table>

        </html:form>

    </body>
</html:html>
