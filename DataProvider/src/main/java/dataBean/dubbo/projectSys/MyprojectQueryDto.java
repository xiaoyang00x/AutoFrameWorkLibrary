package dataBean.dubbo.projectSys;

import com.miaoqian.framework.domain.PageQuery;
import com.miaoqian.proj.api.enums.OptimizationType;
import dataBean.IDataBean;

import java.util.Date;
import java.util.List;

/**
 * Created by alex on 2017/6/6.
 */
public class MyprojectQueryDto extends PageQuery implements IDataBean {

    private String id;

    /**
     * 审核状态
     */
    private String thdAuditStatus;
    /***
     * 审核状态描述
     */
    private String thdAuditDesc;
    /**
     * 项目类型:01-债权转让 02-借款 03-金交所
     */
    private String projectType;
    /**
     * 募集开始时间
     */
    private Date bidStartTime;
    /**
     * 募集结束日
     */
    private Date bidEndTime;

    /**
     * 存管登记状态
     *
     * @see com.miaoqian.proj.api.enums.ProjectDepositoryStatus
     */
    private List<String> rRegisterStatuss;

    /**
     * 还款类型集合
     *
     * @see com.miaoqian.proj.api.enums.ProjectRepayStatus
     */
    private List<String> repayTypes;

    /**
     * 项目状态集合
     *
     * @see com.miaoqian.proj.api.enums.ProjectStatus
     */

    private List<Integer> statusList;
    /**
     * 项目编号，支持模糊查询
     */
    private String projectCode;
    /**
     * 项目名称，支持模糊查询
     */
    private String projectName;
    /**
     * 客户名称，支持模糊查询
     */
    private String customerName;


    /**
     * 是否被优化过
     *
     * @see OptimizationType
     */
    private Integer isOptimization;

    public Integer getIsOptimization() {
        return isOptimization;
    }

    public void setIsOptimization(Integer isOptimization) {
        this.isOptimization = isOptimization;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
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

    public List<String> getrRegisterStatuss() {
        return rRegisterStatuss;
    }

    public void setrRegisterStatuss(List<String> rRegisterStatuss) {
        this.rRegisterStatuss = rRegisterStatuss;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
