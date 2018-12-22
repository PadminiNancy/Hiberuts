<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">

    <body style="background-color: white">
       <html:select property="topic">
                    <html:option value="0">select Topic</html:option>
                    <html:optionsCollection name="InputForm" property="topicList" label="topic"/>

                </html:select>
    </body>
</html:html>
