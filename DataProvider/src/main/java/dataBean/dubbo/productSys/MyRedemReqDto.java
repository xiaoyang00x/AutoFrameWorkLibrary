package dataBean.dubbo.productSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/19.
 */
public class MyRedemReqDto implements Serializable , IDataBean {

    private String id;

    /**
     * 赎回用户Id
     */
    private String redemUid;

    /**
     * 赎回编号
     */
    private String redemSeqNo;

    /**
     * 赎回本金
     */
    private Double tradeAmount;

    /**
     * 赎回手续费
     */
    private Double redemFee;

//    /**
//     * 收手续费所对应的交易金额
//     */
//    private Double feeTradeAmount;

    public String getRedemSeqNo() {
        return redemSeqNo;
    }

    public void setRedemSeqNo(String redemSeqNo) {
        this.redemSeqNo = redemSeqNo;
    }

    public String getRedemUid() {
        return redemUid;
    }

    public void setRedemUid(String redemUid) {
        this.redemUid = redemUid;
    }

    public Double getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(Double tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public Double getRedemFee() {
        return redemFee;
    }

    public void setRedemFee(Double redemFee) {
        this.redemFee = redemFee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RedemReqDto{");
        sb.append("redemUid='").append(redemUid).append('\'');
        sb.append(", redemSeqNo='").append(redemSeqNo).append('\'');
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", redemFee=").append(redemFee);
        sb.append('}');
        return sb.toString();
    }


}
