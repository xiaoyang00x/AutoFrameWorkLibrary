package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.ProductOperateParamDto;
import com.miaoqian.prod.api.dto.request.ProjectRelateSubParamDto;

import java.util.List;

/**
 * Created by alex on 2017/5/22.
 */
public class MyProductRelateProjectParamDto extends ProductOperateParamDto {

    private String id;

    private String productCode;

    private List<ProjectRelateSubParamDto> relateList;

    @Override
    public String getProductCode() {
        return productCode;
    }

    @Override
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public List<ProjectRelateSubParamDto> getRelateList() {
        return relateList;
    }

    public void setRelateList(List<ProjectRelateSubParamDto> relateList) {
        this.relateList = relateList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductRelateProjectParam{");
        sb.append("productCode='").append(productCode).append('\'');
        sb.append(", relateList=").append(relateList);
        sb.append('}');
        return sb.toString();
    }
}
