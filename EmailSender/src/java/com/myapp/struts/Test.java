/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

/**
 *
 * @author Nancy
 */
public class Test {
    public static void main(String args[]) throws Exception{
        EmailSender es = new EmailSender();
       System.out.println( es.sendMail("edsinstitute@gmail.com", "newbike71002128", "edsinstitute@gmail.com", "pdmnnancy@gmail.com", "Test Mail", "This is a test"));
        System.out.println("Tested");
    }

}
