package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;
import dataBean.IDataBean;

import java.util.Date;

/**
 * Created by alex on 2017/6/2.
 */
public class MyProductProjectRelationQueryDto extends PageQuery implements IDataBean{

    private String id;

    /**
     * 项目编号
     */
    private String projectCode;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 最大到期时间，有效且小于到期时间的过滤条件
     */
    private Date maxEndDate;

    /**
     * 最小到期时间，有效且大于等于到期时间的过滤条件
     *
     */
    private Date minEndDate;

    public Date getMinEndDate() {
        return minEndDate;
    }

    public void setMinEndDate(Date minEndDate) {
        this.minEndDate = minEndDate;
    }

    public Date getMaxEndDate() {
        return maxEndDate;
    }

    public void setMaxEndDate(Date maxEndDate) {
        this.maxEndDate = maxEndDate;
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

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
