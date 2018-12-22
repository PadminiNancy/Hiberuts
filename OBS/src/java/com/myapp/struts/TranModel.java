package com.myapp.struts;

import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author dell
 */
public class TranModel
{



    public String tran_insert(TranBean tb) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into tran values(?,?,?,?,?,?,?,?)");
        pst.setString(1,tb.getTr_id());
        pst.setString(2,tb.getTr_date());
        pst.setString(3,tb.getAcno());
        pst.setString(4,tb.getParti());
        pst.setString(5,tb.getDr());
        pst.setString(6,tb.getCr());
        pst.setString(7,tb.getAction());
        pst.setString(8,tb.getRef_num());
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            return "success";
        }else{
            return "failure";
        }

    }

  public ArrayList Tran_details() throws Exception
  {
      ArrayList ebies=new ArrayList();
      TranBean tb=null;
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("Select * from tran");
      while(rs.next())
      {
          tb=new TranBean();
          tb.setTr_id(rs.getString(1));
          tb.setTr_date(rs.getString(2));
          tb.setAcno(rs.getString(3));
          ebies.add(tb);
      }
      con.close();
      return ebies;
  }

  public TranBean getTran(String tr_id)throws Exception
  {
      TranBean tb=null;
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
      PreparedStatement pst=con.prepareStatement("Select * from tran where tr_id=?");
      pst.setString(1,tr_id);
      ResultSet rs=pst.executeQuery();
      if(rs.next())
      {
          tb=new TranBean();
          tb.setTr_id(rs.getString(1));
          tb.setTr_date(rs.getString(2));
          tb.setAcno(rs.getString(3));
          tb.setParti(rs.getString(4));
          tb.setDr(rs.getString(5));
          tb.setCr(rs.getString(6));
          tb.setAction(rs.getString(7));
          tb.setRef_num(rs.getString(8));
      }
      con.close();
      return tb;
  }

  
}

