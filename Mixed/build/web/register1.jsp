<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">

    <body style="background-color: white">

        <html:form action="/Register1Serv" method="post">

            <table border="0">

                <tbody>
                    <tr>
                        <td>User Name:</td>
                        <td><html:text property="uname"/></td>
                        <td><html:errors property="uname"/></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><html:text property="pass"/></td>
                        <td><html:errors property="pass"/></td>
                    </tr>

                    <tr>
                        <td><html:submit value="Submit"/></td>

                    </tr>
                </tbody>
            </table>

        </html:form>

    </body>
</html:html>
