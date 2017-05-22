package dataBean.dubbo.productSys;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/22.
 */
public class MyProjectRelateSubParamDto implements Serializable {

    private String id;

    private String projectCode;

    private Double occupyAmount;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public Double getOccupyAmount() {
        return occupyAmount;
    }

    public void setOccupyAmount(Double occupyAmount) {
        this.occupyAmount = occupyAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectRelateSubParam{");
        sb.append("projectCode='").append(projectCode).append('\'');
        sb.append(", occupyAmount=").append(occupyAmount);
        sb.append('}');
        return sb.toString();
    }
}
