<%-- 
    Document   : login
    Created on : Feb 13, 2015, 11:42:50 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login..</h1
        <form action="LoginServ" method="post">
        <table>
            <tbody>
                    <tr>
                        <td>User Name :</td>
                        <td><input type="text" name="loginid" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="text" name="passwd" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="login"/></td>
                    </tr>
            </tbody>
            </table>
        </form>
    </body>
</html>
