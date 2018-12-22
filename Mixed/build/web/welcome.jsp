<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">

    <body style="background-color: white">

        <html:form action="/ParentChildAccessServ" method="post">
            <table>

                <tr>
                    <td>
                         <html:text property="uname"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit value="Go"/>
                    </td>
                </tr>
            </table>
        </html:form>

    </body>
</html:html>
