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
      <html:form action="/StudReg" method="post">
            <table>
                <tr>
                    <td>Roll</td>
                    <td><html:text property="roll" /></td>
                </tr>
                 <tr>
                    <td>Name</td>
                    <td><html:text property="name" /></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><html:text property="age" /></td>
                </tr>
                <tr>
                    <td>Doa</td>
                    <td><html:text property="doa" /></td>
                </tr>
                 <tr>

                     <td><html:submit value="submit" /></td>
                </tr>



            </table>



        </html:form>


    </body>
</html:html>
