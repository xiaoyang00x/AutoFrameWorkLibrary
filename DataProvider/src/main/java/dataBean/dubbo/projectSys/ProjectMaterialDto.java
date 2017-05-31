package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/19.
 */
public class ProjectMaterialDto implements Serializable , IDataBean{
    private static final long serialVersionUID = 1600659570322903632L;

    private String id;

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
     * @see com.miaoqian.bid.api.common.enums.LogicType
     *
     */
    private Integer isPublished;


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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectMaterialDto{");
        sb.append("workNo='").append(workNo).append('\'');
        sb.append(", projectCode='").append(projectCode).append('\'');
        sb.append(", materialId='").append(materialId).append('\'');
        sb.append(", categoryCode='").append(categoryCode).append('\'');
        sb.append(", fileName='").append(fileName).append('\'');
        sb.append(", fileNameCode='").append(fileNameCode).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", isPublished=").append(isPublished);
        sb.append('}');
        return sb.toString();
    }
}