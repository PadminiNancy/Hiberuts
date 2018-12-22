<%-- 
    Document   : book
    Created on : Jan 4, 2015, 9:58:47 PM
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
        <h1>Book info entry...</h1>
        <form action="BookInfoServ" method="POST">
            <table border="0">
                <thead>

                <tbody>
                    <tr>
                        <td>Book No. :</td>
                        <td><input type="text" name="bno" value="" /></td>
                    </tr>
                    <tr>
                        <td>Book Name :</td>
                        <td><input type="text" name="bname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Price :</td>
                        <td><input type="text" name="price" value="" /></td>
                    </tr>
                    <tr>
                        <td>Rack No. :</td>
                        <td><input type="text" name="rackno" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Insert" /></td>

                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
