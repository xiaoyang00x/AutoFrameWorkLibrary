package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/6/1.
 */
public class MyProjectMaterialDto  implements Serializable , IDataBean{

    private String id;

    private static final long serialVersionUID = -5075787991048834889L;
    /**
     * 风控业务编号
     */
    private String workNo;
    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 材料披露
     */
    private String materialId;
    /**
     * 材料分类
     */
    private String categoryCode;
    /**
     * 原文件
     */
    private String fileName;
    /**
     * 发布核心材料名称
     */
    private String fileNameCode;
    /**
     * 材料披露url
     */
    private String url;
    /**
     * 披露状态：1-已经披露 0-未披露
     *
     *
     */
    private Integer isPublished;

    private Integer order_seq;

    private String remark;


    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }


    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileNameCode() {
        return fileNameCode;
    }

    public void setFileNameCode(String fileNameCode) {
        this.fileNameCode = fileNameCode == null ? null : fileNameCode.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Integer isPublished) {
        this.isPublished = isPublished;
    }

    public Integer getOrder_seq() {
        return order_seq;
    }

    public void setOrder_seq(Integer order_seq) {
        this.order_seq = order_seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "ProjectMaterialDto{" +
                "workNo='" + workNo + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", materialId='" + materialId + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileNameCode='" + fileNameCode + '\'' +
                ", url='" + url + '\'' +
                ", isPublished=" + isPublished +
                ", order_seq=" + order_seq +
                ", remark='" + remark + '\'' +
                '}';
    }
}