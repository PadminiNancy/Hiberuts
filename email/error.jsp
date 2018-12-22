<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Error</title>
      <link rel="stylesheet" href="style.css" type="text/css">
    </head>
    <body background="images/bg14.jpg">
      <center>
        <div class="error">
            <h1>Error</h1>
            <h3>
               Message: <%= request.getAttribute("ErrorMessage") %>
            </h3>
        </div>
      </center>
    </body>
</html>