<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">
    <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>

    <body class="one">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/topnav.htm" />

        <html:form action="/AdminReg1Serv" method="post">

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
                        <td><html:submit value="Next"/></td>

                    </tr>
                </tbody>
            </table>

        </html:form>
    <jsp:include page="page/footer.htm" />
<jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
