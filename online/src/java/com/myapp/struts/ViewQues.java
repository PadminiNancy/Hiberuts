/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

/**
 *
 * @author Nancy
 */
import org.hibernate.*;
import java.util.*;
public class ViewQues {
    public static void main(String args[])
    {
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Question qu = null;
       ArrayList al = new ArrayList();
       int i;
       try{
           tx = session.beginTransaction();
            Query q= session.createQuery(" From Question");

           List l=q.list();
           for(i=0;i<l.size();i++)
           {
            qu = (Question)l.get(i);
            System.out.println(qu.getTopic().getTcode()+"\t"+qu.getClev()+"\t"+qu.getQues());
           }
           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }
    }

}
