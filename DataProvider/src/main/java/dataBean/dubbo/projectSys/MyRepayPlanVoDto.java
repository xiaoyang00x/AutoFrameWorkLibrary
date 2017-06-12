package dataBean.dubbo.projectSys;

import com.miaoqian.proj.api.dto.request.RepayPlanDto;
import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by alex on 2017/6/12.
 */
public class MyRepayPlanVoDto extends RepayPlanDto implements Serializable , IDataBean {

    private String id;

    private static final long serialVersionUID = -5187469840322768546L;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 查询条数
     */
    private Integer selectCount;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getSelectCount() {
        return selectCount;
    }

    public void setSelectCount(Integer selectCount) {
        this.selectCount = selectCount;
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
        return "RepayPlanVoDto{" +
                "projectName='" + projectName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", selectCount=" + selectCount +
                '}';
    }
}