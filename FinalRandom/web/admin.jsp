<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>

    </head>
    <body style="background-color: white">
        <html:form action="/RandomServ" method="post">
            <table>
                
                <tr>
                    <td>
                        Enter level:
                    </td>
                    <td><html:text property="clev"></html:text> </td>
               </tr>
               <tr>

                   <td><html:submit value="Go"></html:submit> </td>
               </tr>


               
            </table>
        </html:form>


    </body>
</html:html>
