package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyInnerUserRegisterRequestDto implements IDataBean{

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String loginName;
    private String password;
    private String name;
    private String org;
    private String depart;
    private String sex;
    private String mobile;
    private String idCard;
    private String qq;
    private String email;

    public MyInnerUserRegisterRequestDto() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrg() {
        return this.org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDepart() {
        return this.depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getQq() {
        return this.qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String toString() {
        return "MyInnerUserRegisterRequestDto{loginName='" + this.loginName + '\'' + ", password='" + this.password + '\'' + ", name='" + this.name + '\'' + ", org='" + this.org + '\'' + ", depart='" + this.depart + '\'' + ", sex='" + this.sex + '\'' + ", mobile='" + this.mobile + '\'' + ", idCard='" + this.idCard + '\'' + ", qq='" + this.qq + '\'' + ", email='" + this.email + '\'' + '}';
    }

}
