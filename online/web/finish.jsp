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
     <h1> Click Finish to completely save your data</h1>

     <html:form action="/SetTestServ" method="post">

         <input type="hidden" name="noq" value="${sessionScope.noq}" />
         <input type="hidden" name="clev" value="${sessionScope.clev}" />
         <input type="hidden" name="ap" value="1" />


     <html:submit value="Finish"/>
     </html:form>

    <jsp:include page="page/footer.htm" />
   <jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
