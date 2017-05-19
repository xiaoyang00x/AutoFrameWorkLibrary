package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;

/**
 * Created by alex on 2017/5/19.
 */
public class UserCreditRelationQueryDto extends PageQuery {

    /**
     * 购买者Id
     */
    private String buyerUid;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 产品类型
     */
    private Integer productType;

    /**
     * 项目编号
     */
    private String projectCode;

    private String orderSeqNo;

    public String getBuyerUid() {
        return buyerUid;
    }

    public void setBuyerUid(String buyerUid) {
        this.buyerUid = buyerUid;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(String orderSeqNo) {
        this.orderSeqNo = orderSeqNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserCreditRelationQueryDto{");
        sb.append("buyerUid='").append(buyerUid).append('\'');
        sb.append(", productCode='").append(productCode).append('\'');
        sb.append(", productType=").append(productType);
        sb.append(", projectCode='").append(projectCode).append('\'');
        sb.append(", orderSeqNo='").append(orderSeqNo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
