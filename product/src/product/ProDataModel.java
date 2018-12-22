/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 *
 */
package product;
import java.sql.*;

/**
 *
 * @author Nancy
 */
public class ProDataModel {
    public String insert(ProBean pb)throws Exception
    {
        if(pb!=null)
        {
            if(pb.getProdno()<=0)
                return "input";

            else if(pb.getProdname()==null)
                return "input";

            else if(pb.getPrice()<=0)
                return "input";

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");

            PreparedStatement pst = con.prepareStatement("insert into product values(?,?,?)");

            pst.setInt(1, pb.getProdno());
            pst.setString(2, pb.getProdname());
            pst.setInt(3,pb.getPrice());

            pst.executeUpdate();
            con.close();
            return "success";
        }
        else{
            return "input";
        }
        
    }

}