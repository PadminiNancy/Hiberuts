/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

/**
 *
 * @author Nancy
 */
import java.util.*;

import org.hibernate.*;
//import org.hibernate.criterion.*;
public class fourth {
    public static void main(String args[]){
     // PrintWriter out = response.getWriter();
        int n=0;

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Question tm = null;
       String s = null;
       int size = 5,j,k=1,a,i;
       boolean f=true;
       ArrayList al = new ArrayList();
      // String ss = "abcdefghij";

       try{
           //Random rm = new Random();
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Question where clev=? and scode=? and tcode=?");
           q.setString(0, "easy");
           q.setString(1, "c");
           q.setString(2, "arr");
           List l = q.list();
          Question arr[] = new Question[ l.size()];
         

           
         Random rr = new Random();
       

            while(n<l.size())
            {
             a = rr.nextInt(l.size());
             for(i=0;i<arr.length;i++)
             {
               if(arr[i]==l.get(a))
               {
                   f = false;
                   break;
               }
             }
             if(f)
             {
               arr[n] = (Question) l.get(a);
               al.add(arr);
               n++;
             }
             else
                 f = true;
            }
             for(int m=0;m<size;m++){
             System.out.println(k+"\t"+arr[m].getQues()+"\t"+arr[m].getClev());
             k++;
             }

                 tx.commit();
           session.close();


       } 
       catch(Exception e){
           System.out.println(e.toString());
       }
    }

}
