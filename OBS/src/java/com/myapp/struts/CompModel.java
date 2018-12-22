


package com.myapp.struts;
import java.sql.*;
import java.util.*;
/**
 *
 * @author dell
 */
public class CompModel
{



    public String comp_insert(CompBean cb) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into complaints values(?,?,?)");
        pst.setString(1,cb.getCid());
        pst.setString(2,cb.getCdate());
        pst.setString(3,cb.getCtext());
       
        pst.executeUpdate();

        con.close();
        return "success";
    }

    public ArrayList CompDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        CompBean cb=new CompBean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from complaints");
        while(rs.next())
        {
            cb.setCid(rs.getString(1));
            cb.setCdate(rs.getString(2));
            cb.setCtext(rs.getString(3));
            ebies.add(cb);
        }
        con.close();
        return ebies;
    }


}


