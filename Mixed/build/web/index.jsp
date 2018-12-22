

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <script type="text/javascript">
    function getval(x){
        alert("hi");
        var y=document.getElementById(x).value;
        alert(y);
    }
    </script>
    <html:form action="/EditPage.do?dispatch=edit"  >
        <h1>Login Success. Welcome <bean:write name="LoginForm" property="userName"></bean:write></h1><br>
        <table>
            <tr>
                <th>Radio</th>
                <th>Emp.ID</th>
                <th>F.Name</th>
                <th>L.Name</th>
                <th>Gender</th>
            </tr>
                <logic:iterate id="test" name="EditForm" property="employees">
                <tr>
                    <td><input id="radio" type="radio" value=<bean:write name="test" property="emp_id"/> onclick ='getval(this.value)'/></td>
                    <td><html:text name="test" property="emp_id" readonly="true" /></td>
                    <td><html:text name="test" property="first_name" readonly="true" /></td>
                    <td><html:text name="test" property="last_name" readonly="true"/></td>
                    <td><html:text name="test" property="gender" readonly="true"/></td>
                </tr>
                </logic:iterate>
        </table>
        <html:submit value="edit" property="method"/>
        </html:form>
    </body>
</html>

