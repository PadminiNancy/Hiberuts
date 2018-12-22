<%@ page language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insert page="/register_layout.jsp" flush="true">
   <tiles:put name="title" type="string" value="Welcome - Login Using Tiles" />
   <tiles:put name="header" value="/header.jsp" />
   <tiles:put name="body" value="/register1.jsp"/>
   <tiles:put name="footer" value="/footer.jsp" />
</tiles:insert>
