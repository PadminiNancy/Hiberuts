/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.*;

/**
 *
 * @author dell
 */
public class DraftModel {

    public String draft_insert(DraftBean dft)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Insert into draft values(?,?,?,?,?)");
        pst.setString(1,dft.getAcno());
        pst.setString(2,dft.getReq_id());
        pst.setString(3,dft.getReq_date());
        pst.setString(4,dft.getCheque_no());
        pst.setString(5,dft.getUname());
        pst.executeUpdate();
        con.close();
        return "success";
    }

    public ArrayList getuserdraftdetails(HttpServletRequest request)throws Exception
    {
        HttpSession session=null;
        session=request.getSession();
        session.getAttribute("un");
        UserBean ub=null;
        ArrayList ebies=new ArrayList();
        DraftBean dft=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from user1 where uname='"+session.getAttribute("un")+"'");
        while(rs.next())
        {
            ub=new UserBean();
            ub.setUname(rs.getString(1));
        }
        ResultSet rs1=st.executeQuery("Select * from draft where uname='"+ub.getUname()+"'");
        if(rs1.next())
        {
            dft=new DraftBean();
            dft.setAcno(rs1.getString(1));
            dft.setReq_id(rs1.getString(2));
            dft.setCheque_no(rs1.getString(4));
            dft.setUname(rs1.getString(5));
            ebies.add(dft);
        }
        con.close();
        return ebies;

    }

    public ArrayList getdraft()throws Exception
    {
        ArrayList ebies=new ArrayList();
        DraftBean dft=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from draft");
        while(rs.next())
        {
            dft=new DraftBean();
            dft.setAcno(rs.getString(1));
            dft.setReq_id(rs.getString(2));
            dft.setCheque_no(rs.getString(4));
            dft.setUname(rs.getString(5));
            ebies.add(dft);
        }
        con.close();
        return ebies;
    }

}
