/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;
/**
 *
 * @author Nancy
 */
public class loginserv extends HttpServlet {
   
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

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        RequestDispatcher rd = null;
        try
        {
            tx = session.beginTransaction();
            Users u = (Users)session.get(Users.class,uname);
            tx.commit();
            session.close();
            if( u != null){

                 if(uname.equals(u.getUname())&& pass.equals(u.getPass()))
                 {
                        request.setAttribute("data", u);
                        rd = request.getRequestDispatcher("welcome.jsp");
                        rd.forward(request, response);
                 }
                else {
                        Users us = new Users(uname, pass, null, null);
                        request.setAttribute("data", us);
                        rd = request.getRequestDispatcher("login.jsp?msg=Invalid  password");
                        rd.forward(request, response);

                       // response.sendRedirect("login.jsp?msg=Invalid  password");
                    }
            }else {

                Users us = new Users(uname, pass, null, null);
                request.setAttribute("data", us);
                        rd = request.getRequestDispatcher("login.jsp?msg=Invalid User");
                        rd.forward(request, response);
                  
            }
        }

        catch(Exception e)
        {

                        rd = request.getRequestDispatcher("error.jsp?msg="+e.toString());
                        rd.forward(request, response);
         
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
    @Override
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

  }
    

