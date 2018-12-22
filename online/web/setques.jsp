<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<link rel="stylesheet"type="text/css" media="all" href="design.css"/>

<html:html lang="true">

   <head>
         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    </head>

    <body class="one">

     <jsp:include page="page/topbar.htm" />
     <jsp:include page="page/Header.htm" />
     <jsp:include page="page/topnav.htm" />
     <center>
        <html:form action="/SetQuesServ" method="post" enctype="multipart/form-data">
          <center>
            <table border="0">

                <tbody>

                    
                    <tr>

                        <td>Subject Code:</td>
                        <td><html:text property="scode"/></td>

                    </tr>
                     <tr>
                        <td>Topic Code:</td>
                        <td><html:text property="tcode"/></td>

                    </tr>
                     
                    <tr>
                        <td>question id:</td>
                        <td><html:text property="qid"/></td>
                        <td><html:errors property="qid"/></td>
                    </tr>

                    <tr>
                       <td>Question:</td>
                       <td><html:text property="ques"/></td>
                        <td><html:errors property="ques"/></td>
                    </tr>
                    <tr>
                        <td>Option 1:</td>
                        <td><html:text property="opt1"/></td>
                        <td><html:errors property="opt1"/></td>
                    </tr
                     <tr>
                        <td>Option 2:</td>
                        <td><html:text property="opt2"/></td>
                        <td><html:errors property="opt2"/></td>
                     </tr>
                     <tr>
                        <td>Option 3:</td>
                        <td><html:text property="opt3"/></td>
                        <td><html:errors property="opt3"/></td>
                     </tr>
                     <tr>
                        <td>Option 4:</td>
                        <td><html:text property="opt4"/></td>
                        <td><html:errors property="opt4"/></td>
                     </tr>
                      <tr>
                        <td>Correct answer:</td>
                        <td><html:text property="cans"/></td>
                        <td><html:errors property="cans"/></td>
                      </tr>
                      <tr>
                        <td>Marks:</td>
                        <td><html:text property="marks"/></td>
                        <td><html:errors property="marks"/></td>
                      </tr>
                      <tr>
                        <td>Complexity Level:</td>
                        <td><html:text property="clev"/></td>
                        <td><html:errors property="clev"/></td>
                      </tr>
                      <tr>
                        <td>Photo:</td>
                        <td><html:file property="photo1"/></td>
                    </tr>
                    <tr>
                        <td><html:submit value="Save"/></td>

                    </tr>
                </tbody>
            </table>
       </center>

        </html:form>
    </center>
     <jsp:include page="page/footer.htm" />
     <jsp:include page="page/copywrite.htm" />
    </body>
</html:html>
