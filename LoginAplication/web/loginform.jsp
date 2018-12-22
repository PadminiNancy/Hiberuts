<%-- 
    Document   : loginform
    Created on : Apr 21, 2014, 9:04:43 AM
    Author     : chand
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
        <h1>well come </h1>
        <%
        String s=request.getParameter("msg");
        if(s != null){
         out.println(s);
        }

        %>
        <form action="LogServ" method="post">
            Username <input type="text" name="uname"/><br>
            Password <input type="text" name="pass"/><br>
           <input type="submit" name="sub" value="save"/>
            
        </form>

    </body>
</html>
