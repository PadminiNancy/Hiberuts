package com.myapp.struts;
// Generated Apr 26, 2015 12:29:01 AM by Hibernate Tools 3.2.1.GA


import java.sql.Blob;
import java.util.Date;

/**
 * Updation generated by hbm2java
 */
public class Updation  implements java.io.Serializable {


     private String uname;
     private String pass;
     private String email;
     private Date doa;
     private String photo;
     private Blob pic;

    public Updation() {
    }

	
    public Updation(String uname) {
        this.uname = uname;
    }
    public Updation(String uname, String pass, String email, Date doa, String photo, Blob pic) {
       this.uname = uname;
       this.pass = pass;
       this.email = email;
       this.doa = doa;
       this.photo = photo;
       this.pic = pic;
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
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDoa() {
        return this.doa;
    }
    
    public void setDoa(Date doa) {
        this.doa = doa;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Blob getPic() {
        return this.pic;
    }
    
    public void setPic(Blob pic) {
        this.pic = pic;
    }




}


