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
            text-align: center;
            }

        </style>
    </head>
    <body>
      <%@ include file="header.html"%>

               <%@ include file="menu.html"%>

                
               <form action="userProfile.jsp" style="width:1200px;height: 400px; background-color: #CCCCCC" >
                  <% 
                     String m = request.getParameter("msg");
                     if(m!=null)
                     out.println(m);
                  %>
                   <table align="center" width="1200px"  class="login" style="border-radius:800px; border-shadow:100px; height: 400px; box-shadow:10px 10px 10px pink;">
                            <tr>
                                <td>User Name</td>
                                <td> <input type="text" name="uname" value="" /></td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td> <input type="text" name="pass" value="" /></td>
                            </tr>
                            <tr>
                                <td>Re-Enter Password</td>
                                <td> <input type="text" name="rpass" value="" /></td>
                            </tr>
                            <tr>
                                <td>Date Of Birth</td>
                                <td> <input type="text" name="dob" value="" /></td>
                            </tr>
                            <tr>
                                <td>Qualifiation</td>
                                <td> <input type="text" name="quali" value="" /></td>
                            </tr>
                            <tr>
                                <td>College</td>
                                <td> <input type="text" name="clg" value="" /></td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" value="Register" />
                                </td>
                            </tr>
                        </table>
                        </form>
                 <%@ include file="footer.html"%>

              

    </body>
</html>
