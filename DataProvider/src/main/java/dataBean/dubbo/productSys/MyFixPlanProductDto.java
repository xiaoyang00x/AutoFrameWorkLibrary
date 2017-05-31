package dataBean.dubbo.productSys;

import java.util.List;

import com.miaoqian.prod.api.dto.request.ProductDto;
import dataBean.IDataBean;

public class MyFixPlanProductDto extends ProductDto implements IDataBean {
    
    private String id;

    /**
     * 定向发布给uid
     */
    private String targetUid;

    /**
     * 产品对应项目编号列表
     */
    private List<String> projectList;

    public String getTargetUid() {
        return targetUid;
    }

    public void setTargetUid(String targetUid) {
        this.targetUid = targetUid;
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

    
    
    
    // @Override
    // public String toString() {
    // final StringBuilder sb = new StringBuilder("ResFixPlanProductDto{");
    // sb.append(", targetUid='").append(targetUid).append('\'');
    // sb.append(", projectList=").append(projectList);
    // sb.append('}');
    // return sb.toString();
    // }

}
