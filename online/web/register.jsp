<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">
<head:html>
    <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
</head:html>
<body class="one">
<!-- ####################################################################################################### -->
<!-- 										Top Bar	(Topbar.htm)										 -->
<jsp:include page="page/topbar.htm" />

<!-- ####################################################################################################### -->
<!-- 										Header Bar	(Header.htm)										 -->
<jsp:include page="page/Header.htm" />
<!-- ####################################################################################################### -->
<!-- 										Navigation Bar													 -->
<jsp:include page="page/topnav.htm" />
<!-- ####################################################################################################### -->
<!-- 										Container Bar (container.htm)									 -->

<div class="wrapper col4">
  <div id="container">
    <div id="hpage">
        <center>
        <html:form action="/RegisterServ" method="post">

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
        </center>
<!-- ####################################################################################################### -->
<!-- 										footer Bar (footer.htm)									 -->
<jsp:include page="page/footer.htm" />
<!-- ####################################################################################################### -->
<jsp:include page="page/copywrite.htm" />



    </div>
  </div>

<!-- ####################################################################################################### -->
</div>

    </body>
</html:html>
