/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.util.*;
import java.sql.*;
/**
 *
 * @author dell
 */
public class DeleteAcctReq extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    String st="success";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ArrayList al=new ArrayList();
        String s[]=request.getParameterValues("uname");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        if(s!=null)
         {
         for(int i=0;i<s.length;i++)
         {


             Statement stmt = con.createStatement();
             stmt.executeUpdate("Delete  from user2 where uname='"+s[i]+"'");

         }

             PreparedStatement pst=con.prepareStatement("select * from user2");
             ResultSet rs=pst.executeQuery();
             while(rs.next())
             {
                 user2bean mb=new user2bean();
                 mb.setUname(rs.getString(1));
                 mb.setAge(rs.getInt(2));
                 mb.setSex(rs.getString(3));
                 mb.setAddress(rs.getString(4));
                 mb.setAddress(rs.getString(5));
                 al.add(mb);

             }
           request.setAttribute("al", al);
   //      rd=request.getRequestDispatcher("List_outbox.jsp");
     //    rd.forward(request, response);
         }
     con.close();



        return mapping.findForward(st);
    }
}
