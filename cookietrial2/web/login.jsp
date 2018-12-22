<%-- 
    Document   : login
    Created on : 09-Feb-2015, 18:54:56
    Author     : Anisha
--%>

<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookie Trial</title>
    </head>
    <body>
         <c:if test="${param.message!=null}">
 	<div class='boldred'>${param.message}</div>
 </c:if>
        <center><h1>PLEASE ENTER</h1>
            <form method="post" action="LogServ">
                <table border="2">

                    <tbody>
                        <tr>
                            <td>USERNAME</td>
                            <td><input type="text" name="uname" value="" /></td>
                        </tr>
                        <tr>
                            <td>PASSWORD</td>
                            <td><input type="text" name="pass" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="SUBMIT" /></td>

                        </tr>
                    </tbody>
                </table>
            </form>
        </center>

    </body>
</html>
