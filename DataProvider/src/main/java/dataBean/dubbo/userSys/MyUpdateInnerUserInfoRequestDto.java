package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyUpdateInnerUserInfoRequestDto implements IDataBean {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 登录名
     */
    private String loginName;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 单位名称
     */
    private String org;
    /**
     * 部门名称
     */
    private String depart;
    /**
     * 性别；male：男性；female：女性；unknown：未知
     */
    private String sex;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 邮箱地址
     */
    private String email;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * QQ号
     */
    private String qq;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "MyUpdateInnerUserInfoRequestDto{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", org='" + org + '\'' +
                ", depart='" + depart + '\'' +
                ", sex='" + sex + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", qq='" + qq + '\'' +
                '}';
    }
}
