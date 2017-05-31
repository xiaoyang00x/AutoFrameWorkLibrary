package dataBean.dubbo.productSys;

import com.miaoqian.framework.domain.PageQuery;
import com.miaoqian.prod.api.enums.OrderByType;
import com.miaoqian.prod.api.enums.ProdOrderByField;
import dataBean.IDataBean;

import java.util.Date;
import java.util.List;


/**
 * Created by alex on 2017/5/19.
 */
public class MyProductQueryDto extends PageQuery implements IDataBean {

    public MyProductQueryDto(){
        super();
        this.setPageIndex(1);
        this.setPageSize(10);
    }

    private String id;



    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 使用渠道
     * @see com.miaoqian.prod.api.enums.ChannelCode
     */
    private String channelCode;

    /**
     * 状态
     */
    private List<Integer> statusList;

    /**
     * 产品类型  秒钱宝 定期计划 定期项目
     * @see com.miaoqian.prod.api.enums.ProductType
     */
    private List<Integer> productTypeList;

    /**
     * 投资类型 认购 、承接转让产品
     * @see com.miaoqian.prod.api.enums.InvestType
     */
    private Integer investType;
    /**
     * 结果排序字段
     */
    private ProdOrderByField orderByField;
    /**
     * 结果排序的类型 升序 降序
     *
     */
    private OrderByType orderByType;

    /**
     * 是否是定向发布到某个用户的产品
     * 定向产品不在普通用户产品列表展示
     */
    private Integer isTarget = 0;

    /**
     * 是否是转让产品
     */
    private Integer isTransfer = 0;

    /**
     * 最小年利率, 和maxYearRate 同时传可支持利率范围查询
     */
    private Double minYearRate;

    /**
     * 最大年利率
     */
    private Double maxYearRate;

    /**
     * 最小过期日期, 和 maxExpireDate 同时传,支持期限范围查询
     */
    private Date minExpireDate;

    /**
     * 最大过期日期
     */
    private Date maxExpireDate;

    /**
     * 还款方式
     */
    private String repayType;

    /**
     * 产品标的类型
     * @see com.miaoqian.prod.api.enums.ProductBidType
     */
    private List<String> bidTypes;

    /**
     * 不包含的产品标的类型
     * @see com.miaoqian.prod.api.enums.ProductBidType
     */
    private String excludeBidType;

    /**
     * 根据用户Id查询发布或转让的产品
     */
    private String pubUserId;

    /**
     * 最小投资金额限制,查询大于等于该金额
     */
    private Double limitMinInvestAmount;

    /**
     * 产品状态
     */
    private String productStatus;

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public List<String> getBidTypes() {
        return bidTypes;
    }

    public void setBidTypes(List<String> bidTypes) {
        this.bidTypes = bidTypes;
    }

    public String getExcludeBidType() {
        return excludeBidType;
    }

    public void setExcludeBidType(String excludeBidType) {
        this.excludeBidType = excludeBidType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public List<Integer> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Integer> statusList) {
        this.statusList = statusList;
    }

    public List<Integer> getProductTypeList() {
        return productTypeList;
    }

    public void setProductTypeList(List<Integer> productTypeList) {
        this.productTypeList = productTypeList;
    }

    public Integer getInvestType() {
        return investType;
    }

    public void setInvestType(Integer investType) {
        this.investType = investType;
    }

    public ProdOrderByField getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(ProdOrderByField orderByField) {
        this.orderByField = orderByField;
    }

    public OrderByType getOrderByType() {
        return orderByType;
    }

    public void setOrderByType(OrderByType orderByType) {
        this.orderByType = orderByType;
    }

    public Integer getIsTarget() {
        return isTarget;
    }

    public void setIsTarget(Integer isTarget) {
        this.isTarget = isTarget;
    }

    public Integer getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Integer isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Double getMinYearRate() {
        return minYearRate;
    }

    public void setMinYearRate(Double minYearRate) {
        this.minYearRate = minYearRate;
    }

    public Double getMaxYearRate() {
        return maxYearRate;
    }

    public void setMaxYearRate(Double maxYearRate) {
        this.maxYearRate = maxYearRate;
    }

    public Date getMinExpireDate() {
        return minExpireDate;
    }

    public void setMinExpireDate(Date minExpireDate) {
        this.minExpireDate = minExpireDate;
    }

    public Date getMaxExpireDate() {
        return maxExpireDate;
    }

    public void setMaxExpireDate(Date maxExpireDate) {
        this.maxExpireDate = maxExpireDate;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType;
    }

    public String getPubUserId() {
        return pubUserId;
    }

    public void setPubUserId(String pubUserId) {
        this.pubUserId = pubUserId;
    }

    public Double getLimitMinInvestAmount() {
        return limitMinInvestAmount;
    }

    public void setLimitMinInvestAmount(Double limitMinInvestAmount) {
        this.limitMinInvestAmount = limitMinInvestAmount;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductQueryDto{");
        sb.append("productCode='").append(productCode).append('\'');
        sb.append(", channelCode='").append(channelCode).append('\'');
        sb.append(", statusList=").append(statusList);
        sb.append(", productTypeList=").append(productTypeList);
        sb.append(", investType=").append(investType);
        sb.append(", orderByField=").append(orderByField);
        sb.append(", orderByType=").append(orderByType);
        sb.append(", isTarget=").append(isTarget);
        sb.append(", isTransfer=").append(isTransfer);
        sb.append(", minYearRate=").append(minYearRate);
        sb.append(", maxYearRate=").append(maxYearRate);
        sb.append(", minExpireDate=").append(minExpireDate);
        sb.append(", maxExpireDate=").append(maxExpireDate);
        sb.append(", repayType='").append(repayType).append('\'');
        sb.append(", bidTypes=").append(bidTypes);
        sb.append(", excludeBidType='").append(excludeBidType).append('\'');
        sb.append(", pubUserId='").append(pubUserId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
