/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class Test {
   public static void main(String args[])
   {
     SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Login l = new Login();
           URegister a = (URegister)session.get(URegister.class, 1);
           URegister u = new URegister();
           if(a!=null)
               System.out.println("ok");
           else
               l.setUname("nitin");
               u.setLogin(l);
               u.setDob("08-oct-90");
               session.save(u);
               System.out.println("pk");

           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

   }
}


