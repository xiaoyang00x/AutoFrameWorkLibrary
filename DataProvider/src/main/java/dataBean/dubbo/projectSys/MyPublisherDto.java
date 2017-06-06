package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/6/1.
 */
public class MyPublisherDto implements Serializable , IDataBean{

    private String id;

    private static final long serialVersionUID = 3610217781790568188L;
    /**
     * 项目编号
     */
    private String projectCode;
    /**
     * 发布人名称
     */
    private String publisherName;
    /**
     * 法定代表人
     */
    private String legalPerson;
    /**
     *注册地
     */
    private String registrationPlace;
    /**
     * 办公地址
     */
    private String officeSpace;
    /**
     * 联系人
     */
    private String contactsPerson;
    /**
     * 电话
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 邮政编码
     */
    private String postcode;
    /**
     * 创建人
     */
    private String creator;


    /**
     * //发行人id
     */
    private String publisherId;
    /**
     * //删除状态1-正常，0-删除
     */
    private Integer  dataStatus;


    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getRegistrationPlace() {
        return registrationPlace;
    }

    public void setRegistrationPlace(String registrationPlace) {
        this.registrationPlace = registrationPlace;
    }

    public String getOfficeSpace() {
        return officeSpace;
    }

    public void setOfficeSpace(String officeSpace) {
        this.officeSpace = officeSpace;
    }

    public String getContactsPerson() {
        return contactsPerson;
    }

    public void setContactsPerson(String contactsPerson) {
        this.contactsPerson = contactsPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PublisherDto{" +
                "projectCode='" + projectCode + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", legalPerson='" + legalPerson + '\'' +
                ", registrationPlace='" + registrationPlace + '\'' +
                ", officeSpace='" + officeSpace + '\'' +
                ", contactsPerson='" + contactsPerson + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", postcode='" + postcode + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }
}