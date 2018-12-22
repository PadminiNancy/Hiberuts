<%-- 
    Document   : home
    Created on : Jun 23, 2015, 2:52:04 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<style type="text/css">
    #trans{ background: transparent url(images/main.png);
            color: #666666;
          }
</style>
<html>
    <head>

    </head>
    <body background="images/back.jpg">
        <form action="#" >
            <table  id="trans" width="1000px" align="center">

            <tbody>
                <tr>
                    <td colspan="2" ><%@ include file="header.html"%></td>
                    
                </tr>
                <tr>
                    <td colspan="2" style="border-radius:10px; border-shadow:100px;"><%@ include file="menu.jsp"%></td>
                    
                </tr>
                <tr>
                    <td <%@ include file="news.jsp"%></td>
                    <td> <%@ include file="slide.html"%></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <%@ include file="container.htm"%>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><%@ include file="footer.html"%></td>
                    
                </tr>
            </tbody>
        </table>
      </form>
    </body>
</html>
