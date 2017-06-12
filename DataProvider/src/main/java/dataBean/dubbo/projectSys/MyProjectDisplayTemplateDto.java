package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/6/8.
 */
public class MyProjectDisplayTemplateDto implements Serializable , IDataBean{

    private String id;

    private static final long serialVersionUID = -179947908547513667L;
    /**
     * 模板id
     */
    private String templateId;
    /**
     *项目模板信息json串
     */
    private String projectTemplate;
    /**
     * 产品模板json串
     */
    private String productTemplate;
    /**
     * 项目编号
     */
    private String projectCode;
    /**
     * 创建者
     */
    private String createName;


    @Override
    public String toString() {
        return "ProjectDisplayTemplateDto{" +
                "templateId='" + templateId + '\'' +
                ", projectTemplate='" + projectTemplate + '\'' +
                ", productTemplate='" + productTemplate + '\'' +
                ", projectCode='" + projectCode + '\'' +
                '}';
    }


    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getProjectTemplate() {
        return projectTemplate;
    }

    public void setProjectTemplate(String projectTemplate) {
        this.projectTemplate = projectTemplate;
    }

    public String getProductTemplate() {
        return productTemplate;
    }

    public void setProductTemplate(String productTemplate) {
        this.productTemplate = productTemplate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }
}