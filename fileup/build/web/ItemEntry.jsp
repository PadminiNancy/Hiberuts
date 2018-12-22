<%--
    Document   : uploadfile
    Created on : Mar 25, 2013, 9:39:54 AM
    Author     : user
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>uploadfile</title>
    </head>
    <body>
     <html:form action="/UploadServ" method="post" enctype="multipart/form-data">
         <table>
             <tr>
                 <td>${requestScope.msg}</td>
             </tr>
             <tr>
                 <td>Enter Item ID:</td>
                 <td><html:text property="itemid" /></td>
             </tr>
             <tr>
                 <td>Item Name:</td>
                 <td><html:text property="itemname" /></td>
             </tr>
             <tr>
                 <td>Price:</td>
                 <td><html:text property="price" /></td>
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
