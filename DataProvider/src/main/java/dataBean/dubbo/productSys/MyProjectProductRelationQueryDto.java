package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;
import dataBean.IDataBean;

/**
 * Created by alex on 2017/5/19.
 */
public class MyProjectProductRelationQueryDto extends PageQuery implements IDataBean {

    private String id;

    private String projectCode;

    private String productCode;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
