<%--
    Document   : home
    Created on : Jun 23, 2015, 2:52:04 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <style>
            .login{background-color: #99CC99;
             text-align: center;}
            a:link{color: blue;
            }
        </style>
       
    </head>
    <body>
        <form action="#" style="background-color:#99FFCC; width:800px">
        <%@ include file="header.html"%>

                <%@ include file="menu.html"%>

                
                        <table align="center" class="login" width="1000px" style="border-radius:40px; border-shadow:100px; height: 400px">
                            <tr>
                                <td>User Name</td>
                                <td> <input type="text" name="uname" value="" /></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td> <input type="password" name="uname"/></td>
                            </tr>
                            <tr>
                                <td><input type="submit" value="Login"/></td>
                                <td><a href="register.jsp"> Sign UP</a></td>
                            </tr>
                        </table>
                   <%@ include file="footer.html"%>

              
        </form>
    </body>
</html>
