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
        <html:form action="InsertServ.do" method="post" enctype="multipart/form-data">
            <table border="0">

                <tbody>
                   
                    <tr>
                        <td>User Name:</td>
                        <td><html:text property="uname"/></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><html:text property="pass"/></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><html:text property="email"/></td>
                    </tr>
                    <tr>
                        <td>Date of Admission:</td>
                        <td><html:text property="doa"/></td>
                    </tr>
                    <tr>
                        <td>Photo:</td>
                        <td><html:file property="photo1"/></td>
                    </tr>
                    <tr>
                        <td><html:submit value="Submit"/></td>

                    </tr>
                </tbody>
            </table>


        </html:form>
    </body>
</html:html>
