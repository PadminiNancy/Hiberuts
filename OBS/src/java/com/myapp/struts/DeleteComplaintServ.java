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
public class DeleteComplaintServ extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    String s = "success";
    
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
        String st[]=request.getParameterValues("cid");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        if(st!=null)
        {
            for(int i=0;i<st.length;i++)
            {
                Statement stmt=con.createStatement();
                stmt.executeUpdate("Delete from complaints where cid='"+st[i]+"'");
            }
            PreparedStatement pst=con.prepareStatement("Select * from complaints");
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                CompBean cb=new CompBean();
                cb.setCid(rs.getString(1));
                cb.setCdate(rs.getString(2));
                cb.setCtext(rs.getString(3));
                al.add(cb);
            }
            request.setAttribute("al",al);
        }
        con.close();
        return mapping.findForward(s);
    }
}
