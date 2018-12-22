/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mini;
import java.sql.*;

/**
 *
 * @author Nancy
 */
public class CourseDataModel {
    public String insert(CourseBean cb) throws Exception{
        if(cb!=null)
        {
            if(cb.getCcode()==null)
            {
                return "input";
            }
            else if(cb.getFees()<=0)
            {
                return "input";
            }
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            PreparedStatement pst = con.prepareStatement("Insert into course values(?,?,?,?)");
            pst.setString(1,cb.getCcode());
            pst.setString(2,cb.getCname());
            pst.setInt(3,cb.getFees());
            pst.setInt(4,cb.getDur());
            pst.executeUpdate();
            con.close();
        }
        else
            return "input";
        return "success";

    }

}
