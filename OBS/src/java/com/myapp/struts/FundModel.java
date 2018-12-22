package com.myapp.struts;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.*;
/**
 *
 * @author dell
 */
public class FundModel
{



    public String fund_insert(FundBean fb) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("Insert into fund_tran values(?,?,?,?,?,?,?,?,?)");
        pst.setString(1,fb.getTreq_id());
        pst.setString(2,fb.getTreq_date());
        pst.setString(3,fb.getAcno());
        pst.setDouble(4,fb.getTrf_amt());
        pst.setString(5,fb.getToacno());
        pst.setString(6,fb.getBank());
        pst.setString(7,fb.getBranch());
        pst.setString(8,fb.getIfc_code());
        pst.setString(9,fb.getVerified_by());
        pst.executeUpdate();
        con.close();
        return "success";
    }

    public ArrayList FundTranDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        FundBean fb=new FundBean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from fund_tran");
        while(rs.next())
        {
            fb.setTreq_id(rs.getString(1));
            fb.setTreq_date(rs.getString(2));
            fb.setAcno(rs.getString(3));
            fb.setTrf_amt(rs.getDouble(4));
            fb.setToacno(rs.getString(5));
            fb.setVerified_by(rs.getString(8));
            ebies.add(fb);
        }
        con.close();
        return ebies;
    }

    public FundBean getFund(String treq_id)throws Exception
    {
        FundBean fb=null;
        Class.forName("");
        Connection con=DriverManager.getConnection("");
        PreparedStatement pst=con.prepareStatement("Select * fund_tran where treq_id=?");
        pst.setString(1,treq_id);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            fb.setTreq_id(rs.getString(1));
            fb.setTreq_date(rs.getString(2));
            fb.setAcno(rs.getString(3));
            fb.setTrf_amt(rs.getDouble(4));
            fb.setToacno(rs.getString(5));
            fb.setBank(rs.getString(6));
            fb.setIfc_code(rs.getString(7));
            fb.setVerified_by(rs.getString(8));
            fb.setBranch(rs.getString(9));
        }
        con.close();
        return fb;
    }
     
public ArrayList userfundtrandetails(String u)throws Exception
  {
     // HttpSession session=null;
     // session=request.getSession();
     // session.getAttribute("un");
      FundBean tb=null;
      UserBean ub=null;
      ArrayList ebies=new ArrayList();
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
      Statement stmt=con.createStatement();
      String x = "";
      ResultSet rs=stmt.executeQuery("Select * from user1 where uname='"+u+"'");
      while(rs.next())
      {
          ub=new UserBean();
        x =  rs.getString(2);
          System.out.println(x);
      }
      ResultSet rs1=stmt.executeQuery("Select * from fund_tran where acno='R0010000001'");
      while(rs1.next())
      {
          System.out.println("pass2");
         tb=new FundBean();
         tb.setTreq_id(rs1.getString(1));
     //    tb.setTreq_date(rs1.getString(2));
       //  tb.setAcno(rs1.getString(3));
         tb.setTrf_amt(rs1.getDouble(4));
         tb.setToacno(rs1.getString(5));
   //     tb.setBank(rs1.getString(5));
      //   tb.setIfc_code(rs1.getString(6));
         tb.setVerified_by(rs1.getString(8));
     //    tb.setBranch(rs1.getString(8));
         ebies.add(tb);
        
      }
      con.close();
      return ebies;
  }



}

