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
public class User2Model {

    public String user2_insert(user2bean ub)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Insert into user2 values(?,?,?,?,?)");
        pst.setString(1,ub.getUname());
        pst.setInt(2,ub.getAge());
        pst.setString(3,ub.getSex());
        pst.setString(4,ub.getAddress());
        pst.setString(5,ub.getPhno());
        pst.executeUpdate();
        con.close();
        return "success";

    }

    public ArrayList user2Details()throws Exception
    {

        ArrayList al=new ArrayList();
        user2bean u2b=new user2bean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement str=con.createStatement();
        ResultSet rs=str.executeQuery("Select * from user2");
        while(rs.next())
        {
            u2b.setUname(rs.getString(1));
            u2b.setAge(rs.getInt(2));
            u2b.setSex(rs.getString(3));
            u2b.setAddress(rs.getString(4));
            u2b.setPhno(rs.getString(5));
            al.add(u2b);
        }
        con.close();
        return al;
    }

    public user2bean getuser2(String uname)throws Exception
    {
        user2bean u2b=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Select * from user2 where uname=?");
        pst.setString(1,"uname");
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            u2b.setUname(rs.getString(1));
            u2b.setAge(rs.getInt(2));
            u2b.setSex(rs.getString(3));
            u2b.setAddress(rs.getString(4));
            u2b.setPhno(rs.getString(5));
        }
        con.close();
        return u2b;

    }

}
