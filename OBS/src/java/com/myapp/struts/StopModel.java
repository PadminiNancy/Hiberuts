


package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.*;
/**
 *
 * @author dell
 */
public class StopModel
{



    public String stop_insert(StopBean sb) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("Insert into stop_payment values(?,?,?,?)");
        pst.setString(1,sb.getSreq_id());
        pst.setString(2,sb.getSreq_date());
        pst.setString(3,sb.getAcno());
        pst.setString(4,sb.getChqno());
    //    pst.setString(5,sb.getStatus());

        pst.executeUpdate();

        con.close();
        return "success";
    }


    public ArrayList stopReqDetails()throws Exception
    {
        ArrayList ebies=new ArrayList();
        StopBean sb=new StopBean();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from stop_payment");
        while(rs.next())
        {
            sb.setSreq_id(rs.getString(1));
            sb.setSreq_date(rs.getString(2));
            sb.setAcno(rs.getString(3));
            sb.setChqno(rs.getString(4));
            ebies.add(sb);
        }
        con.close();
        return ebies;
    }

    public StopBean getStopChqReq(String sreq_id)throws Exception
    {
        StopBean sb=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst=con.prepareStatement("Select * from fund_tran where sreq_id=?");
        pst.setString(1,sreq_id);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            sb.setSreq_id(rs.getString(1));
            sb.setSreq_date(rs.getString(2));
            sb.setAcno(rs.getString(3));
            sb.setChqno(rs.getString(4));
        }
        con.close();
        return sb;
    }

    public ArrayList getuserstoppaymentdetails(HttpServletRequest request)throws Exception
    {
        HttpSession session=request.getSession();
        ArrayList ebies=new ArrayList();
        session.getAttribute("un");
        StopBean stb=null;
        UserBean ub=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from user1 where uname='"+session.getAttribute("un")+"'");
        while(rs.next())
        {
            ub=new UserBean();
            ub.setAcno(rs.getString(2));
        }
        ResultSet rs1=st.executeQuery("Select * from stop_payment where acno='"+ub.getAcno()+"'");
        if(rs1.next())
        {
            stb=new StopBean();
            stb.setAcno(rs1.getString(3));
            stb.setChqno(rs1.getString(4));
            stb.setSreq_date(rs1.getString(2));
            stb.setSreq_id(rs1.getString(1));
            ebies.add(stb);
            
        }
        con.close();
        return ebies;
    }


}

