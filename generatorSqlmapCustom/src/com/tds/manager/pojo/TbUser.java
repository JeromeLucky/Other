package com.tds.manager.pojo;

public class TbUser {
    private Integer uId;

    private String uName;

    private String uPwd;

    private Integer flag;

    private Integer gId;

    private Integer emp;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getEmp() {
        return emp;
    }

    public void setEmp(Integer emp) {
        this.emp = emp;
    }
}