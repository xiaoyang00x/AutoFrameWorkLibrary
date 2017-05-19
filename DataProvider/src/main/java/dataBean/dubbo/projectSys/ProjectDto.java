package dataBean.dubbo.projectSys;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class ProjectDto implements Serializable {
    private static final long serialVersionUID = 3891208550881287359L;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目编号
     */
    private String projectCode;
    /**
     * 风控业务编号
     */
    private String workNo;


    /**
     * 标的类型:01-信用 02-抵押 03-债权转让 99-其他
     */
    private String bidType;
    /**
     * 标的金额
     */
    private Double bidAmount;
    /**
     * 年化利率
     */
    private Double yearRate;
    /**
     * 最低投标份数
     */
    private Integer minInvestCount;

    /**
     * 每一份投标金额
     */
    private Double unitAmount;
    /**
     * 最低投标金额
     */
    private Double minInvestAmount;
    /**
     * 最高投标金额
     */
    private Double maxInvestAmount;
    /**
     * 应还总利息
     */
    private Double totalInterest;
    /**
     * 投标开始时间
     */
    private Date bidStartTime;
    /**
     * 投标结束时间
     */
    private Date bidEndTime;
    /**
     * 还款时间
     */
    private Date repayTime;

    /**
     * 计息模式 满标 不满标
     */
    private String interestAccrualMode;
    /**
     * 最后还款时间
     */
    private Date lastRepayTime;
    /**
     * 贷款期限
     */
    private Integer loanPeriod;
    /**
     * 借款期限单位（Y年，M月，D日）
     */
    private String loanPeriodUnit;
    /**
     * 还款方式:01- 一次还本付息 02-等额本金 03-等额本息 04-按期付息到期还本 99-其他
     */
    private String repayType;
    /**
     * 本息保障：01-保本保息 02-保本不保息 03-不保本不保息
     */
    private String guaranteeType;
    /**
     * 标的产品类型:01-房贷类 02-车贷类 03-收益权转让类 04-信用贷款类 05-股票配资类 06-银行承兑汇票 07-商业承兑汇票 08-消费贷款类 09-供应链类 99-其他
     */
    private String bidProductType;
    /**
     * 是否需要垫资:0-不需要 1-需要
     */
    private Integer isPadFunded;
    /**
     * 风险控制类型：01-抵（质）押 02-共管账户 03-担保 04-信用无担保 99-其他
     */
    private String riskCtrlType;
    /**
     * 借款人ID 来自用户服务的userid
     */

    private String borrowerId;//TODO 转换成汇付的客户ID

    /**
     * 借款用途
     */
    private String loanUse;

    /**
     * 第一期还款时间
     */
    private Date repayStartDate;

    /**
     *最后一期还款时间
     */
    private Date repayFinishDate;

    /**
     * 还款来源
     */
    private String repaySource;

    /**
     * 担保方式描述
     */
    private String guaranteeTypeDesc;

    /**
     * 推荐机构
     */
    private String recommendOrg;

    /**
     * 履行保证金
     */
    private Double vouchAmount;

    /**
     * 项目简介
     */
    private String introduction;

    /**
     *逾期年利率
     */
    private Double lateYearRate;

    /**
     * 违约年利率
     */
    private Double breachYearRate;

    /**
     * 借款描述
     */
    private String loanDesc;

    /**
     * 借款类型
     */
    private Integer loanMode;

    /**
     * 业务品种
     */
    private String businessType;

    /**
     * 项目发布方
     */
    private String publisher;

    /**
     * 风险审核方
     */
    private String  riskAuditor;

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType == null ? null : bidType.trim();
    }

    public Double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Double getYearRate() {
        return yearRate;
    }

    public void setYearRate(Double yearRate) {
        this.yearRate = yearRate;
    }


    public Integer getMinInvestCount() {
        return minInvestCount;
    }

    public void setMinInvestCount(Integer minInvestCount) {
        this.minInvestCount = minInvestCount;
    }

    public Double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Double unitAmount) {
        this.unitAmount = unitAmount;
    }

    public Double getMinInvestAmount() {
        return minInvestAmount;
    }

    public void setMinInvestAmount(Double minInvestAmount) {
        this.minInvestAmount = minInvestAmount;
    }

    public Double getMaxInvestAmount() {
        return maxInvestAmount;
    }

    public void setMaxInvestAmount(Double maxInvestAmount) {
        this.maxInvestAmount = maxInvestAmount;
    }

    public Double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(Double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public Date getBidStartTime() {
        return bidStartTime;
    }

    public void setBidStartTime(Date bidStartTime) {
        this.bidStartTime = bidStartTime;
    }

    public Date getBidEndTime() {
        return bidEndTime;
    }

    public void setBidEndTime(Date bidEndTime) {
        this.bidEndTime = bidEndTime;
    }

    public Date getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    public Date getLastRepayTime() {
        return lastRepayTime;
    }

    public void setLastRepayTime(Date lastRepayTime) {
        this.lastRepayTime = lastRepayTime;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public String getLoanPeriodUnit() {
        return loanPeriodUnit;
    }

    public void setLoanPeriodUnit(String loanPeriodUnit) {
        this.loanPeriodUnit = loanPeriodUnit == null ? null : loanPeriodUnit.trim();
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getBidProductType() {
        return bidProductType;
    }

    public void setBidProductType(String bidProductType) {
        this.bidProductType = bidProductType == null ? null : bidProductType.trim();
    }

    public Integer getIsPadFunded() {
        return isPadFunded;
    }

    public void setIsPadFunded(Integer isPadFunded) {
        this.isPadFunded = isPadFunded;
    }

    public String getRiskCtrlType() {
        return riskCtrlType;
    }

    public void setRiskCtrlType(String riskCtrlType) {
        this.riskCtrlType = riskCtrlType == null ? null : riskCtrlType.trim();
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId == null ? null : borrowerId.trim();
    }

    public String getInterestAccrualMode() {
        return interestAccrualMode;
    }

    public void setInterestAccrualMode(String interestAccrualMode) {
        this.interestAccrualMode = interestAccrualMode;
    }

    public String getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse;
    }


    public Date getRepayStartDate() {
        return repayStartDate;
    }

    public void setRepayStartDate(Date repayStartDate) {
        this.repayStartDate = repayStartDate;
    }

    public Date getRepayFinishDate() {
        return repayFinishDate;
    }

    public void setRepayFinishDate(Date repayFinishDate) {
        this.repayFinishDate = repayFinishDate;
    }

    public String getRepaySource() {
        return repaySource;
    }

    public void setRepaySource(String repaySource) {
        this.repaySource = repaySource;
    }

    public String getGuaranteeTypeDesc() {
        return guaranteeTypeDesc;
    }

    public void setGuaranteeTypeDesc(String guaranteeTypeDesc) {
        this.guaranteeTypeDesc = guaranteeTypeDesc;
    }

    public String getRecommendOrg() {
        return recommendOrg;
    }

    public void setRecommendOrg(String recommendOrg) {
        this.recommendOrg = recommendOrg;
    }

    public Double getVouchAmount() {
        return vouchAmount;
    }

    public void setVouchAmount(Double vouchAmount) {
        this.vouchAmount = vouchAmount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getLateYearRate() {
        return lateYearRate;
    }

    public void setLateYearRate(Double lateYearRate) {
        this.lateYearRate = lateYearRate;
    }

    public Double getBreachYearRate() {
        return breachYearRate;
    }

    public void setBreachYearRate(Double breachYearRate) {
        this.breachYearRate = breachYearRate;
    }

    public String getLoanDesc() {
        return loanDesc;
    }

    public void setLoanDesc(String loanDesc) {
        this.loanDesc = loanDesc;
    }

    public Integer getLoanMode() {
        return loanMode;
    }

    public void setLoanMode(Integer loanMode) {
        this.loanMode = loanMode;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getRiskAuditor() {
        return riskAuditor;
    }

    public void setRiskAuditor(String riskAuditor) {
        this.riskAuditor = riskAuditor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectDto{");
        sb.append("projectName='").append(projectName).append('\'');
        sb.append(", workNo='").append(workNo).append('\'');
        sb.append(", bidType='").append(bidType).append('\'');
        sb.append(", bidAmount=").append(bidAmount);
        sb.append(", yearRate=").append(yearRate);
        sb.append(", minInvestCount=").append(minInvestCount);
        sb.append(", unitAmount=").append(unitAmount);
        sb.append(", minInvestAmount=").append(minInvestAmount);
        sb.append(", maxInvestAmount=").append(maxInvestAmount);
        sb.append(", totalInterest=").append(totalInterest);
        sb.append(", bidStartTime=").append(bidStartTime);
        sb.append(", bidEndTime=").append(bidEndTime);
        sb.append(", repayTime=").append(repayTime);
        sb.append(", interestAccrualMode='").append(interestAccrualMode).append('\'');
        sb.append(", lastRepayTime=").append(lastRepayTime);
        sb.append(", loanPeriod=").append(loanPeriod);
        sb.append(", loanPeriodUnit='").append(loanPeriodUnit).append('\'');
        sb.append(", repayType='").append(repayType).append('\'');
        sb.append(", guaranteeType='").append(guaranteeType).append('\'');
        sb.append(", bidProductType='").append(bidProductType).append('\'');
        sb.append(", isPadFunded=").append(isPadFunded);
        sb.append(", riskCtrlType='").append(riskCtrlType).append('\'');
        sb.append(", borrowerId='").append(borrowerId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}