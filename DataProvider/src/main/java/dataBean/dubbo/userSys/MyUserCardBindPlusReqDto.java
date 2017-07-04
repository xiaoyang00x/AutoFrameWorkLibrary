package dataBean.dubbo.userSys;

import com.miaoqian.usersvc.model.enums.UserIdTypeEnum;
import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/22.
 */
public class MyUserCardBindPlusReqDto implements IDataBean {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户uid
     */
    private String uid;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 证件类型：00—身份证
     */
    private UserIdTypeEnum idType;
    /**
     * 证件号码
     */
    private String idNo;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 银行卡号
     */
    private String cardNo;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行代号
     */
    private String bankCode;
    /**
     * 短信验证码
     */
    private String smsCode;
    /**
     * 前导业务授权码
     */
    private String authCode;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserIdTypeEnum getIdType() {
        return idType;
    }

    public void setIdType(UserIdTypeEnum idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @Override
    public String toString() {
        return "MyUserCardBindPlusReqDto{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", idType=" + idType +
                ", idNo='" + idNo + '\'' +
                ", mobile='" + mobile + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", smsCode='" + smsCode + '\'' +
                ", authCode='" + authCode + '\'' +
                "} " + super.toString();
    }
}
