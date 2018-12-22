<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ page import="java.io.*,java.util.*" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <%
    HttpSession hs = request.getSession();
    int time =((Integer)hs.getAttribute("testtime")).intValue();
    %>
    <script language="JavaScript>">
        var t1 = "<%=time%>";
        function countDown()
        {
            if(t1>0)
                {
                t1 = t1 - 1;
        
                }
            else if(t1==0)
                window.location = "ResultServ.do";
        }
        </script>
    <body style="background-color: white" onload="contdown();">

        <h1>Set Time</h1>
        <html:form >
           <%=time%>
           <br>
             <html:submit property="Set"/>

        </html:form>

    </body>
</html:html>
