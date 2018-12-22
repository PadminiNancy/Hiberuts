/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

/*import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;*/
import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author Nancy
 */
public class Student extends ValidatorForm {
    
    private String name;

    private int number;
    private int roll;
    private int age;
    private String doa;
   

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param i
     */
    public void setNumber(int i) {
        number = i;
    }

    /**
     *
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
       

    /**
     * @return the roll
     */
    public int getRoll() {
        return roll;
    }

    /**
     * @param roll the roll to set
     */
    public void setRoll(int roll) {
        this.roll = roll;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the doa
     */
    public String getDoa() {
        return doa;
    }

    /**
     * @param doa the doa to set
     */
    public void setDoa(String doa) {
        this.doa = doa;
    }
}
