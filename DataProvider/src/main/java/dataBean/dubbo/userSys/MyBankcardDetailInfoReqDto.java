package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/14.
 */
public class MyBankcardDetailInfoReqDto implements IDataBean{
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    private String uid;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行编号
     */
    private String bankCode;

    /**
     /**
     * 银行卡省份
     */
    private String bankProvince;

    /**
     * 银行卡所属市
     */
    private String bankCity;

    /**
     * 银行卡所属支行
     */
    private String bankSubbranch;

    /**
     * 银行卡联行号
     */
    private String bankUnionNumber;

    /**
     * 银行卡号码
     */
    private String bankCardNo;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankSubbranch() {
        return bankSubbranch;
    }

    public void setBankSubbranch(String bankSubbranch) {
        this.bankSubbranch = bankSubbranch;
    }

    public String getBankUnionNumber() {
        return bankUnionNumber;
    }

    public void setBankUnionNumber(String bankUnionNumber) {
        this.bankUnionNumber = bankUnionNumber;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    @Override
    public String toString() {
        return "MyBankcardDetailInfoReqDto{" +
                "uid='" + uid + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", bankProvince='" + bankProvince + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankSubbranch='" + bankSubbranch + '\'' +
                ", bankUnionNumber='" + bankUnionNumber + '\'' +
                ", bankCardNo='" + bankCardNo + '\'' +
                '}';
    }
}
