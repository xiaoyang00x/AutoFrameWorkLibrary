package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.SupplyProjectSubParamDto;
import dataBean.IDataBean;

import java.util.Date;
import java.util.List;

/**
 * Created by alex on 2017/6/2.
 */
public class MySupplyProjectParamDto implements IDataBean{

    private String id;

    /**
     * 发布人Id ，必填
     */
    private String pubUserId;

    /**
     * 发布人类型，必填
     */
    private Integer pubUserType;

    /**
     * 顶标操作时间
     */
    private Date supplyDate;

    /**
     * 操作ip来源
     */
    private String ipAddress;


    /**
     * 顶标项目额度列表
     */
    private List<SupplyProjectSubParamDto> supplyProjectSubParamDtoList;

    public String getPubUserId() {
        return pubUserId;
    }

    public void setPubUserId(String pubUserId) {
        this.pubUserId = pubUserId;
    }

    public Integer getPubUserType() {
        return pubUserType;
    }

    public void setPubUserType(Integer pubUserType) {
        this.pubUserType = pubUserType;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<SupplyProjectSubParamDto> getSupplyProjectSubParamDtoList() {
        return supplyProjectSubParamDtoList;
    }

    public void setSupplyProjectSubParamDtoList(List<SupplyProjectSubParamDto> supplyProjectSubParamDtoList) {
        this.supplyProjectSubParamDtoList = supplyProjectSubParamDtoList;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
