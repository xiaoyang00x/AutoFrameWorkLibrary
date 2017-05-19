package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;

/**
 * Created by alex on 2017/5/19.
 */
public class ProjectProductRelationQueryDto extends PageQuery {

    private String projectCode;

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
}
