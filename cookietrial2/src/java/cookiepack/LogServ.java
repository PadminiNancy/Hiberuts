/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cookiepack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anisha
 */
public class LogServ extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
             String message;
                 String uname=request.getParameter("uname");
                 String pass=request.getParameter("pass");
		 LogModel model=new LogModel();
		 LoginBean lb=model.check(uname,pass);

		RequestDispatcher rd=null;
                
		
		

			rd=request.getRequestDispatcher("welcome.jsp");
		
			rd.forward(request, response);

            /*   LoginBean lb=new LoginBean();
              lb.setUname(request.getParameter("uname"));
	      lb.setPass(request.getParameter("pass"));

              RequestDispatcher rd=null;

              String message="";
		LogModel model=new LogModel();

		String result=model.check(lb);

		if("success".equals(result)){
			message="WELCOME USER";
			rd=request.getRequestDispatcher("welcome.jsp?message="+message);
		}
		else if
                    ("error".equals(result)){
			message="Incorrect username or password";
			rd=request.getRequestDispatcher("login.jsp?message="+message);
		}*/
        
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
