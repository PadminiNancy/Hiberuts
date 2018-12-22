<%-- 
    Document   : home
    Created on : Dec 13, 2015, 8:59:37 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        
        <title>Home</title>
        <style>
            .trans{ background-image:url(template/images/main.png);
                    border-radius:20px;
                    color:#666666;

}
        </style>
    </head>
    <body background="template/images/back.jpg">
        <table class="trans" width="1000px" align="center">
            <tbody>
            <tr><td colspan="2"><%@include file="template/header.html"%></td></tr>
           
            <tr><td colspan="2" style="border-radius:10px;border-shadow:100px"><%@include file="template/menu.html"%></td></tr>
            <tr><td width="200px"><%@include file="template/news.jsp"%></td>
                <td width="200px"><%@include file="template/slide.htm"%></td>
            </tr>
            <tr>
                    <td colspan="2">
                        <%@ include file="template/container.htm"%>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><%@ include file="template/footer.html"%></td>

                </tr>
            </tbody>
        </table>
       
    </body>
</html>
