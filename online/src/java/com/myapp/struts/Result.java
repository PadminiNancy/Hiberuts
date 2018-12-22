/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

/**
 *
 * @author Nancy
 */
public class Result extends org.apache.struts.action.ActionForm implements java.io.Serializable {
    private int rid;
    private int tmarks;
    private int omarks;
    private String dot;
    private String scode;
    private String wa;
    private String uname;
    private Login login;


     public Result() {
    }


    public Result(int rid) {
        this.rid = rid;
    }
    public Result(int rid, int tmarks, int omarks, String dot, String scode, String wa, Login login) {
       this.rid = rid;
       this.tmarks = tmarks;
       this.omarks = omarks;
       this.dot = dot;
       this.scode = scode;
       this.wa = wa;
       this.login = login;
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
     * @return the tmarks
     */
    public int getTmarks() {
        return tmarks;
    }

    /**
     * @param tmarks the tmarks to set
     */
    public void setTmarks(int tmarks) {
        this.tmarks = tmarks;
    }

    /**
     * @return the omarks
     */
    public int getOmarks() {
        return omarks;
    }

    /**
     * @param omarks the omarks to set
     */
    public void setOmarks(int omarks) {
        this.omarks = omarks;
    }

    /**
     * @return the dot
     */
    public String getDot() {
        return dot;
    }

    /**
     * @param dot the dot to set
     */
    public void setDot(String dot) {
        this.dot = dot;
    }

    /**
     * @return the scode
     */
    public String getScode() {
        return scode;
    }

    /**
     * @param scode the scode to set
     */
    public void setScode(String scode) {
        this.scode = scode;
    }

    /**
     * @return the wa
     */
    public String getWa() {
        return wa;
    }

    /**
     * @param wa the wa to set
     */
    public void setWa(String wa) {
        this.wa = wa;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
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

}
