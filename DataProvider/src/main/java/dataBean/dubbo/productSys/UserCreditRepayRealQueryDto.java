package dataBean.dubbo.productSys;

import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class UserCreditRepayRealQueryDto extends UserCreditRepayQueryDto {
    /**
     * 产品类型
     * @see com.miaoqian.prod.api.enums
     */
    private Integer productType;

    /**
     * 最大还款记录执行时间
     */
    private Date maxRepayDate;

    /**
     * 最小还款记录执行时间
     */
    private Date minRepayDate;
    /**
     * 还款结果 ，0：全部 ，1：成功，2：失败
     */
    private Integer repayResult;

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Date getMaxRepayDate() {
        return maxRepayDate;
    }

    public void setMaxRepayDate(Date maxRepayDate) {
        this.maxRepayDate = maxRepayDate;
    }

    public Date getMinRepayDate() {
        return minRepayDate;
    }

    public void setMinRepayDate(Date minRepayDate) {
        this.minRepayDate = minRepayDate;
    }

    public Integer getRepayResult() {
        return repayResult;
    }

    public void setRepayResult(Integer repayResult) {
        this.repayResult = repayResult;
    }
}
