<%-- 
    Document   : menutry
    Created on : Aug 21, 2015, 6:59:23 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
       
        <title>JSP Page</title>
        <style>
            ul ul{display: none;}
            ul li :hover>ul{display: block;}
        </style>
    </head>
    <body>
<ul id="drop-nav">
    <center> <li><a href="#">Subject</a>
     <ul>
      <center> <li><a href="subentry.jsp">Add</a></li></center>
      <center> <li><a href="updateSub.jsp">Update</a></li></center>
      <center> <li><a href="deleteSub.jsp">Delete</a></li></center>

    </ul>
  </li></center>
  <center> <li><a href="#">Topic</a>
       <ul>
     <center>  <li><a href="topicentry.jsp">Add</a></li></center>
     <center>  <li><a href="updateTopic.jsp">Update</a></li></center>

    </ul>
  </li></center>
  <center> <li><a href="#">Questions</a>
        <ul>
     <center>  <li><a href="setques.jsp">Add</a></li></center>
     <center>  <li><a href="delques.jsp">Delete</a>

                <ul>

                    <center>  <li>    <a href="#">C</a></li></center>
                    <center>  <li>    <a href="#">Cpp</a></li></center>
                    <center>  <li>    <a href="#">Java</a></li></center>
                    <center>  <li>    <a href="#">Ds</a></li></center>

                </ul>

              </li></center>


    </ul>
  </li></center>
  <center> <li><a href="settest.jsp">Set Test Details</a></li></center>
  <center> <li><a href="#">View Questions</a>
      <ul>

               <center>  <li>    <a href="#">C</a></li></center>
               <center>  <li>    <a href="#">Cpp</a></li></center>
               <center>  <li>    <a href="#">Java</a></li></center>
               <center>  <li>    <a href="#">Ds</a></li></center>


      </ul>

  </li></center>
 <center>  <li><a href="adminlogout.jsp">Logout</a></li></center>


</ul>
</body>
</html>
