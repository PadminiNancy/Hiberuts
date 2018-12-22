/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Nancy
 */
public class Test {
    public static void main(String args[])
    {
        int i=0,j=0,l=0;
    boolean f = false;
    String[] s3 = {"A","A","I","T","A","A","H","A","A","H","H","A","A","N","N"};
    String[] s = new String[s3.length];
   while(i<s3.length)
    {
     
     for(j=0;j<s.length;j++)
     {
         if(j==0)
         {
             s[j]=s3[i];
                     break;
         }
      if(s[j].equals(s3[i]))
      {
       f = false;
       i++;
       break;
      }
     }
     if(f)
     {
      s[l] = s3[i];

      l++;
      i++;
     }
    }

    for(i=0;i<s.length;i++)
        System.out.println(s[0]);
    }

}
