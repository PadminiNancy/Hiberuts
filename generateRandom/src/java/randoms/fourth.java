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
public class fourth {
    public static void main(String args[]){
     // PrintWriter out = response.getWriter();
        int n=0;

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Tryrandom tm = null;
       String s = null;
       int size = 5,j,k=1;
      // String ss = "abcdefghij";

       try{
           //Random rm = new Random();
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Tryrandom ");
           List l=q.list();
          Tryrandom arr[] = new Tryrandom[ l.size()];
          Tryrandom arr2[] = new Tryrandom[l.size()];

           
         Random rr = new Random();
       

             for(int i=0;i<l.size();i++){
                 int a = rr.nextInt(l.size());
             tm =(Tryrandom)l.get(a);

              if(i==0){
                  arr[n] = (Tryrandom) l.get(a);
                   //System.out.println(arr[i].getValue());
                  n++;
                  continue;
              }
             for( j=0;j<i;j++){
                    if(arr[j]==l.get(a)){
                     //System.out.println("Hello");
                      break;
                    }
                    
              }
             if(j==i){
                  arr[n] = (Tryrandom) l.get(a);
                  n++;
             }

             }
             
             
             for(int m=0;m<size;m++){
             System.out.println(k+"   "+arr[m].getValue());
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
