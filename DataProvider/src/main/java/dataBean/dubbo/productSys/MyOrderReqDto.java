package dataBean.dubbo.productSys;

import dataBean.IDataBean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class MyOrderReqDto implements Serializable , IDataBean {

    private String id;

    /**
     * 认购交易编号
     */
    private String orderSeqNo;

    /**
     * 交易的金额,转让时和tradePrice可能不一样
     */
    private Double tradeAmount;

    /**
     * 交易的价格
     */
    private Double tradePrice;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 优惠券利率
     */
    private Double couponInterestRate;

    /**
     * 产品的利率
     */
    private Double productInterestRate;

    /**
     * 产品类型
     */
    private Integer productType;

    /**
     * 购买者用户id
     */
    private String buyerUid;

    /**
     * 认购渠道
     */
    private String channelCode;

    /**
     * 交易时间,不传则为当前时间
     */
    private Date tradeTime;

//    private List<OrderPromotionDto> promotionList;

    public String getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(String orderSeqNo) {
        this.orderSeqNo = orderSeqNo;
    }

    public Double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBuyerUid() {
        return buyerUid;
    }

    public void setBuyerUid(String buyerUid) {
        this.buyerUid = buyerUid;
    }

    public Double getCouponInterestRate() {
        return couponInterestRate;
    }

    public void setCouponInterestRate(Double couponInterestRate) {
        this.couponInterestRate = couponInterestRate;
    }

    public Double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Double getProductInterestRate() {
        return productInterestRate;
    }

    public void setProductInterestRate(Double productInterestRate) {
        this.productInterestRate = productInterestRate;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrderReqDto{");
        sb.append("orderSeqNo='").append(orderSeqNo).append('\'');
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", tradePrice=").append(tradePrice);
        sb.append(", productCode='").append(productCode).append('\'');
        sb.append(", couponInterestRate=").append(couponInterestRate);
        sb.append(", productInterestRate=").append(productInterestRate);
        sb.append(", productType=").append(productType);
        sb.append(", buyerUid='").append(buyerUid).append('\'');
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", tradeTime=").append(tradeTime);
        sb.append('}');
        return sb.toString();
    }

}
