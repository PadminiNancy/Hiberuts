


package com.myapp.struts;

import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author dell
 */
public class ChqModel
{



    public String chq_insert(ChqBean cb) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into cheque values(?,?,?,?)");
        pst.setString(1,cb.getAcno());
        pst.setString(2,cb.getReq_id());
        pst.setString(3,cb.getReq_date());
        pst.setString(4,cb.getUname());
 //       pst.setString(4,cb.getStatus());

        pst.executeUpdate();

        con.close();
        return "success";
    }

    public ArrayList ChqReqDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        ChqBean cb=new ChqBean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from cheque");
        while(rs.next())
        {
            cb.setUname(rs.getString(4));
            cb.setAcno(rs.getString(1));
            cb.setReq_id(rs.getString(2));
            cb.setReq_date(rs.getString(3));
            ebies.add(cb);
        }
        con.close();
        return ebies;
    }

    public ChqBean getchq(String acno)throws Exception
    {
        ChqBean chq=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Select * from cheque where acno=?");
        pst.setString(1,acno);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            chq.setAcno(rs.getString(1));
            chq.setReq_id(rs.getString(2));
            chq.setReq_id(rs.getString(3));
        }
        con.close();
        return chq;
    }

    public ArrayList getuserchqdetails(String u)throws Exception
    {
      //  HttpSession session=null;
      //  session=request.getSession();
       // session.getAttribute("un");
        UserBean ub=null;
        ChqBean cb=null;
        ArrayList ebies=new ArrayList();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from user1 where uname='"+u+"'");
        while(rs.next())
        {
            ub=new UserBean();
            ub.setUname(rs.getString(1));
        }
        ResultSet rs1=st.executeQuery("Select * from cheque where uname='"+u+"'");
        if(rs1.next())
        {
            cb=new ChqBean();
            cb.setAcno(rs1.getString(1));
            cb.setReq_id(rs1.getString(2));
            cb.setUname(rs1.getString(4));
            cb.setReq_date(rs1.getString(3));
            ebies.add(cb);
        }
        con.close();
        return ebies;
    }


}

