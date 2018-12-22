<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insert page="/Layout.jsp" flush="true">
   <tiles:put name="title" type="string" value="Welcome - Login Using Tiles" />
   <tiles:put name="header" value="/header.jsp" />
   <tiles:put name="body" value="/login.jsp"/>
   <tiles:put name="footer" value="/footer.jsp" /> 
</tiles:insert>
