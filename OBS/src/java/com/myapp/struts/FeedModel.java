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
public class FeedModel {

    public String feedinsert(FeedBean fb)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Insert into feedback values(?,?,?)");
        pst.setString(1,fb.getFid());
        pst.setString(2,fb.getFdate());
        pst.setString(3,fb.getFtext());
        pst.executeUpdate();
        con.close();
        return "success";

    }

    public ArrayList feedDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        FeedBean fb=new FeedBean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from feedback");
        while(rs.next())
        {
            fb.setFid(rs.getString(1));
            fb.setFdate(rs.getString(2));
            fb.setFtext(rs.getString(3));
            ebies.add(fb);
        }
        con.close();
        return ebies;
    }

   
}
