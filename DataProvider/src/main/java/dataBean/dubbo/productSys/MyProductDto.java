package dataBean.dubbo.productSys;

import dataBean.IDataBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by alex on 2017/5/22.
 */
public class MyProductDto implements Serializable , IDataBean{

    private String id;

    /**
     * 产品编号，创建时不填，更新删除时必填，查询时按需要填写
     */
    private String productCode;

    /**
     * 产品名称，必填，确认跟已有产品名称不重复
     */
    private String productName;

    /**
     * 发布人Id ，必填
     */
    private String pubUserId;

    /**
     * 发布人类型，必填
     */
    private Integer pubUserType;

    /**
     * 发布者的ipAddress
     */
    private String ipAddress;

    /**
     * 投标开始时间，必填
     */
    private Date startTime;

    /**
     * 投标结束时间，必填
     */
    private Date endTime;

    /**
     * 产品类型 1 秒钱宝 2 定期项目 3 定期计划
     * 必填
     *
     * @see com.miaoqian.prod.api.enums.ProductType
     */
    private Integer productType;

    /**
     * 产品描述
     * 非必填
     */
    private String description;

    /**
     * 产品状态，必填
     * CREATE(1, "创建"),
     * COMMITTED(2, "提交"),
     * AUDITED(3, "审核"),
     * RELEASE(4, "上线"),
     * OFF_SHELVE(5, "下架");
     *
     * @see com.miaoqian.prod.api.enums.ProductStatus
     */
    private Integer status;

    /**
     * 适用渠道，必填
     *
     * @see com.miaoqian.prod.api.enums.ChannelCode
     */
    private String channelCode;

    /**
     * 满标时间，非必填
     */
    private Date fullTime;

    /**
     * 计息模式 BMB MB，一期默认BMB，不填
     *
     * @see com.miaoqian.prod.api.enums.InterestAccrualMode
     */
    private String interestAccrualMode;

    /**
     * 标的类型 标准标 必填
     *
     * @see com.miaoqian.prod.api.enums.ProductBidType
     */
    private String bidType;

    /**
     * 最大累计投资金额，非必填
     */
    private Double maxInvestAmount;

    /**
     * 每份投资金额，非必填，默认为1.0元
     */
    private Double unitAmount;

    /**
     * 最小投资金额
     */
    private Double minInvestAmount;


//    /**
//     * 续投金额
//     */
//    private Double nextInvestAmount;

    /**
     * 最大年利率
     */
    private Double maxRate;

    /**
     * 产品转让对价，一期不填
     */
    private Double bidPrice;

    /**
     * 标的总额，必填
     */
    private Double bidAmount;

    /**
     * 已投资金额，非必填
     */
    private Double investedAmount;

    /**
     * 冻结金额，非必填
     */
    private Double frozenAmount;


    /**
     * 剩余可投资金额，非必填
     */
    private Double remainAmount;

    /**
     * 所展示的年利率，非必填
     */
    private Double yearRate;


    /**
     * 计息开始时间 1 为次日计息 0 为当日计息
     * 一期默认次日计息，不填
     */
    private Integer interestStartDay;

    /**
     * 产品加息，非必填，默认0
     */
    private Double addInterestRate;

    /**
     * 投资类型 认购 承接 (跟定期项目产品做一个冗余)，一期不填
     *
     * @see com.miaoqian.prod.api.enums.InvestType
     */
    private Integer investType;

    /**
     * 产品过期时间，不填
     */
    private Date expireDate;



    /**
     * 产品还款方式 ，不填
     *
     * @see com.miaoqian.prod.api.enums.RepayType
     */
    private String repayType;

    /**
     * 投资人次，不填
     */
    private int investedCount;

    /**
     * 产品本身的年利率，不填
     */
    private Double productRate;

    /**
     * 是否是转让产品，一期不填，默认为0，不支持转让
     */
    private Integer isTransfer;

    /**
     * 还款状态，非必填
     *
     * @see com.miaoqian.prod.api.enums.ProductRepayStatus
     */
    private Integer repayStatus;

    /**
     * 产品创建时间，必填
     */
    private Date createTime;


    /**
     * 产品显示模板的编号，创建产品必填，其余不填
     */
    private String templateCode;

    /**
     * 产品的标签，多个标签之间以竖线‘|’分隔，非必填
     */
    private String productTag;

    /**
     * 产品操作服部流程的备注，非必填
     * 不加入product的表，
     * 加入到productOperateLog表
     */
    private String operateRemark;

    /**
     * 是否是定向标 0 否 1 是 ，非必填默认为 0 否
     */
    private int isTarget;


    /**
     * 定向投资人（财主）的id，多个使用“|” 分割
     * isTarget为1时，必填
     */
    private String targetCustomerId;


    /**
     * 回购做市商的id，非必填
     */
    private String marketMakerId;


    /**
     * 产品的显示权重属性，是否是推荐产品之类的设置
     */
    private int displayWeight;

    /**
     * 产品的期限天数
     */
    private int productTerm;

    /**
     * 产品是否可以转让 0 不可以 1 可以
     */
    private int canTransfer;

    public int getCanTransfer() {
        return canTransfer;
    }

    public void setCanTransfer(int canTransfer) {
        this.canTransfer = canTransfer;
    }

    public int getProductTerm() {
        return productTerm;
    }

    public void setProductTerm(int productTerm) {
        this.productTerm = productTerm;
    }

    public int getDisplayWeight() {
        return displayWeight;
    }

    public void setDisplayWeight(int displayWeight) {
        this.displayWeight = displayWeight;
    }


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getTargetCustomerId() {
        return targetCustomerId;
    }


    public String getOperateRemark() {
        return operateRemark;
    }

    public void setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getProductTag() {
        return productTag;
    }

    public void setProductTag(String productTag) {
        this.productTag = productTag;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Double getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Double remainAmount) {
        this.remainAmount = remainAmount;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPubUserId() {
        return pubUserId;
    }

    public void setPubUserId(String pubUserId) {
        this.pubUserId = pubUserId;
    }

    public Integer getPubUserType() {
        return pubUserType;
    }

    public void setPubUserType(Integer pubUserType) {
        this.pubUserType = pubUserType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetCustomerId(String targetCustomerId) {
        this.targetCustomerId = targetCustomerId;
    }

    public String getMarketMakerId() {
        return marketMakerId;
    }

    public void setMarketMakerId(String marketMakerId) {
        this.marketMakerId = marketMakerId;
    }

    public int getIsTarget() {
        return isTarget;
    }

    public void setIsTarget(int isTarget) {
        this.isTarget = isTarget;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Date getFullTime() {
        return fullTime;
    }

    public void setFullTime(Date fullTime) {
        this.fullTime = fullTime;
    }

    public String getInterestAccrualMode() {
        return interestAccrualMode;
    }

    public void setInterestAccrualMode(String interestAccrualMode) {
        this.interestAccrualMode = interestAccrualMode;
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType;
    }

    public Double getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public void setMaxInvestAmount(Double maxInvestAmount) {
        this.maxInvestAmount = maxInvestAmount;
    }

    public Double getMinInvestAmount() {
        return minInvestAmount;
    }

    public void setMinInvestAmount(Double minInvestAmount) {
        this.minInvestAmount = minInvestAmount;
    }


    public Double getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(Double maxRate) {
        this.maxRate = maxRate;
    }

    public Double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Double getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(Double investedAmount) {
        this.investedAmount = investedAmount;
    }

    public Double getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(Double frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Double getYearRate() {
        return yearRate;
    }

    public void setYearRate(Double yearRate) {
        this.yearRate = yearRate;
    }

    public Integer getInterestStartDay() {
        return interestStartDay;
    }

    public void setInterestStartDay(Integer interestStartDay) {
        this.interestStartDay = interestStartDay;
    }

    public Double getAddInterestRate() {
        return addInterestRate;
    }

    public void setAddInterestRate(Double addInterestRate) {
        this.addInterestRate = addInterestRate;
    }

    public Double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public Integer getInvestType() {
        return investType;
    }

    public void setInvestType(Integer investType) {
        this.investType = investType;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public int getInvestedCount() {
        return investedCount;
    }

    public void setInvestedCount(int investedCount) {
        this.investedCount = investedCount;
    }

    public Double getProductRate() {
        return productRate;
    }

    public void setProductRate(Double productRate) {
        this.productRate = productRate;
    }

    public Integer getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Integer isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Integer getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(Integer repayStatus) {
        this.repayStatus = repayStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        return "ResProductDto{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", pubUserId='" + pubUserId + '\'' +
                ", pubUserType=" + pubUserType +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", productType=" + productType +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", channelCode='" + channelCode + '\'' +
                ", fullTime=" + fullTime +
                ", interestAccrualMode='" + interestAccrualMode + '\'' +
                ", bidType='" + bidType + '\'' +
                ", maxInvestAmount=" + maxInvestAmount +
                ", unitAmount=" + unitAmount +
                ", minInvestAmount=" + minInvestAmount +
                ", maxRate=" + maxRate +
                ", bidAmount=" + bidAmount +
                ", investedAmount=" + investedAmount +
                ", frozenAmount=" + frozenAmount +
                ", remainAmount=" + remainAmount +
                ", yearRate=" + yearRate +
                ", interestStartDay=" + interestStartDay +
                ", addInterestRate=" + addInterestRate +
                ", investType=" + investType +
                ", expireDate=" + expireDate +
                ", repayType='" + repayType + '\'' +
                ", investedCount=" + investedCount +
                ", productRate=" + productRate +
                ", isTransfer=" + isTransfer +
                ", repayStatus=" + repayStatus +
                ", createTime=" + createTime +
                '}';
    }
}
