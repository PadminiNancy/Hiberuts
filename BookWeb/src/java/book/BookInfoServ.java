/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package book;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class BookInfoServ extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
       // PrintWriter out = response.getWriter();
       int bno = Integer.parseInt(request.getParameter("bno"));
       String bname = request.getParameter("bname");
       int price = Integer.parseInt(request.getParameter("price"));
       String rackno = request.getParameter("rackno");


       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;

       try
       {
           tx = session.beginTransaction();

           Rack r = new Rack(rackno);
           Book b = new Book(bno,r,bname,price);
           session.save(b);
           tx.commit();
           session.close();
           response.sendRedirect("save.jsp");
       }
       catch(Exception e)
       {
           response.sendRedirect("error.jsp");
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
