package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alex on 2017/6/8.
 */
public class MyRepayPlanDto implements Serializable , IDataBean{

    private String id;


    private static final long serialVersionUID = -8880465577395717854L;
    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 回款计划编号
     */
    private String planId;
    /**
     * 回款期数
     */
    private Integer repayTerm;
    /**
     * 回款日期
     */
    private Date repayDate;
    /**
     * 回款本金
     */
    private Double repayAmount;
    /**
     * 回款利息
     */
    private Double repayInterest;
    /**
     * 当期债权款
     */
    private Double currentDebtAmount;
    /**
     * 当期保证金
     */
    private Double currentVouchAmount;
    /**
     * 当期合计
     */
    private Double currentSumAmount;
    /**
     * 币种:0-人民币，1-美元，2-欧元，3-其他币种
     */
    private Integer currency;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public Integer getRepayTerm() {
        return repayTerm;
    }

    public void setRepayTerm(Integer repayTerm) {
        this.repayTerm = repayTerm;
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public Double getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Double repayAmount) {
        this.repayAmount = repayAmount;
    }

    public Double getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(Double repayInterest) {
        this.repayInterest = repayInterest;
    }

    public Double getCurrentDebtAmount() {
        return currentDebtAmount;
    }

    public void setCurrentDebtAmount(Double currentDebtAmount) {
        this.currentDebtAmount = currentDebtAmount;
    }

    public Double getCurrentVouchAmount() {
        return currentVouchAmount;
    }

    public void setCurrentVouchAmount(Double currentVouchAmount) {
        this.currentVouchAmount = currentVouchAmount;
    }

    public Double getCurrentSumAmount() {
        return currentSumAmount;
    }

    public void setCurrentSumAmount(Double currentSumAmount) {
        this.currentSumAmount = currentSumAmount;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
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
        return "RepayPlanDto{" +
                "projectCode='" + projectCode + '\'' +
                ", planId='" + planId + '\'' +
                ", repayTerm=" + repayTerm +
                ", repayDate=" + repayDate +
                ", repayAmount=" + repayAmount +
                ", repayInterest=" + repayInterest +
                ", currentDebtAmount=" + currentDebtAmount +
                ", currentVouchAmount=" + currentVouchAmount +
                ", currentSumAmount=" + currentSumAmount +
                ", currency=" + currency +
                '}';
    }
}
