package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class RepayApplyDto implements Serializable , IDataBean{

    private String id;
    /**
     * 借款人Id
     */
    private String borrowerId;

    /**
     * 项目编号
     */
    private String projectCode;

    /**
     * 担保方垫资时,填写还款的用户Id
     */
    private String repayUid;

    /**
     *提前还款时,填写的还款本金
     */
    private Double repayAmount;

    /**
     *提前还款时,填写的还款利息，不用填写，冗余字段，
     *提前还款申请计算大概利息返回使用
     */
    private Double repayInterest;

    /**
     * 还款的时间类型
     */
    private String repayTimeType;

    /**
     * 如果为提前还款或者逾期还款,填写还款日期
     */
    private Date repayDate;

    /**
     * 是否是垫付
     */
    private Integer isPad;

    /**
     * 还款人类型
     */
    private String repayUserType;


    public String getRepayUserType() {
        return repayUserType;
    }

    public void setRepayUserType(String repayUserType) {
        this.repayUserType = repayUserType;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }
    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getRepayUid() {
        return repayUid;
    }

    public void setRepayUid(String repayUid) {
        this.repayUid = repayUid;
    }

    public Double getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(Double repayAmount) {
        this.repayAmount = repayAmount;
    }

    public String getRepayTimeType() {
        return repayTimeType;
    }

    public void setRepayTimeType(String repayTimeType) {
        this.repayTimeType = repayTimeType;
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public Integer getIsPad() {
        return isPad;
    }

    public void setIsPad(Integer isPad) {
        this.isPad = isPad;
    }

    public Double getRepayInterest() {
        return repayInterest;
    }

    public void setRepayInterest(Double repayInterest) {
        this.repayInterest = repayInterest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
