package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/23.
 */
public class MyUserEnterpriseInfoReqDto implements IDataBean{
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /** 企业姓名 */
    private String name;

    /** 证件号码，统一社会信用编码 */
    private String idNo;

    /** 法人姓名，页面设置 */
    private String legalPersonName;

    /** 负责人ID, */
    private String responsiblePersonId;

    /** 页码 */
    private Integer pageNo;

    /** 步长 */
    private Integer pageSize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getResponsiblePersonId() {
        return responsiblePersonId;
    }

    public void setResponsiblePersonId(String responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
    }

    @Override
    public String toString() {
        return "MyUserEnterpriseInfoReqDto{" +
                "name='" + name + '\'' +
                ", idNo='" + idNo + '\'' +
                ", legalPersonName='" + legalPersonName + '\'' +
                ", responsiblePersonId='" + responsiblePersonId + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}
