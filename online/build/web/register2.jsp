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

        <html:form action="/Register2Serv" method="post" enctype="multipart/form-data">

            <table border="0">

                <tbody>
                    <tr>
                        <td>User Name:</td>
                        <td><html:text property="uname" value="${sessionScope.uname}"/></td>
                        <td><html:errors property="uname"/></td>
                    </tr>
                    <tr>
                        <td>Date of Birth:</td>
                        <td><html:text property="dob"/></td>
                        <td><html:errors property="dob"/></td>
                    </tr>

                    <tr>
                        <td>Email Id:</td>
                        <td><html:text property="email"/></td>
                        <td><html:errors property="email"/></td>
                    </tr>
                    <tr>
                        <td>Qualification:</td>
                        <td><html:text property="quali"/></td>
                        <td><html:errors property="quali"/></td>
                    </tr>
                    <tr>
                        <td>College:</td>
                        <td><html:text property="inst"/></td>
                        <td><html:errors property="inst"/></td>
                    </tr>
                     <tr>
                        <td>Phone:</td>
                        <td><html:text property="phone"/></td>
                        <td><html:errors property="phone"/></td>
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
<jsp:include page="page/footer.htm" />
<jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
