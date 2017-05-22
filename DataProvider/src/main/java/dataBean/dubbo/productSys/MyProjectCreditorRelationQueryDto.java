package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;

/**
 * Created by alex on 2017/5/19.
 */
public class MyProjectCreditorRelationQueryDto extends PageQuery {


    private String id ;

    /**
     * 项目编号
     */
    private String projectCode;

    /**
     * 产品编号
     */
    private String productCode;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProjectCreditorRelationQueryDto{" +
                "projectCode='" + projectCode + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}