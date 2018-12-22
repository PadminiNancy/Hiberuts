/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import java.util.ArrayList;

/**
 *
 * @author Jaydeep
 */
public class Test {
    public static void main(String args[])throws Exception{
        ArrayList al=new FundModel().userfundtrandetails("nayan");
        if(al.size()>0){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
    }

}
