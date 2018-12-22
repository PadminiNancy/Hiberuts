<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="Images/bg1.jpg">
        <html:form action="/UploadServ" enctype="multipart/form-data">
            <h1>Upload Files!</h1>
            <br/>
            <html:file property="file"/>
            <html:submit value="Submit"/>
        </html:form>
    <li><a href="Login_tiles.jsp">Back</a></li>

    </body>
</html:html>
