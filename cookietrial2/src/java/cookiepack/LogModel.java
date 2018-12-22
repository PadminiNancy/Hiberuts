/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cookiepack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Anisha
 */
public class LogModel {
    public LoginBean check(String uname,String pass){

        LoginBean lb=null;

try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","anisha", "locked");
PreparedStatement ps=con.prepareStatement("select * from logtable where uname=? and pass=?");
ps.setString(1,uname);
ps.setString(2,pass);
ResultSet rs=ps.executeQuery();

 ///Statement stmt = con.createStatement();
		    //ResultSet rs=stmt.executeQuery("select * from studdet where roll="+roll);
			if( rs.next() ) {
				lb=new LoginBean();
				lb.setUname(rs.getString("uname"));
				lb.setPass(rs.getString("pass"));
				
			}
			con.close();
			return lb;
		}
		catch(Exception e){
			return null;
		}
			
		}



}
