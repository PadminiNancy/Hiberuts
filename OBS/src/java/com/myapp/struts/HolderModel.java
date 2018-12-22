package com.myapp.struts;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;


/**
 *
 * @author pallav
 */
public class HolderModel {


    public String hl_insert(HolderBean bn) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into acct_holder values(?,?,?,?,?,?,?)");
        pst.setString(1,bn.getHname());
        pst.setString(2,bn.getPh());
        pst.setString(3,bn.getAdr());
        pst.setString(4,bn.getDob());
        pst.setString(5,bn.getIdf());
        pst.setString(6,bn.getEmail());
        pst.setString(7,bn.getAcno());


        pst.executeUpdate();
        con.close();
        return "success";
    }

    public HolderBean getAct(String acno)throws Exception
   {
		HolderBean cb=null;



	            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
		    PreparedStatement pst = con.prepareStatement("select * from acct_holder where acno = ?");
                    pst.setString(1, acno);
                    ResultSet rs = pst.executeQuery();

			if( rs.next() )
                        {
                            cb=new HolderBean();
                            cb.setHname(rs.getString(1));
                            cb.setPh(rs.getString(2));
                            cb.setAdr(rs.getString(3));
                            cb.setDob(rs.getString(4));
                            cb.setIdf(rs.getString(5));
                            cb.setEmail(rs.getString(6));
                            cb.setAcno(rs.getString(7));
			}
			con.close();
			return cb;

   }
}


