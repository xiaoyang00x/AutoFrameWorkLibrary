package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.ProductDto;

public class MyFixProjectProductDto extends ProductDto {

    private String id;

    /**
     * 最少保持多少天后可转让
     */
    private Integer minKeepTrans;

    /**
     * 是否支持转让
     */
    private Integer canTransfer;

    /**
     * 项目编号
     */
    private String projectCode;

    /**
     * 定向到用户 Id
     */
    private String targetUid;

    /**
     * 如果是转让产品,则有前一个产品的code
     */
    private String previousCode;

    /**
     * 上一次（认购、转让）交易单号
     */
    private String previousSeqNo;

    /**
     * 首次认购交易单号
     */
    private String originSeqNo;

    /**
     * 投资类型 认购 承接
     * 
     * @see com.miaoqian.bid.api.product.enums.InvestType
     */
    private Integer investType;

    /**
     * 借款人 id
     */
    private String borrowerId;

    public Integer getMinKeepTrans() {
        return minKeepTrans;
    }

    public void setMinKeepTrans(Integer minKeepTrans) {
        this.minKeepTrans = minKeepTrans;
    }

    public Integer getCanTransfer() {
        return canTransfer;
    }

    public void setCanTransfer(Integer canTransfer) {
        this.canTransfer = canTransfer;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getTargetUid() {
        return targetUid;
    }

    public void setTargetUid(String targetUid) {
        this.targetUid = targetUid;
    }

    public String getPreviousCode() {
        return previousCode;
    }

    public void setPreviousCode(String previousCode) {
        this.previousCode = previousCode;
    }

    public Integer getInvestType() {
        return investType;
    }

    public void setInvestType(Integer investType) {
        this.investType = investType;
    }

    public String getPreviousSeqNo() {
        return previousSeqNo;
    }

    public void setPreviousSeqNo(String previousSeqNo) {
        this.previousSeqNo = previousSeqNo;
    }

    public String getOriginSeqNo() {
        return originSeqNo;
    }

    public void setOriginSeqNo(String originSeqNo) {
        this.originSeqNo = originSeqNo;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        return "ResFixProjectProductDto{" + "minKeepTrans=" + minKeepTrans + ", canTransfer=" + canTransfer
                + ", projectCode='" + projectCode + '\'' + ", targetUid='" + targetUid + '\'' + ", previousCode='"
                + previousCode + '\'' + ", previousSeqNo='" + previousSeqNo + '\'' + ", originSeqNo='" + originSeqNo
                + '\'' + ", investType=" + investType + ", borrowerId='" + borrowerId + '\'' + '}';
    }
}
