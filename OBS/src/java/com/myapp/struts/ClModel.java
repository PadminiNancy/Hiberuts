


package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.*;
/**
 *
 * @author dell
 */
public class ClModel
{
    public String getActNo(String branch) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("select * from branch where bcode=?");
        pst.setString(1,branch);
        ResultSet rs = pst.executeQuery();
        String dis="";
        String sta ="";
        if (rs.next())
            {
                dis=rs.getString(3);
                sta = rs.getString(4);
            }
        PreparedStatement pst1 = con.prepareStatement("select count(*) from acct where branch=?");
        pst1.setString(1,branch);
        ResultSet rs1 = pst1.executeQuery();
        int c = 0;
        String sl ="";
        if(rs1.next())
        c = rs1.getInt(1);
        c++;
        if( (c+"").length() == 1)
           {
                sl = "000000";
           }
        else if( (c+"").length() == 2)
           {
                sl ="00000";
           }
        else if( (c+"").length() == 3)
           {
                sl="0000";

           }
        else if( (c+"").length() == 4)
           {
                 sl="000";

           }
        else if( (c+"").length() == 5)
           {
                 sl="00";

           }
        else if( (c+"").length() == 6)
           {
                 sl="0";

           }
        else
           {
                sl ="";

           }

        con.close();
        return sta+dis+branch+sl+c;

    }

    public String cl_insert(ClBean bn) throws Exception
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
        PreparedStatement pst = con.prepareStatement("insert into acct values(?,?,?,?,?,?,?,?,?)");
        pst.setString(1,bn.getAcno());
        pst.setString(2,bn.getAct_type());
        pst.setString(3,bn.getDop());
        pst.setString(4,bn.getUname());
        pst.setString(5,bn.getPass());
        pst.setDouble(6,bn.getBal());
        pst.setString(7,bn.getBal_type());
        pst.setString(8,bn.getBranch());
        pst.setString(9,bn.getIfc_code());
        pst.executeUpdate();

        con.close();
        return "success";
    }

     public ArrayList getActs()throws Exception
   {
		ClBean cb=null;

		ArrayList cbies=new ArrayList();

	            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
		    Statement stmt = con.createStatement();
		    ResultSet rs=stmt.executeQuery("select * from acct");
			while( rs.next() )
                        {
                            cb=new ClBean();
                            cb.setAcno(rs.getString(1));
                            cb.setAct_type(rs.getString(2));
                            cb.setDop(rs.getString(3));
                            cb.setUname(rs.getString(4));
                            cb.setPass(rs.getString(5));
                            cb.setBal(rs.getDouble(6));
                            cb.setBal_type(rs.getString(7));
                            cb.setBranch(rs.getString(8));
                            cb.setIfc_code(rs.getString(9));
                            cbies.add(cb);

			}
			con.close();
			return cbies;

   }

   public ClBean getAct(String acno)throws Exception
   {
		ClBean cb=null;



	            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
		    PreparedStatement pst = con.prepareStatement("select * from acct where acno = ?");
                    pst.setString(1, acno);
                    ResultSet rs = pst.executeQuery();

			if( rs.next() )
                        {
                            cb=new ClBean();
                            cb.setAcno(rs.getString(1));
                            cb.setAct_type(rs.getString(2));
                            cb.setDop(rs.getString(3));
                            cb.setUname(rs.getString(4));
                            cb.setPass(rs.getString(5));
                            cb.setBal(rs.getDouble(6));
                            cb.setBal_type(rs.getString(7));
                            cb.setBranch(rs.getString(8));
                            cb.setIfc_code(rs.getString(9));
                 
			}
			con.close();
			return cb;

   }
   public String updtPass (String acno, String op, String np ) throws Exception
   {
              String s ="failure";
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
              PreparedStatement pst = con.prepareStatement("Update acct set pass= ? where acno= ? and pass= ?");
              pst.setString(1, np);
              pst.setString(2, acno);
              pst.setString(3, op);
              pst.executeUpdate();
              con.close();
              s="success";
              return s;

   }

   public ArrayList getuseraccountdetails(HttpServletRequest request)throws Exception
   {
       HttpSession session=request.getSession();
       ArrayList ebies=new ArrayList();
       session.getAttribute("un");
       UserBean ub=null;
       ClBean clb=null;
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","eb","eb");
       Statement st=con.createStatement();
       ResultSet rs=st.executeQuery("Select * from user1 where uname='"+session.getAttribute("un")+"'");
       while(rs.next())
       {
           ub=new UserBean();
           ub.setUname(rs.getString(1));
       }
       ResultSet rs1=st.executeQuery("Select * from acct where uname='"+ub.getUname()+"'");
       if(rs1.next())
       {
           clb=new ClBean();
           clb.setAcno(rs1.getString(1));
           clb.setAct_type(rs1.getString(2));
           clb.setUname(rs1.getString(4));
           clb.setPass(rs1.getString(5));
           clb.setBal(rs1.getShort(6));
           clb.setBranch(rs1.getString(8));
           ebies.add(clb);
       }
       con.close();
       return ebies;
   }
}

