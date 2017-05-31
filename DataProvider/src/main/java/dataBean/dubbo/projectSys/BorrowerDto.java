package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/19.
 */
public class BorrowerDto implements Serializable , IDataBean {
    private static final long serialVersionUID = -584796011309237457L;

    private String id;
    /**
     * 借款人ID
     */
    private String borrowerId;
    /**
     * 借款人名称
     */
    private String name;
    /**
     * 借款人类型：01-个人 02-企业
     */
    private String type;
    /**
     * 企业营业执照编码
     */
    private String licenseCode;
    /**
     * 借款人证件类型：00-身份证(type=01时必填)
     */
    private String certificateType;

    /**
     * 证件编号(type=01时必填)
     */
    private String certificateNo;
    /**
     * 手机号码
     */
    private String mobilePhone;
    /**
     * 固定电话
     */
    private String telephone;
    /**
     * 借款人工作单位
     */
    private String workCompany;

    /**
     * 借款人工作年限(单位：年)
     */
    private Integer workYear;
    /**
     * 借款人税后月收入
     */
    private Double income;
    /**
     * 借款人学历
     */
    private String education;
    /**
     * 借款人婚姻状况:1-未婚2-已婚3-离异4-其他
     */
    private Integer maritalStatus;
    /**
     * 借款人地址
     */
    private String address;
    /**
     * 借款人电子邮箱
     */
    private String email;

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode == null ? null : licenseCode.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany == null ? null : workCompany.trim();
    }

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}