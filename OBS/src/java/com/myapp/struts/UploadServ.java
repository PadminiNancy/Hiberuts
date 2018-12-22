/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.io.*;
import javax.servlet.http.*;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import java.sql.*;
/**
 *
 * @author dell
 */
public class UploadServ extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private  String s = "Success";

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
            UploadBean cb=(UploadBean)form;
            FormFile fl=cb.getFile();
            String fname=fl.getFileName();
            String filepath=getServlet().getServletContext().getRealPath("/")+"upload";
            File ftc=new File(filepath,fname);
            if(!ftc.exists())
            {
                FileOutputStream fos=new FileOutputStream(ftc);
                fos.write(fl.getFileData());
                fos.flush();
                fos.close();
            }
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","loggapp","loggapp");
         HttpSession session=request.getSession();
         session.setAttribute("img", fname);
         String user=(String)session.getAttribute("un");
         PreparedStatement pst=con.prepareStatement("update logger set extension=? where uname=?");
         pst.setString(1, fname);
         pst.setString(2, user);
         pst.executeUpdate();
         con.close();


        return mapping.findForward(s);
    }
}
