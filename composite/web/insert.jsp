<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>

    </head>
    <body style="background-color: white">
        <h1> Insertion</h1>
        <html:form action="InsertServ.do" method="post">
            <table border="0">

                <tbody>
                    <tr>
                        <td>Roll:</td>
                        <td> <html:text property="roll"/></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><html:text property="name"/></td>
                    </tr>
                    <tr>
                        <td>Age:</td>
                        <td><html:text property="age"/></td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td><html:text property="sex"/></td>
                    </tr>
                    <tr>
                        <td>Qualification:</td>
                        <td><html:text property="qualif"/></td>
                    </tr>
                    <tr>
                        <td>Duration:</td>
                        <td><html:text property="dur"/></td>
                    </tr>
                    <tr>
                        <td><html:submit value="Submit"/></td>

                    </tr>
                </tbody>
            </table>


        </html:form>
    </body>
</html:html>
