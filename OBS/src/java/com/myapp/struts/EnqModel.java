/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.sql.*;
import java.util.*;
/**
 *
 * @author dell
 */
public class EnqModel {

    public String enq_ins(enquiry eq)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Insert into enquiry values(?,?,?,?)");
        pst.setString(1,eq.getFrom1());
        pst.setString(2,eq.getSubject());
        pst.setString(3,eq.getEnquiry());
        pst.setString(4,eq.getEmail());
        pst.executeUpdate();
        con.close();
        return "success";

    }

    public ArrayList enqdetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        enquiry eq=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from enquiry");
        while(rs.next())
        {
            eq=new enquiry();
            eq.setFrom1(rs.getString(1));
            eq.setSubject(rs.getString(2));
            eq.setEnquiry(rs.getString(3));
            eq.setEmail(rs.getString(4));
            ebies.add(eq);
        }
        con.close();
        return ebies;
    }


}
