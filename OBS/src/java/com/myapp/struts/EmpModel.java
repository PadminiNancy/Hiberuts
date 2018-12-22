package com.myapp.struts;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;


/**
 *
 * @author pallav
 */
public class EmpModel {


    public String emp_insert(EmpBean eb) throws Exception
    {
        if(eb.getEmp_code()=="" )
        {
        return "input";

        }
        else if(eb.getEname()=="")
        {
         return "input";

        }
        else if(eb.getBcode()=="")
        {
         return "input";
        }
        else if(eb.getPass()=="")
        {
         return "input";
        }
        else
        {


        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?)");
        pst.setString(1,eb.getEmp_code());
        pst.setString(2,eb.getBcode());
        pst.setString(3,eb.getEname());
        pst.setString(4,eb.getPass());
        pst.executeUpdate();

        con.close();
        return "success";
        }
    }

    public String emp_search(EmpBean eb) throws Exception
    {
      
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        String us=eb.getEmp_code();
        String ps=eb.getBcode();
        PreparedStatement pst = con.prepareStatement("Select * from emp where empcode=? and bcode=?");
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

    public String emp_branch(String ecode) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("select bcode from emp where empcode=?");
        pst.setString(1,ecode);
      //  pst.setString(2,bcode);
        ResultSet rs = pst.executeQuery();
        String r="";
        if (rs.next())
        {

           r=rs.getString(1);
        }
        else
        {

           return("");
        }
       con.close();
       return (r);
 }

   public ArrayList getEmps()throws Exception
   {
		EmpBean eb=null;

		ArrayList ebies=new ArrayList();

	            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
		    Statement stmt = con.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from emp");
			while( rs.next() )
                        {
			eb=new EmpBean();
                        eb.setEmp_code(rs.getString(1));
                        eb.setBcode(rs.getString(2));
                        eb.setEname(rs.getString(3));
                        eb.setPass(rs.getString(4));
                        ebies.add(eb);
			}
			con.close();
			return ebies;

   }

    public EmpBean getEmp(String emp_code) throws Exception
    {
        EmpBean eb=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("Select * from emp where empcode=?");
        pst.setString(1, emp_code);
        ResultSet rs = pst.executeQuery();

        if (rs.next())
        {
           eb=new EmpBean();
           eb.setEmp_code(rs.getString(1));
           eb.setBcode(rs.getString(2));
           eb.setEname(rs.getString(3));
           eb.setPass(rs.getString(4));
           con.close();
        }
        con.close();

        return eb;


   }


}