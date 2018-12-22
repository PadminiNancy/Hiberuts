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
public class LoanModel {

    public String Loan_ins(LoanBean lb)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Insert into loan values(?,?,?,?,?,?,?,?)");
        pst.setString(1,lb.getFname());
        pst.setInt(2,lb.getAge());
        pst.setString(3,lb.getSex());
        pst.setString(4,lb.getLoan_type());
        pst.setString(5,lb.getGrant());
        pst.setString(6,lb.getAdd());
        pst.setString(7,lb.getPhno());
        pst.setString(8,lb.getEmail());
        pst.executeUpdate();
        con.close();
        return "success";

    }

    public ArrayList getLoanDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        LoanBean lb=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from loan");
        while(rs.next())
        {
            lb=new LoanBean();
            lb.setFname(rs.getString(1));
            lb.setAge(rs.getInt(2));
            lb.setLoan_type(rs.getString(4));
            lb.setGrant(rs.getString(5));
            lb.setEmail(rs.getString(8));
            ebies.add(lb);
        }
        con.close();
        return ebies;

    }

}
