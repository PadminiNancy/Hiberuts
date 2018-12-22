<%-- 
    Document   : login
    Created on : Apr 21, 2014, 9:31:10 AM
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
        <%@page import = "vvv.*" %>
    <%
        String s=request.getParameter("msg");
        String m="";
        int p=0;
        if(s != null){
         out.println(s);
        
        LoginBean lb = (LoginBean)request.getAttribute("data");
         m = lb.getUsername();
        p = lb.getPass();
        }


        %>
        <form action="NewServlet" method="post">
            Username <input type="text" name="uname" value="<%= m %>"/><br>
            Password <input type="text" name="pass" value="<%= p %>"/><br>
           <input type="submit" name="sub" value="Login"/>
        </form>
    </body>
</html>
