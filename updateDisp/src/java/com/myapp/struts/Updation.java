package com.myapp.struts;
// Generated Apr 25, 2015 10:36:49 PM by Hibernate Tools 3.2.1.GA



import org.apache.struts.upload.FormFile;

/**
 * Updation generated by hbm2java
 */
public class Updation extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private String uname;
     private String pass;
     private String email;
     private String doa;
     private String photo;
      private String Filename;
     private FormFile theFile;
     private byte[] pic;
    public Updation() {
    }

	
    public Updation(String uname) {
        this.uname = uname;
    }
    public Updation(String uname, String pass, String email, String doa, String photo) {
       this.uname = uname;
       this.pass = pass;
       this.email = email;
       this.doa = doa;
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
    public String getDoa() {
        return this.doa;
    }
    
    public void setDoa(String doa) {
        this.doa = doa;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return the Filename
     */
    public String getFilename() {
        return Filename;
    }

    /**
     * @param Filename the Filename to set
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * @return the theFile
     */
    public FormFile getTheFile() {
        return theFile;
    }

    /**
     * @param theFile the theFile to set
     */
    public void setTheFile(FormFile theFile) {
        this.theFile = theFile;
    }

    /**
     * @return the pic
     */
    public byte[ ] getPic() {
        return pic;
    }

    /**
     * @param pic the pic to set
     */
    public void setPic(byte[ ] pic) {
        this.pic = pic;
    }




}


