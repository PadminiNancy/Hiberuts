package andjava;
// Generated Mar 21, 2016 10:04:54 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Andreg generated by hbm2java
 */
public class Andreg  implements java.io.Serializable {


     private String roll;
     private String sname;
     private String cno;
     private String email;
     private Set andlogins = new HashSet(0);

    public Andreg() {
    }

	
    public Andreg(String roll) {
        this.roll = roll;
    }
    public Andreg(String roll, String sname, String cno, String email, Set andlogins) {
       this.roll = roll;
       this.sname = sname;
       this.cno = cno;
       this.email = email;
       this.andlogins = andlogins;
    }
   
    public String getRoll() {
        return this.roll;
    }
    
    public void setRoll(String roll) {
        this.roll = roll;
    }
    public String getSname() {
        return this.sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getCno() {
        return this.cno;
    }
    
    public void setCno(String cno) {
        this.cno = cno;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getAndlogins() {
        return this.andlogins;
    }
    
    public void setAndlogins(Set andlogins) {
        this.andlogins = andlogins;
    }




}

