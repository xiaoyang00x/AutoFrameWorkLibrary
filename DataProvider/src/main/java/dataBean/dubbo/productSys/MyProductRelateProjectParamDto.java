package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.ProductOperateParamDto;
import com.miaoqian.prod.api.dto.request.ProjectRelateSubParamDto;
import dataBean.IDataBean;

import java.util.List;

/**
 * Created by alex on 2017/5/22.
 */
public class MyProductRelateProjectParamDto extends ProductOperateParamDto implements IDataBean{

    private String id;

    /**
     * 产品项目关联的记录
     */
    private List<ProjectRelateSubParamDto> relateList;

    public List<ProjectRelateSubParamDto> getRelateList() {
        return relateList;
    }

    public void setRelateList(List<ProjectRelateSubParamDto> relateList) {
        this.relateList = relateList;
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
        final StringBuilder sb = new StringBuilder("ProductRelateProjectParam{");
        sb.append("productCode='").append(this.getProductCode()).append('\'');
        sb.append(", relateList=").append(relateList);
        sb.append('}');
        return sb.toString();
    }
}

