/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vvv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author chand
 */
public class SearchUser extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd=null;
        try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
        
        LoginBean lb=null;
        ArrayList al=new ArrayList();
	PreparedStatement pst = con.prepareStatement("select * from login where username=?");
      pst.setString(1,request.getParameter("user"));
     
	ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
            lb=new LoginBean();
            lb.setUsername(rs.getString(1));
            lb.setPass(rs.getInt(2));
            al.add(lb);
            if(al!=null){
            request.setAttribute("data",al);
            rd = request.getRequestDispatcher("loggerdisplay.jsp");
            }else
            {
            rd = request.getRequestDispatcher("loggerdisplay.jsp?msg=not found");
            }
           }
        con.close();

           rd.forward(request, response);
        } catch(Exception e) {
            out.println(e.toString());
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
