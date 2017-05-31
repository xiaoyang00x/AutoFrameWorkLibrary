package dataBean.dubbo.productSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/19.
 */
public class MyProductTransferDto implements Serializable , IDataBean {


    private String id;
    /**
     * 由业务方生成一个transferNo, 防止同一个transferNo重复调用
     * 可以不传,如果不传,则不做重复验证
     */
    private String transferNo;
    /**
     * 出让人购买债权时的订单号
     */
    private String orderSeqNo;
    /**
     * 转让交易过来的债权的额度
     */
    private Double transferCreditAmount;
    /**
     * 转让交易过来的债权的交易价格，一般交易价格和额度是不对应的
     */
    private Double transferPrice;

    private String transferUid;

    public String getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(String orderSeqNo) {
        this.orderSeqNo = orderSeqNo;
    }

    public Double getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(Double transferPrice) {
        this.transferPrice = transferPrice;
    }

    public Double getTransferCreditAmount() {
        return transferCreditAmount;
    }

    public void setTransferCreditAmount(Double transferCreditAmount) {
        this.transferCreditAmount = transferCreditAmount;
    }

    public String getTransferUid() {
        return transferUid;
    }

    public void setTransferUid(String transferUid) {
        this.transferUid = transferUid;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductTransferDto{");
        sb.append("orderSeqNo='").append(orderSeqNo).append('\'');
        sb.append(", transferCreditAmount=").append(transferCreditAmount);
        sb.append(", transferPrice=").append(transferPrice);
        sb.append(", transferUid='").append(transferUid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
