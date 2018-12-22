/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import org.apache.struts.upload.FormFile;

/**
 *
 * @author Nancy
 */
public class ARegister extends org.apache.struts.action.ActionForm implements java.io.Serializable{
    private AdLogin adlogin;
    private String uname;
    private String dob;
    private String email;
    private String quali;
    private String post;
    private String phone;
    private String photo;
    private int rid;
    private FormFile photo1;

    public ARegister()
    {
    }

    public ARegister(int rid)
    {
        this.rid = rid;
    }

    public ARegister(int rid, AdLogin adlogin, String dob, String email, String quali, String post, String phone, String photo)
    {
        this.rid = rid;
        this.adlogin = adlogin;
        this.dob = dob;
        this.email = email;
        this.quali = quali;
        this.post = post;
        this.phone = phone;
        this.photo = photo;

    }

    /**
     * @return the adlogin
     */
    public AdLogin getAdlogin() {
        return adlogin;
    }

    /**
     * @param adlogin the adlogin to set
     */
    public void setAdlogin(AdLogin adlogin) {
        this.adlogin = adlogin;
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the quali
     */
    public String getQuali() {
        return quali;
    }

    /**
     * @param quali the quali to set
     */
    public void setQuali(String quali) {
        this.quali = quali;
    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return the rid
     */
    public int getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(int rid) {
        this.rid = rid;
    }

    /**
     * @return the photo1
     */
    public FormFile getPhoto1() {
        return photo1;
    }

    /**
     * @param photo1 the photo1 to set
     */
    public void setPhoto1(FormFile photo1) {
        this.photo1 = photo1;
    }

}
