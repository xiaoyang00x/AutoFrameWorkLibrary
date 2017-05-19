package dataBean.dubbo.productSys;

import java.io.Serializable;

/**
 * Created by alex on 2017/5/19.
 */
public class TransferDto implements Serializable {
    /**
     * 转让前债权所在产品编号
     */
    private String productCode;
    /**
     * 准备转让出去的债权额度
     */
    private Double transferAmount;
    /**
     * 准备转让出去债权的待收收益
     */
    private Double transferProfit;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Double getTransferProfit() {
        return transferProfit;
    }

    public void setTransferProfit(Double transferProfit) {
        this.transferProfit = transferProfit;
    }

    @Override
    public String toString() {
        return "TransferDto{" +
                "productCode='" + productCode + '\'' +
                ", transferAmount=" + transferAmount +
                ", transferProfit=" + transferProfit +
                '}';
    }
}
