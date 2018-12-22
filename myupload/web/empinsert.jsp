<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">

        <html:form action="/UploadServ" method="post" enctype="multipart/form-data">

<table>
             <tr>
                 <td>${requestScope.msg}</td>
             </tr>
            
             <tr>
                 <td>Emp Name:</td>
                 <td><html:text property="ename" /></td>
             </tr>
             <tr>
                 <td>Designation:</td>
                 <td><html:text property="edesig" /></td>
             </tr>
              <tr>
                 <td>Esal:</td>
                 <td><html:text property="esal" /></td>
             </tr>
              
              <tr>
                 <td>Emp address:</td>
                 <td><html:text property="eadd" /></td>
             </tr>
             <tr>
                 <td></td>
                 <td>Upload Item:<html:file  property="theFile"/></td>
             </tr>

             <tr>
                 <td></td>
                 <td> <html:submit value="submit"/></td>
             </tr>



       </table>






        </html:form>
    </body>
</html:html>
