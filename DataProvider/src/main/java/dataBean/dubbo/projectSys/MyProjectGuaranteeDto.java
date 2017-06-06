package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/31.
 */
public class MyProjectGuaranteeDto implements Serializable, IDataBean {

    private String id ;

    private static final long serialVersionUID = -2947823475387108653L;
    /**
     * 项目编号
     */
    private String projectCode;
    /**
     * 担保方式
     */
    private String guaranteeMethod;
    /**
     * 担保详情
     */
    private String guaranteeInfo;
    /**
     * 个人姓名，企业名称
     */
    private String guaranteeName;
    /**
     * 企业id
     */
    private String enterpriseId;
    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 担保方式id
     */
    private String guaranteeId;
    /**
     * 删除状态
     */
    private Integer dataStatus;

    public String getGuaranteeId() {
        return guaranteeId;
    }

    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getGuaranteeMethod() {
        return guaranteeMethod;
    }

    public void setGuaranteeMethod(String guaranteeMethod) {
        this.guaranteeMethod = guaranteeMethod;
    }

    public String getGuaranteeInfo() {
        return guaranteeInfo;
    }

    public void setGuaranteeInfo(String guaranteeInfo) {
        this.guaranteeInfo = guaranteeInfo;
    }

    public String getGuaranteeName() {
        return guaranteeName;
    }

    public void setGuaranteeName(String guaranteeName) {
        this.guaranteeName = guaranteeName;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
        return "ProjectGuaranteeDto{" +
                "projectCode='" + projectCode + '\'' +
                ", guaranteeMethod='" + guaranteeMethod + '\'' +
                ", guaranteeInfo='" + guaranteeInfo + '\'' +
                ", guaranteeName='" + guaranteeName + '\'' +
                ", enterpriseId='" + enterpriseId + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}