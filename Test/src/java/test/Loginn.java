package test;
// Generated Dec 12, 2015 11:06:08 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Loginn generated by hbm2java
 */
public class Loginn  implements java.io.Serializable {


     private String uname;
     private String pass;
     private Set regs = new HashSet(0);

    public Loginn() {
    }

	
    public Loginn(String uname) {
        this.uname = uname;
    }
    public Loginn(String uname, String pass, Set regs) {
       this.uname = uname;
       this.pass = pass;
       this.regs = regs;
    }
   
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Set getRegs() {
        return this.regs;
    }
    
    public void setRegs(Set regs) {
        this.regs = regs;
    }




}


