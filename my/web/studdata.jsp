<%--
    Document   : user
    Created on : Jan 7, 2009, 8:23:48 AM
    Author     : eswar@vaannila.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body bgcolor="green">
        <display:table id="data" name="requestScope.data" requestURI="/Stud1Serv.do" pagesize="10" export="true">
            <display:column property="roll" title="Roll no." sortable="true" media="html" group="1" />
            <display:column property="name" title="Student name" sortable="true" />
            <display:column property="doa" title="date of admission" sortable="true" />
            <display:column property="pass" title="password" sortable="true" />
        </display:table>
    </body>
</html>
