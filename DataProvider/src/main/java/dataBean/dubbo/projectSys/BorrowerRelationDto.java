package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/19.
 */
public class BorrowerRelationDto implements Serializable , IDataBean {
    private static final long serialVersionUID = 1233856752637017664L;

    private String id;

    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 借款人ID
     */
    private String borrowerId;

    /**
     * 借款合同id
     */
    private String loanContId;
    /**
     * 原合同编号
     */
    private String oldContId;
    /**
     * 原合同名称
     */
    private String oldContName;
    /**
     * 债权人简称
     */
    private String creditor;
    /**
     * 债权人名称
     */
    private String creditorName;
    /**
     * 债权人地址
     */
    private String creditorAddress;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getLoanContId() {
        return loanContId;
    }

    public void setLoanContId(String loanContId) {
        this.loanContId = loanContId == null ? null : loanContId.trim();
    }

    public String getOldContId() {
        return oldContId;
    }

    public void setOldContId(String oldContId) {
        this.oldContId = oldContId == null ? null : oldContId.trim();
    }

    public String getOldContName() {
        return oldContName;
    }

    public void setOldContName(String oldContName) {
        this.oldContName = oldContName == null ? null : oldContName.trim();
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor == null ? null : creditor.trim();
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName == null ? null : creditorName.trim();
    }

    public String getCreditorAddress() {
        return creditorAddress;
    }

    public void setCreditorAddress(String creditorAddress) {
        this.creditorAddress = creditorAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BorrowerRelationDto{" +
                "projectCode='" + projectCode + '\'' +
                ", borrowerId='" + borrowerId + '\'' +
                ", loanContId='" + loanContId + '\'' +
                ", oldContId='" + oldContId + '\'' +
                ", oldContName='" + oldContName + '\'' +
                ", creditor='" + creditor + '\'' +
                ", creditorName='" + creditorName + '\'' +
                ", creditorAddress='" + creditorAddress + '\'' +
                '}';
    }
}
