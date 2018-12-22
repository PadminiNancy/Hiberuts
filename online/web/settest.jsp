<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">

   <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>

    <body class="one">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/admin_topnav.html" />

        <html:form action="/SetTestServ" method="post">


            <table border="0">

                <tbody>
                    <tr>
                        <td>No.of questions:</td>
                        <td><html:text property="noq"/></td>
                        <td><html:errors property="noq"/></td>
                    </tr>
                    <tr>
                        <td>Complexity Level:</td>
                        <td>
                <html:select property="clev">
                    <html:option value="select">select</html:option>
                     <html:option value="easy">Easy</html:option>
                     <html:option value="medium">Medium</html:option>
                      <html:option value="high">High</html:option>

                </html:select>
                            
                        </td>
                        <td><html:errors property="clev"/></td>
                    </tr>
                <input type="hidden" name="ap" value="0" />

                    <tr>
                        <td><html:submit value="Set"/></td>
                    </tr>



            </tbody>
            </table>
        </html:form>
      <jsp:include page="page/footer.htm" />
     <jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
