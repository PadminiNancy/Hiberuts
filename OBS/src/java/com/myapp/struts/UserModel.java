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
public class UserModel {

    public String insert(UserBean ub)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        String str="Insert into user1 values(?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(str);
        pst.setString(1,ub.getUname());
        pst.setString(2,ub.getAcno());
        pst.setString(3,ub.getBranch());
        pst.setString(4,ub.getIfc());

        pst.executeUpdate();
        con.close();
        return "success";

    }

    public String userlogin(UserBean ub)throws Exception
    {
        String str="Select * from user1 where uname=? and branch=?";
        String us=ub.getUname();
        String ps=ub.getBranch();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement(str);
        pst.setString(1,us);
        pst.setString(2,ps);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            return "success";
        }else{
            return "failure";
        }

    }

    public ArrayList userDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        UserBean ub=new UserBean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from user1");
        while(rs.next())
        {
  //          ub=new UserBean();
    //        ebies=new ArrayList();
            ub.setUname(rs.getString(1));
            ub.setAcno(rs.getString(2));
            ub.setBranch(rs.getString(3));
            ub.setIfc(rs.getString(4));
            ebies.add(ub);
        }
        con.close();
        return ebies;
    }

    public UserBean getUser(String uname)throws Exception
    {
        UserBean ub=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Select * from user1 where uname=?");
        pst.setString(1, uname);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            ub.setUname(rs.getString(1));
            ub.setAcno(rs.getString(2));
            ub.setBranch(rs.getString(3));
            ub.setIfc(rs.getString(4));
        }
        con.close();
        return ub;
    }



}
