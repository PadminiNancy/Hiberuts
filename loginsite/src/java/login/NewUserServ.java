/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;
/**
 *
 * @author Nancy
 */
public class NewUserServ extends HttpServlet {
   
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
        String email = request.getParameter("email");
        String photo = request.getParameter("photo");
      
          Users u1 = new Users(uname,pass,email, photo);


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;

        try
        {
            tx = session.beginTransaction();
             Users u = null;
             Users us = null;
             RequestDispatcher rd = null;

                Users ud = (Users)session.get(Users.class,uname);
                 if(ud != null)
                 {
                      // us = new Users(uname);
                       request.setAttribute("data", u1);
                       rd = request.getRequestDispatcher("newuser.jsp?msg=This user name already exixts");
                       rd.forward(request, response);
                      
                 }
                  
                               
                else
                {
                    if(pass == null || pass.length() > 7) {
                    request.setAttribute("data",u1);
                    rd = request.getRequestDispatcher("newuser.jsp?msg=Invalid password");
                    rd.forward(request, response);

                      }
                    else{
                        if(email == null ||email.length()>7 ){
                            request.setAttribute("data",u1);
                        rd = request.getRequestDispatcher("newuser.jsp?msg=Invalid email id");
                        rd.forward(request, response);
                        }
                        else{
                            if(photo == null|| photo.length()>7){
                                request.setAttribute("data", u1);
                                rd = request.getRequestDispatcher("newuser.jsp?msg=Invalid photo");
                                rd.forward(request, response);
                            }
                            else{
                                session.save(u1);
                                tx.commit();
                                session.close();
                                request.setAttribute("data", u1);
                                rd = request.getRequestDispatcher("welcome.jsp");
                                rd.forward(request, response);
                            }
                        }

                      }
                    }

                
     

        }
        catch(Exception e)
        {
           response.sendRedirect("eror.jsp");
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
