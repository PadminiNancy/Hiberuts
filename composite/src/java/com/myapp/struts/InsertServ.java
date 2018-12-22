/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class InsertServ extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = null;
            try{
                 tx = session.beginTransaction();

                 Chatra c = (Chatra)form;
                 /*c.setRoll(request.getParameter("roll"));
                 c.setName(request.getParameter("name"));
                 c.setAge(Integer.parseInt(request.getParameter("age")));
                 c.setSex(request.getParameter("sex"));*/
                 
                 

                 Quali q = new Quali();

                 QualiId qi = new QualiId();
                 qi.setRoll(request.getParameter("roll"));
                 qi.setQualif(request.getParameter("qualif"));

                 q.setDur(Integer.parseInt(request.getParameter("dur")));
                 q.setId(qi);
                 q.setChatra(new Chatra(c.getRoll()));
                 session.save(c);
                 session.save(q);
                 tx.commit();
            }
            catch(Exception e)
            {
             response.sendRedirect("error.jsp?msg="+e.toString());
            }
        return mapping.findForward(SUCCESS);
    }
}
