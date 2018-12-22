/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;
import java.sql.*;

/**
 *
 * @author pallav
 */
public class BrnModel
{
     private String bcode;
     private String loc;
     private String dist;
     private String state;
     public String brn_insert(BrnBean bn) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into branch values(?,?,?,?)");
        pst.setString(1,bn.getBcode());
        pst.setString(2,bn.getLoc());
        pst.setString(3,bn.getDist());
        pst.setString(4,bn.getState());
        pst.executeUpdate();

        con.close();
        return "success";
    }
}
