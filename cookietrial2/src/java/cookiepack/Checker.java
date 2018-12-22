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
public class Checker extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      RequestDispatcher rd=null;
        boolean newbie = true;
       
Cookie[] cookies = request.getCookies();
if (cookies != null) {
for(int i=0; i<cookies.length; i++) {
Cookie c = cookies[i];
if ((c.getName().equals("un")) &&
// Could omit test and treat cookie name as a flag
(c.getValue().equals(request.getParameter("uname")))) {
newbie = false;

rd=request.getRequestDispatcher("/LogServ");
rd.forward(request, response);
break;
}
}
    }
if (newbie) {
     String un="uname";
        String pw="pass";
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        if (un.equals(uname)&& pw.equals(pass)){
                    Cookie usercookie=new Cookie("uname",uname);
                    Cookie passcookie=new Cookie("pass",pass);
                    usercookie.setMaxAge(60*60*24);
                    passcookie.setMaxAge(60*60*24);
                    response.addCookie(usercookie);
                    response.sendRedirect("welcome.jsp?message=welcome user");
		}
        else{
  //  Cookie un=new Cookie("un",request.getParameter("uname"));
    //Cookie pw=new Cookie("pw",request.getParameter("pass"));
    //un.setMaxAge(60*60*24);
    //pw.setMaxAge(60*60*24);
    //response.addCookie(un);
    //response.addCookie(pw);
    rd=request.getRequestDispatcher("login.jsp");
    rd.forward(request, response);
}

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
