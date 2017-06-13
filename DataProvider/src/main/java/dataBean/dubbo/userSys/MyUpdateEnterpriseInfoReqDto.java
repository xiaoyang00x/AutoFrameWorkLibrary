package dataBean.dubbo.userSys;

import dataBean.IDataBean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by guchenglong on 2017/6/22.
 */
public class MyUpdateEnterpriseInfoReqDto implements IDataBean {

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
     * 用户真实姓名，企业名称
     */
    private String enterpriseName;

    /**
     * 证件号码，企业统一社会信用编码
     */
    private String enterpriseCode;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 法人姓名，页面设置
     */
    private String legalPersonName;

    /**
     * 法人身份证号码
     */
    private String legalPersonIdno;

    /**
     * 法人年龄
     */
    private Integer legalPersonAge;

    /**
     * 法人性别,male:男性;female:女性;
     */
    private String legalPersonSex;

    /**
     * 注册资本
     */
    private BigDecimal registeredCapital;

    /**
     * 企业类型
     */
    private String enterpriseType;

    /**
     * 企业住所
     */
    private String enterpriseAddress;

    /**
     * 企业联系人
     */
    private String enterpriseContact;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 负责人名称
     */
    private String responsiblePersonName;

    /**
     * 负责人id
     */
    private String responsiblePersonId;

    /**
     * 企业成立日期
     */
    private Date establishTime;

    /**
     * 营业期限开始时间
     */
    private Date businessTermBeginTime;

    /**
     * 营业期限结束时间
     */
    private Date businessTermEndTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
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

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonIdno() {
        return legalPersonIdno;
    }

    public void setLegalPersonIdno(String legalPersonIdno) {
        this.legalPersonIdno = legalPersonIdno;
    }

    public Integer getLegalPersonAge() {
        return legalPersonAge;
    }

    public void setLegalPersonAge(Integer legalPersonAge) {
        this.legalPersonAge = legalPersonAge;
    }

    public String getLegalPersonSex() {
        return legalPersonSex;
    }

    public void setLegalPersonSex(String legalPersonSex) {
        this.legalPersonSex = legalPersonSex;
    }

    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }


    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseContact() {
        return enterpriseContact;
    }

    public void setEnterpriseContact(String enterpriseContact) {
        this.enterpriseContact = enterpriseContact;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    public void setResponsiblePersonName(String responsiblePersonName) {
        this.responsiblePersonName = responsiblePersonName;
    }

    public String getResponsiblePersonId() {
        return responsiblePersonId;
    }

    public void setResponsiblePersonId(String responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
    }

    public Date getEstablishTime() {
        return establishTime;
    }

    public void setEstablishTime(Date establishTime) {
        this.establishTime = establishTime;
    }

    public Date getBusinessTermBeginTime() {
        return businessTermBeginTime;
    }

    public void setBusinessTermBeginTime(Date businessTermBeginTime) {
        this.businessTermBeginTime = businessTermBeginTime;
    }

    public Date getBusinessTermEndTime() {
        return businessTermEndTime;
    }

    public void setBusinessTermEndTime(Date businessTermEndTime) {
        this.businessTermEndTime = businessTermEndTime;
    }

    @Override
    public String toString() {
        return "MyUpdateEnterpriseInfoReqDto{" +
                "uid='" + uid + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", enterpriseCode='" + enterpriseCode + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", legalPersonName='" + legalPersonName + '\'' +
                ", legalPersonIdno='" + legalPersonIdno + '\'' +
                ", legalPersonAge=" + legalPersonAge +
                ", legalPersonSex='" + legalPersonSex + '\'' +
                ", registeredCapital=" + registeredCapital +
                ", enterpriseType='" + enterpriseType + '\'' +
                ", enterpriseAddress='" + enterpriseAddress + '\'' +
                ", enterpriseContact='" + enterpriseContact + '\'' +
                ", businessScope='" + businessScope + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", responsiblePersonName='" + responsiblePersonName + '\'' +
                ", responsiblePersonId='" + responsiblePersonId + '\'' +
                ", establishTime=" + establishTime +
                ", businessTermBeginTime=" + businessTermBeginTime +
                ", businessTermEndTime=" + businessTermEndTime +
                '}';
    }
}
