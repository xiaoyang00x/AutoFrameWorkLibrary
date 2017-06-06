package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/6/1.
 */
public class MyProjectMaterialDto implements Serializable, IDataBean {

    private String id;

    private static final long serialVersionUID = -5075787991048834889L;
    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 材料披露
     */
    private String materialId;

    /**
     * 原文件
     */
    private String fileName;

    /**
     * 材料披露url
     */
    private String url;

    /**
     * 备注
     */
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
                "projectCode='" + projectCode + '\'' +
                ", materialId='" + materialId + '\'' +
                ", fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                ", remarks='"+remarks + '\''+
                '}';
    }
}