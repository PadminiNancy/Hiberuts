<%-- 
    Document   : script
    Created on : Apr 21, 2015, 7:58:04 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <script language="javascript" type="text/javascript">
            rate_value;
           function view(){
            var form = document.getElementById('formBuzType'); // if you passed the form, you wouldn't need this line.
     for(var i = 0; i < form.buztype.length; i++)
     {
          if(form.buztype[i].checked)
          {
          var selectedValue = form.buztype[i].value;
          }
          function myFunc()
          {
              var a = 100;
              alert(a);
          }
     }


     alert(selectedValue);
     return false;
           }
            </script>
        <label class="label" for="buztype"></label>

        <input type="radio" id="r1" name="buztype" value="Fixed Rate" onclick="view();"> Fixed Rate

<input type="radio" id="r2" name="buztype" value="Variable Rate" onclick="view();"> Variable Rate

<input type="radio" id="r3" name="buztype" value="Multi Rate" onclick="view();"> Multi Rate
<input type="submit" value="aa" onclick="myFunc();"
        
    </body>
</html>
