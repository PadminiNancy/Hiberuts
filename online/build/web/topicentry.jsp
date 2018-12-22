<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">

   <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>
   <%
     HttpSession hs = request.getSession();
     List l = (List)hs.getAttribute("sublist");
    
   %>
    <body class="one">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/topnav.htm" />

        <html:form action="/AddTopicServ" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>
                            Subject Name
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Subject Code

                        </td>
                    </tr>

       
          
         </tbody>
         </table>
            <table border="1">

                <tbody>
                    <tr>
                        <td>Tpoic code</td>
                        <td><html:text property="tcode" /></td>
                    </tr>
                    <tr>
                        <td>Topic </td>
                        <td><html:text property="topic" /></td>
                    </tr>
                    <tr>
                        <td>Subject code</td>
                        <td><html:text property="scode" /></td>
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
