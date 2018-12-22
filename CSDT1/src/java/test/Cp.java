/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Nancy
 */
public class Cp {


public static void main(String args[])
{
   char ch,s;
  int k=0,r1=0,i=2,c,r=0;
  c = 'I';
  c=c-64;
  if(c>=1 && c<=5)
    k=1;
  else if(c>=6&&c<=10)
    k=2;
  else if(c>=11&&c<=15)
    k=3;
  else if(c>=16&&c<=20)
    k=4;
  else if(c>=21&&c<=26)
    k=5;
  switch(k)
  {
    case 1:
    r=c*2;
    break;
    case 2:
    r=(c%3)*5;
    System.out.println(r);
    break;
    case 3:
    r=(c%4)*8;
    break;
    case 4:
    r=c+10;
    break;
    case 5:
    {
    for(i=2;i<c;i++)
    {
      r1=c%i;
      if(r1==0)
        r=i*12;
    }
    break;
    }
  }
    if(r==0)
      r=-29;
    else if(r>26)
    {
     r=r%26;
     if(r==0)
       r=26;
    }
  r=r+64;
  s=    (char) r;
 System.out.println(s);

}

}
