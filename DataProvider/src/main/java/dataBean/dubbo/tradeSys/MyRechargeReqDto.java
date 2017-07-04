package dataBean.dubbo.tradeSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/2.
 */
public class MyRechargeReqDto implements IDataBean{
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String seqNo;
    private String uid;
    private String channel;
    private Double amount;
    private String returnUrl;
    private String svrAuthCode;
    private String smsCode;

    public MyRechargeReqDto() {
    }

    public String getSeqNo() {
        return this.seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getSvrAuthCode() {
        return this.svrAuthCode;
    }

    public void setSvrAuthCode(String svrAuthCode) {
        this.svrAuthCode = svrAuthCode;
    }

    public String getSmsCode() {
        return this.smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String toString() {
        return "RechargeReqDto{seqNo='" + this.seqNo + '\'' + ", uid='" + this.uid + '\'' + ", channel='" + this.channel + '\'' + ", amount=" + this.amount + ", returnUrl='" + this.returnUrl + '\'' + ", svrAuthCode='" + this.svrAuthCode + '\'' + ", smsCode='" + this.smsCode + '\'' + '}';
    }
}
