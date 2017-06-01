package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class MyProjectDto implements Serializable , IDataBean{

    private String id;
    private static final long serialVersionUID = -8175908245201297458L;
    private String projectName;//项目名称
    private String projectCode;//项目编码
    private String projectType;//项目类型:01-金交所 02-普通 03-债权转让
    private Double bidAmount;//标的金额
    private Double yearRate;//年化利率

    private Date bidStartTime;//募集开始时间
    private  Date bidEndTime;//募集结束日

    private Integer loanPeriod;//贷款期限（天）
    private String repaymentUnit;//还款周期（Y年，M月，D日）

    private String repayType;//还款方式:01- 一次还本付息 02-等额本金 03-等额本息 04-按期付息到期还本 99-其他
    private String businessType;//业务品种:01-房贷类 02-车贷类 03-收益权转让类 04-信用贷款类 05-股票配资类 06-银行承兑汇票 07-商业承兑汇票 08-消费贷款类 09-供应链类 99-其他
    private String borrowerId;//借款人id
    private String auditStatus;//审核状态（包含第三方登记成功）
    private Integer status;//项目状态
    private String depositoryRegisterStatus;//存管登记状态，存管登记状态，01未登记，02登记成功，03登记失败，04撤销中，05撤销失败，06撤销成功
    private String operateIP;//操作者ip


    public String getDepositoryRegisterStatus() {
        return depositoryRegisterStatus;
    }

    public void setDepositoryRegisterStatus(String depositoryRegisterStatus) {
        this.depositoryRegisterStatus = depositoryRegisterStatus;
    }

    /**
     * 已投资金额
     */
    private Double investedAmount;

    /**
     *冻结金额
     */
    private Double frozenAmount;

    /**
     * 占用金额
     */
    private Double occupyAmount  = 0.0D;
    /**
     * 借款用途
     */
    private String loanUse;

    /**
     * 已还款额度
     */
    private Double repayAmount;

    /**
     * 计划第一期还款时间
     */

    private Date repayStartDate;

    /**
     *计划最后一期还款时间
     */

    private Date repayFinishDate;

    private String loanDesc;//借款描述
    private int loanMode;//借款类型
    /**
     *
     */
    private Double lateYearRate;//逾期年利率

    private int maturityCalculationRule;//到期计算规则
    private  int interestMode;//0-单利，1-复利

    private Date interestDate;//起息日

    /**
     * 履行保证金
     */

    private Double vouchAmount;

    private Double liquidatedDamagesRate;//违约金利率

    /**
     * 项目简介
     */

    private String introduction;

    private String repaySource;//还款来源

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
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

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public String getRepaymentUnit() {
        return repaymentUnit;
    }

    public void setRepaymentUnit(String repaymentUnit) {
        this.repaymentUnit = repaymentUnit;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Double getOccupyAmount() {
        return occupyAmount;
    }

    public void setOccupyAmount(Double occupyAmount) {
        this.occupyAmount = occupyAmount;
    }

    public String getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse;
    }

    public Double getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Double repayAmount) {
        this.repayAmount = repayAmount;
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

    public String getLoanDesc() {
        return loanDesc;
    }

    public void setLoanDesc(String loanDesc) {
        this.loanDesc = loanDesc;
    }

    public int getLoanMode() {
        return loanMode;
    }

    public void setLoanMode(int loanMode) {
        this.loanMode = loanMode;
    }

    public Double getLateYearRate() {
        return lateYearRate;
    }

    public void setLateYearRate(Double lateYearRate) {
        this.lateYearRate = lateYearRate;
    }

    public int getMaturityCalculationRule() {
        return maturityCalculationRule;
    }

    public void setMaturityCalculationRule(int maturityCalculationRule) {
        this.maturityCalculationRule = maturityCalculationRule;
    }

    public int getInterestMode() {
        return interestMode;
    }

    public void setInterestMode(int interestMode) {
        this.interestMode = interestMode;
    }

    public Date getInterestDate() {
        return interestDate;
    }

    public void setInterestDate(Date interestDate) {
        this.interestDate = interestDate;
    }

    public Double getVouchAmount() {
        return vouchAmount;
    }

    public void setVouchAmount(Double vouchAmount) {
        this.vouchAmount = vouchAmount;
    }

    public Double getLiquidatedDamagesRate() {
        return liquidatedDamagesRate;
    }

    public void setLiquidatedDamagesRate(Double liquidatedDamagesRate) {
        this.liquidatedDamagesRate = liquidatedDamagesRate;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getRepaySource() {
        return repaySource;
    }

    public void setRepaySource(String repaySource) {
        this.repaySource = repaySource;
    }

    public String getOperateIP() {
        return operateIP;
    }

    public void setOperateIP(String operateIP) {
        this.operateIP = operateIP;
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
        return "ProjectDto{" +
                "projectName='" + projectName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", projectType='" + projectType + '\'' +
                ", bidAmount=" + bidAmount +
                ", yearRate=" + yearRate +
                ", bidStartTime=" + bidStartTime +
                ", bidEndTime=" + bidEndTime +
                ", loanPeriod=" + loanPeriod +
                ", repaymentUnit='" + repaymentUnit + '\'' +
                ", repayType='" + repayType + '\'' +
                ", businessType='" + businessType + '\'' +
                ", borrowerId='" + borrowerId + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                ", status=" + status +
                ", depositoryRegisterStatus='" + depositoryRegisterStatus + '\'' +
                ", operateIP='" + operateIP + '\'' +
                ", investedAmount=" + investedAmount +
                ", frozenAmount=" + frozenAmount +
                ", occupyAmount=" + occupyAmount +
                ", loanUse='" + loanUse + '\'' +
                ", repayAmount=" + repayAmount +
                ", repayStartDate=" + repayStartDate +
                ", repayFinishDate=" + repayFinishDate +
                ", loanDesc='" + loanDesc + '\'' +
                ", loanMode=" + loanMode +
                ", lateYearRate=" + lateYearRate +
                ", maturityCalculationRule=" + maturityCalculationRule +
                ", interestMode=" + interestMode +
                ", interestDate=" + interestDate +
                ", vouchAmount=" + vouchAmount +
                ", liquidatedDamagesRate=" + liquidatedDamagesRate +
                ", introduction='" + introduction + '\'' +
                ", repaySource='" + repaySource + '\'' +
                '}';
    }
}