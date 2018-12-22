
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
public class AdminModel
{
     public String admin_insert(AdminBean ab) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into admin values(?,?,?)");
        pst.setString(1,ab.getAdmin_code());
        pst.setString(2,ab.getAdmin_name());
        pst.setString(3,ab.getPass());

        pst.executeUpdate();
        con.close();
        return "success";
    }

     public String admin_search(AdminBean ab) throws Exception
    {
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        String us=ab.getAdmin_code();
        String ps=ab.getPass();
        String str="Select * from admin where admin_code=? and pass=?";
        PreparedStatement pst = con.prepareStatement(str);
        pst.setString(1,us);
        pst.setString(2,ps);
        ResultSet rs = pst.executeQuery();
        if (rs.next())
        {
           return "success";
        }
        else
        {
            return "failure";
        }
        
      }
}
