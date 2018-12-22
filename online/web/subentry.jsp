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
        <html:form action="/AddSubServ" method="post">




            <table border="1">

                <tbody>
                    <tr>
                        <td>Subject code</td>
                        <td><html:text property="scode" /></td>
                    </tr>
                    <tr>
                        <td>Subject name</td>
                        <td><html:text property="sname" /></td>
                    </tr>
                    <tr>

                        <td><html:submit value="add" /></td>
                    </tr>
                </tbody>
            </table>
        </html:form>
    <jsp:include page="page/footer.htm" />
     <jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
