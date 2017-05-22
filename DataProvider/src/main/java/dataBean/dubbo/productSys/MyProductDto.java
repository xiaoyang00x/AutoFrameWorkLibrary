package dataBean.dubbo.productSys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by alex on 2017/5/22.
 */
public class MyProductDto implements Serializable {

    private String id;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 发布人Id
     */
    private String pubUserId;

    /**
     * 发布人类型
     */
    private Integer pubUserType;

    /**
     * 投标开始时间
     */
    private Date startTime;

    /**
     * 投标结束时间
     */
    private Date endTime;

    /**
     * 产品类型 1 秒钱宝 2 定期项目 3 定期计划
     *
     * @see com.miaoqian.prod.api.enums.ProductType
     */
    private Integer productType;

    /**
     * 产品描述
     */
    private String description;

    /**
     * 产品状态
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
     * 适用渠道
     *
     * @see com.miaoqian.prod.api.enums.ChannelCode
     */
    private String channelCode;

    /**
     * 满标时间
     */
    private Date fullTime;

    /**
     * 计息模式 BMB MB
     *
     * @see com.miaoqian.prod.api.enums.InterestAccrualMode
     */
    private String interestAccrualMode;

    /**
     * 标的类型 标准标
     *
     * @see com.miaoqian.prod.api.enums.ProductBidType
     */
    private String bidType;

    /**
     * 最大累计投资金额
     */
    private Double maxInvestAmount;

    /**
     * 每份投资金额
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
     * 产品转让对价
     */
    private Double bidPrice;

    /**
     * 标的总额
     */
    private Double bidAmount;

    /**
     * 已投资金额
     */
    private Double investedAmount;

    /**
     * 冻结金额
     */
    private Double frozenAmount;


    private Double remainAmount;

    /**
     * 所展示的年利率
     */
    private Double yearRate;


    /**
     * 计息开始时间 1 为次日计息 0 为当日计息
     */
    private Integer interestStartDay;

    /**
     * 加息产品
     */
    private Double addInterestRate;

    /**
     * 投资类型 认购 承接 (跟定期项目产品做一个冗余)
     *
     * @see com.miaoqian.prod.api.enums.InvestType
     */
    private Integer investType;


    private Date expireDate;

    /**
     * 支持的促销
     */
    private List<String> promotionList;

    /**
     * 定期计划和秒钱宝的还款方式为空
     * 只有定期项目产品才有还款方式
     *
     * @see com.miaoqian.prod.api.enums.RepayType
     */
    private String repayType;

    /**
     * 投资人次
     */
    private int investedCount;

    /**
     * 产品本身的年利率
     */
    private Double productRate;

    /**
     * 是否是转让产品
     */
    private Integer isTransfer;

    /**
     * 还款状态
     *
     * @see com.miaoqian.prod.api.enums.ProductRepayStatus
     */
    private Integer repayStatus;

    /**
     * 产品创建时间
     */
    private Date createTime;

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

    public List<String> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<String> promotionList) {
        this.promotionList = promotionList;
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
                ", promotionList=" + promotionList +
                ", repayType='" + repayType + '\'' +
                ", investedCount=" + investedCount +
                ", productRate=" + productRate +
                ", isTransfer=" + isTransfer +
                ", repayStatus=" + repayStatus +
                ", createTime=" + createTime +
                '}';
    }
}