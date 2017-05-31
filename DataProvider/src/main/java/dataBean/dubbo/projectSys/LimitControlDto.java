package dataBean.dubbo.projectSys;

import dataBean.IDataBean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class LimitControlDto implements Serializable , IDataBean {
    private static final long serialVersionUID = -4064512181068651615L;

    private String id;

    /**
     * 项目编码
     */
    private String projectCode;
    /**
     * 回款编码
     */
    private String planId;
    /**
     * 期次
     */
    private Integer term;
    /**
     * 开始日期
     */
    private Date beginTime;
    /**
     * 结束日期
     */
    private Date endTime;
    /**
     * 额度上限
     */
    private String limitAmount;
    /**
     * 币种:0-人民币，1-美元，2-欧元，3-其他币种
     * @see com.miaoqian.bid.api.project.enums.CurrencyType
     */
    private Integer currency;


    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId == null ? null : planId.trim();
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(String limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}