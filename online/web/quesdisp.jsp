<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
             <%
             HttpSession hs = request.getSession();
            List l = (List)hs.getAttribute("vdata");
            int fn =  ((Integer)(hs.getAttribute("final"))).intValue();
             List ll = (List)hs.getAttribute("rdata");
             int qs1 = (((Integer)request.getAttribute("sno")).intValue())-1;
             String s1 = (String)l.get(qs1);
             String qphoto = (String)request.getAttribute("qphoto");
             %>
                    <!%
                    String getChecked(String s)
                    {
                        String s1 = l.get(Integer.parseInt(request.getAttribute("sno").toString())-1);
                        if (s1.equals(s))
                            return("CHECKED");
                        else
                            return(" ");
                    }%>
<html:html lang="true">
    <head>

         <title>Register Page</title>
    <jsp:include page="page/stylehead.htm" />
    
             <SCRIPT language="JavaScript">
 function c1()
{
     document.forms[0].action="PrevServ.do";
  document.forms[0].submit();

  }
function c2()
{
     document.forms[0].action="NextServ.do";
  document.forms[0].submit();

  }

  function c3()
{
     document.forms[0].action="LogOutServ.do";
  document.forms[0].submit();

  }
  function getAns(arg)
  {
    document.getElementById('ans').innerHTML=arg;
  }
  function test(s)
  {
      alert(s);
      document.getElementById(s).setAttribute("checked", true);
  }
  function countDown()
  {


  }
 </SCRIPT>
    </head>


    <body style="background-image: url(Online/Bckground/10.jpg);" onload="countDown();" >
        


        
        <html:form action="ResultServ.do" method="post" >



            <br><br><br><br><br><br><br><br><br>

            <table border="0" style="background-image: url(Online/Bckground/10.jpg);">

            <tbody>
                <tr>
                    <td colspan="5" style="border-color: #FFFFCC;" > ${requestScope.sno}. ${requestScope.curquest.ques} </td>
                </tr>

                <tr> <center>
                <% if(qphoto!=null) {
                %>
                <td colspan="5"> <img src="qphoto/${requestScope.curquest.qid}a.jpg" height="400px" width="400px"/></td>
               
                <% }%> </center>
            </tr>

                <tr>
                    <td style="border-color: #FFFFCC;" >
                    <%if(s1.equals("a"))
                     {%><input type="radio"  id="a" name="cans"  value="a" Checked onclick="getAns('a');" /><%}
                        else
                        {%><input type="radio"  id="a" name="cans"  value="a" onclick="getAns('a');" /><%}%>

                         ${requestScope.curquest.opt1}</td>
                    <td style="border-color: #FFFFCC;"><%if(s1.equals("b"))
                        {%><input type="radio"  id="b" name="cans"  value="b" Checked onclick="getAns('b');" /><%}
                        else
                        {%><input type="radio"  id="b" name="cans"  value="b" onclick="getAns('b');" /><%}%>
                         ${requestScope.curquest.opt2}</td>
                    <td style="border-color: #FFFFCC;"><%if(s1.equals("c"))
                        {%><input type="radio"  id="c" name="cans"  value="c" Checked onclick="getAns('c');" /><%}
                        else
                        {%><input type="radio"  id="c" name="cans"  value="c" onclick="getAns('c');" /><%}%>
                         ${requestScope.curquest.opt3}</td>
                    <td><%if(s1.equals("d"))
                        {%><input type="radio"  id="d" name="cans"  value="d" Checked onclick="getAns('d');" /><%}
                        else
                        {%><input type="radio"  id="d" name="cans"  value="d" onclick="getAns('d');" /><%}%>
                         ${requestScope.curquest.opt4}</td>
                </tr>
                
                <tr>
                    <td colspan="4" align="center">
                        <input type="button" value="Previous" name="B1" onclick="c1();">
                        <input type="button" value="Next" name="B2" onclick="c2();">
                        <input type="submit" value="Submit" /></td>

                </tr>
            </tbody>

        </table>

                <table border="2" style="background-image: url(Online/Bckground/10.jpg);">
                    <%
                      int c = 0;
                     for(int i=1;i<2;i++)
                     {

                    %>
                    <tr>
                        <%
                         for(int col=0;col<fn;col++)
                          {

                        %>
                        <td width="10"> <%=++c%>
                        </td>
                        <% } %>

                    </tr>
                    <%
                      }
                    %>
                    <%
                     for(int i=1;i<2;i++)
                     {
                    %>
                    <tr>
                        <%
                         for(int col=0;col<fn;col++)
                          {
                             if(Integer.parseInt(request.getAttribute("sno").toString())==col+1 && i==1)
                             {%>
                                <td id="ans" width="10"> <%=l.get(col)%>
                                </td><%
                             }
                             else
                             {%>
                                <td width="10"> <%=l.get(col)%>
                                </td><%
                             }

                         } %>

                    </tr>
                    <%
                     c++; }
                    %>
                </table>
                
     </html:form>
   
    </body>
</html:html>
