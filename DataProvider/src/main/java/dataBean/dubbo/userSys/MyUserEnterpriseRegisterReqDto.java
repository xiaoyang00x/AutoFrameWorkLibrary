package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/19.
 */
public class MyUserEnterpriseRegisterReqDto implements IDataBean{
    private String id;
    private String mobile;
    private String password;
    private String ip;
    private String userJxId;
    private String bankCode;
    private String bankName;

    public MyUserEnterpriseRegisterReqDto() {
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserJxId() {
        return this.userJxId;
    }

    public void setUserJxId(String userJxId) {
        this.userJxId = userJxId;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String toString() {
        return "MyUserEnterpriseRegisterReqDto{mobile='" + this.mobile + '\'' + ", password='" + this.password + '\'' + ", ip='" + this.ip + '\'' + ", userJxId='" + this.userJxId + '\'' + ", bankCode='" + this.bankCode + '\'' + ", bankName='" + this.bankName + '\'' + "} " + super.toString();
    }
}
