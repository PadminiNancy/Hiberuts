/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.sql.*;
/**
 *
 * @author dell
 */
public class BranchModel {

    public String branch_insert(Branch bh)throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Insert into branch1 values(?,?,?,?)");
    //    ResultSet rs=pst.executeQuery();
        pst.setString(1,bh.getBcode());
        pst.setString(2,bh.getLoc());
        pst.setString(3,bh.getDist());
        pst.setString(4,bh.getState());
        pst.executeUpdate();
        con.close();
        return "success";

    }

}
