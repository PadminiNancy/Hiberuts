package login;
// Generated Jan 6, 2015 11:38:50 AM by Hibernate Tools 3.2.1.GA



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private String uname;
     private String pass;
     private String email;
     private String photo;

    public Users() {
    }

	
    public Users(String uname) {
        this.uname = uname;
    }
    public Users(String uname, String pass, String email, String photo) {
       this.uname = uname;
       this.pass = pass;
       this.email = email;
       this.photo = photo;
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
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }




}


