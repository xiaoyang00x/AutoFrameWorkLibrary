package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.ProductDto;

import java.util.List;

/**
 * Created by alex on 2017/5/22.
 */
public class MyCurrentProductDto extends ProductDto {

    private String id;

    /**
     * 每天赎回次数限制
     */
    private Integer redemCountPerDay;

    /**
     * 每次赎回金额限制
     */
    private Double redemAmountPerTime;

    /**
     * 没有赎回金额限制
     */
    private Double redemAmountPerMonth;


    private List<String> projectList;

    public Integer getRedemCountPerDay() {
        return redemCountPerDay;
    }

    public void setRedemCountPerDay(Integer redemCountPerDay) {
        this.redemCountPerDay = redemCountPerDay;
    }

    public Double getRedemAmountPerTime() {
        return redemAmountPerTime;
    }

    public void setRedemAmountPerTime(Double redemAmountPerTime) {
        this.redemAmountPerTime = redemAmountPerTime;
    }

    public Double getRedemAmountPerMonth() {
        return redemAmountPerMonth;
    }

    public void setRedemAmountPerMonth(Double redemAmountPerMonth) {
        this.redemAmountPerMonth = redemAmountPerMonth;
    }

    public List<String> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<String> projectList) {
        this.projectList = projectList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ResCurrentProductDto{" +super.toString()+
                "redemCountPerDay=" + redemCountPerDay +
                ", redemAmountPerTime=" + redemAmountPerTime +
                ", redemAmountPerMonth=" + redemAmountPerMonth +
                ", projectList=" + projectList +
                '}';
    }
}
