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
public class DeleteLoanServ extends org.apache.struts.action.Action {

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
        String s[]=request.getParameterValues("fname");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        if(s!=null)
         {
         for(int i=0;i<s.length;i++)
         {


             Statement stmt = con.createStatement();
             stmt.executeUpdate("Delete  from loan where full_name='"+s[i]+"'");

         }

             PreparedStatement pst=con.prepareStatement("select * from loan");
             ResultSet rs=pst.executeQuery();
             while(rs.next())
             {
                 LoanBean mb=new LoanBean();
                 mb.setFname(rs.getString(1));
                 mb.setAge(rs.getInt(2));
                 mb.setSex(rs.getString(3));
                 mb.setLoan_type(rs.getString(4));
                 mb.setGrant(rs.getString(5));
                 mb.setEmail(rs.getString(6));
                 al.add(mb);

             }
           request.setAttribute("la", al);
   //      rd=request.getRequestDispatcher("List_outbox.jsp");
     //    rd.forward(request, response);
         }
     con.close();



        return mapping.findForward(st);
    }
}
