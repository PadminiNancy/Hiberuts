<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page import="java.io.*,java.util.*" %>
<html:html lang="true">
    <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>
    <center>
    <body style="background-image: url(Online/Bckground/10.jpg);">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/user_topnav.html" />
        <h1> You scored ${sessionScope.marks} out of ${sessionScope.total}</h1>
        <table border="4" width="50%">
            <tr bgcolor="#99CC99">  <th>Topic </th><th> Total marks </th><th> Obtained marks </th></tr>
        <%
                     HttpSession hs = request.getSession();
                    int m =  ((Integer)hs.getAttribute("m")).intValue();
                    int min =  ((Integer)hs.getAttribute("min")).intValue();
                     int max =  ((Integer)hs.getAttribute("max")).intValue();
                     List l1 = (List)hs.getAttribute("topic");
                     List l2 = (List)hs.getAttribute("tmarks");
                     List l3 = (List)hs.getAttribute("obtained");
                  %>

                    <%
                          int c= 0, ma=0;
                         for(int i=1;i<=m;i++)
                     {

                    %>
                    <%
                      ma =  ((Integer)l3.get(c)).intValue() ;
                      String tr="";
                      if(ma==max)
                        tr="<tr style=\" background-color:#CC3366; \">";
                      else if(ma==min)
                        tr="<tr style=\" background-color:#CC9999; \">";
                      else
                        tr="<tr style=\" background-color:#CC9999; \">";
                      out.print(tr);
                      

                       for(int col=0;col<1;col++)
                          {

                        %>
                        <td> <%= l1.get(c) %>
                        </td>
                        <% } %>


                  <%
                       for(int col=0;col<1;col++)
                          {

                        %>
                        <td> <%= l2.get(c) %>
                        </td>
                        <% } %>

                      <%
                       for(int col=0;col<1;col++)
                          {

                        %>
                        <td> <%= l3.get(c) %>
                        </td>
                        <% } %>

	          </tr>
	     <%
             c++; }
             %>

        </table>
       
      
  </center>
    <br>
    <br>
    <table align="center">
        <tbody>
            <tr>
    <div><div style="background-color: #CC3366; width:20px;height:20px;float:left; "></div>Strong area</div>
    </tr>
    <br>
    <br>
    <tr>  <div><div style="background-color: #CC9999; width:20px;height:20px;float:left; "></div>Weak area</div></tr>
     </tbody>
    </table>
    <br>
    weak area : ${sessionScope.weakarea}
    <br>
    Strong area : ${sessionScope.strong}
   </body>
    <jsp:include page="page/footer.htm" />
  <jsp:include page="page/copywrite.htm" />
</html:html>
