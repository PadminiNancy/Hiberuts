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
public class DelStopPayReqServ extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
     private String s = "success";
    
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
        String st[]=request.getParameterValues("sreq_id");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        if(st!=null)
        {
            for(int i=0;i<st.length;i++)
            {
                Statement stmt=con.createStatement();
                stmt.executeUpdate("Delete from stop_payment where sreq_id='"+st[i]+"'");
            }
            PreparedStatement pst=con.prepareStatement("Select * from stop_payment");
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                StopBean stpb=new StopBean();
                stpb.setAcno(rs.getString(3));
                stpb.setChqno(rs.getString(4));
                stpb.setSreq_id(rs.getString(1));
                stpb.setSreq_date(rs.getString(2));
                al.add(stpb);
            }
            request.setAttribute("la",al);
        }
        con.close();
        return mapping.findForward(s);
    }
}
