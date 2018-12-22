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
public class NomModel
{
   public String nom_insert(NomBean bn) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into acct_nom values(?,?,?,?)");
        pst.setString(1,bn.getNom_name());
        pst.setString(2,bn.getDob());
        pst.setString(3,bn.getRel());
        pst.setString(4,bn.getAcno());
        pst.executeUpdate();

        con.close();
        return "success";
    }
}
