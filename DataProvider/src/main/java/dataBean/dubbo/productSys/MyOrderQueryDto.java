package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;
import dataBean.IDataBean;

import java.util.List;


/**
 * Created by alex on 2017/5/18.
 */
public class MyOrderQueryDto extends PageQuery implements IDataBean{

    private String id;

    /**
     * 购买者用户Id
     */
    private String buyerUid;

    /**
     * 产品类型
     */
    private List<Integer> productTypeList;

    /**
     * 转让状态
     */
    private Integer transferStatus;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 是否结清
     * 1 是已结清, 0 是未结清
     */
    private Integer isSettled;

    /**
     * 交易的认购单号
     */
    private String orderSeqNo;

    public String getBuyerUid() {
        return buyerUid;
    }

    public void setBuyerUid(String buyerUid) {
        this.buyerUid = buyerUid;
    }

    public List<Integer> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<Integer> productTypeList) {
        this.productTypeList = productTypeList;
    }

    public Integer getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(Integer isSettled) {
        this.isSettled = isSettled;
    }

    public String getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(String orderSeqNo) {
        this.orderSeqNo = orderSeqNo;
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
        return "OrderQueryDto{" +
                "buyerUid='" + buyerUid + '\'' +
                ", productTypeList=" + productTypeList +
                ", transferStatus=" + transferStatus +
                ", status=" + status +
                ", productCode='" + productCode + '\'' +
                ", isSettled=" + isSettled +
                ", orderSeqNo='" + orderSeqNo + '\'' +
                '}';
    }
}
