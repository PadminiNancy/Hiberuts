<%-- 
    Document   : product
    Created on : Dec 27, 2014, 10:48:41 PM
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
        <h1>Product Entry...</h1>
        <form action="InsertServ" method="POST">

            <table border="0">

                <tbody>
                    <tr>
                        <td>Product No. :</td>
                        <td><input type="text" name="prodno" value="" /></td>
                    </tr>
                    <tr>
                        <td>Product Name :</td>
                        <td><input type="text" name="prodname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Price :</td>
                        <td><input type="text" name="price" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Insert" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
