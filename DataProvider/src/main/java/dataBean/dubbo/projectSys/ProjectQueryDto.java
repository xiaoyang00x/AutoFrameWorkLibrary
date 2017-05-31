package dataBean.dubbo.projectSys;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.miaoqian.framework.domain.PageQuery;
import dataBean.IDataBean;

import java.util.List;

/**
 * Created by alex on 2017/5/19.
 */
public class ProjectQueryDto extends PageQuery implements IDataBean{

    private String id;
    //    private String projectCode;
    private String workNo;

    private String borrowerId;

    private String thdAuditStatus;//审核状态: 01-通过 02-拒绝 03-待上传证照 04-待审核 05-待审核证照 06-状态异常

    private String thdAuditDesc;//审核状态描述

    private List<String> projectCodeList;
    /**
     * 还款方式
     */
    private List<String> repayTypes;

    private List<Integer> statusList;

    /**
     * 是否结清
     */
    private Integer isOver;

    public String getProjectCode() {
        if (projectCodeList != null && projectCodeList.size() > 0) {
            return projectCodeList.get(0);
        }
        return null;
    }

    /**
     * 当只有一个projectCode时,调用此方法
     * @param projectCode
     */
    public void setProjectCode(String projectCode) {
        if (projectCode != null && projectCode.length() != 0) {
            projectCodeList = Lists.newArrayList(projectCode);
        }else{
            projectCodeList.add(projectCode);
        }
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public String getThdAuditStatus() {
        return thdAuditStatus;
    }

    public void setThdAuditStatus(String thdAuditStatus) {
        this.thdAuditStatus = thdAuditStatus;
    }

    public String getThdAuditDesc() {
        return thdAuditDesc;
    }

    public void setThdAuditDesc(String thdAuditDesc) {
        this.thdAuditDesc = thdAuditDesc;
    }

    public List<String> getProjectCodeList() {
        return projectCodeList;
    }

    public void setProjectCodeList(List<String> projectCodeList) {
        this.projectCodeList = projectCodeList;
    }

    public Integer getIsOver() {
        return isOver;
    }

    public void setIsOver(Integer isOver) {
        this.isOver = isOver;
    }

    public List<String> getRepayTypes() {
        return repayTypes;
    }

    public void setRepayTypes(List<String> repayTypes) {
        this.repayTypes = repayTypes;
    }

    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("workNo", workNo)
                .add("borrowerId", borrowerId)
                .add("thdAuditStatus", thdAuditStatus)
                .add("thdAuditDesc", thdAuditDesc)
                .add("projectCodeList", projectCodeList)
                .add("repayTypes", repayTypes)
                .toString();
    }
}
