package dataBean.dubbo.userSys;

import dataBean.IDataBean;

import java.util.Date;

/**
 * Created by guchenglong on 2017/7/3.
 */
public class MyUserLogPasChaRecordReqDto implements IDataBean {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String mobile;
    private Date beginDate;
    private Date endDate;
    private Integer pageNo;
    private Integer pageSize;

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String toString() {
        return "UserLogPasChaRecordReqDto{mobile='" + this.mobile + '\'' + ", beginDate=" + this.beginDate + ", endDate=" + this.endDate + ", pageNo=" + this.pageNo + ", pageSize=" + this.pageSize + '}';
    }
}
