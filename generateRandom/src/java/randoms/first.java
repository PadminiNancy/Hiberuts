/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randoms;

/**
 *
 * @author Nancy
 */
import java.util.*;

import org.hibernate.*;
//import org.hibernate.criterion.*;
public class first {
    public static void main(String args[]){
     // PrintWriter out = response.getWriter();
        int n=0;

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Tryrandom tm = null;
       String s = null;
      // String ss = "abcdefghij";

       try{
           Random rm = new Random();
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Tryrandom ");
           List l=q.list();
           for(int i=0;i<l.size();i++)
           {
            tm=(Tryrandom)l.get(i);
             if(i==1)
                s = tm.getValue();
             else
             s = s+tm.getValue();
           }
          // System.out.println(s);
           for(int i=0;i<5;i++){
            n++;
            System.out.println(n+"   "+s.charAt(rm.nextInt(s.length())));
            //System.out.println(n+"   "+ss.charAt(rm.nextInt(ss.length())));

          }
           

           tx.commit();
           session.close();
       
       }
       catch(Exception e){
           System.out.println(e.toString());
       }
    }

}
