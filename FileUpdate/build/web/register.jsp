<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">

    <body style="background-color: white">

        <html:form action="/registerServ" method="post" enctype="multipart/form-data">


            <table border="0">

                <tbody>
                    <tr>
                        <td>User Name:</td>
                        <td><html:text property="uname"/></td>
                        <td><html:errors property="uname"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><html:text property="pass"/></td>
                        <td><html:errors property="pass"/>"</td>

                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><html:text property="email"/></td>
                        <td><html:errors property="email"/></td>

                    </tr>
                    <tr>
                        <td>Date of admission:</td>
                        <td><html:text property="doa"/></td>
                        <td><html:errors property="doa"/></td>
                    </tr>
                    <tr>
                        <td>Upload Pic</td>
                        <td><html:file property="theFile"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register" /></td>

                    </tr>

                </tbody>
            </table>


        </html:form>

    </body>
</html:html>
