<%--
    Document   : adminReg
    Created on : Dec 14, 2015, 12:17:52 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
     <head>
         <title>Admin Register_1</title>
   <style type="text/css">
    #trans{ background: transparent url(template/images/main.png);
            color: #666666;
            border-radius:20px;

          }
</style>
    </head>

    <body background="template/images/back.jpg">



        <html:form action="AdminReg1Serv" method="post">

          <table  id="trans" width: 164px; align="center">

            <tbody>
                <tr>
                    <td colspan="2" ><%@ include file="template/header.html"%></td>

                </tr>
                <tr>
                    <td colspan="2" style="border-radius:10px; border-shadow:100px;"><%@ include file="template/menu.html"%></td>

                </tr>

                <tr> <td> <br><br><br><br>
                Data Saved
                    </tr>
                </tbody>
            </table>
          </td>
        </tr>

         </td>
        </tr>


        <tr><td>  <br><br><br><br><br><br><br> <%@ include file="template/footer.html"%></td></tr>
            </tbody>
          </table>


    </body>
</html>
