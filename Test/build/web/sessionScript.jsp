<%-- 
    Document   : sessionScript
    Created on : Dec 29, 2015, 9:00:15 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <script type="text/javascript">
            function SetUserName()
            {
                var user = "Padmini";
                '<%Session["us"]=""+user+";%>';

            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
