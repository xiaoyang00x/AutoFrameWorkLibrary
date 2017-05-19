package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.*;

import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class TransferProductQueryDto extends com.miaoqian.prod.api.dto.request.ProductQueryDto {



    /**
     * 最大转让日期
     */
    private Date transferMaxDate;

    /**
     * 最小转让日期
     */
    private Date transferMinDate;

    /**
     * 转让订单号
     */
    private String orderSeqNo;

    public TransferProductQueryDto(){
        super();
        this.setPageIndex(1);
        this.setPageSize(10);
    }

    public Date getTransferMaxDate() {
        return transferMaxDate;
    }

    public void setTransferMaxDate(Date transferMaxDate) {
        this.transferMaxDate = transferMaxDate;
    }

    public Date getTransferMinDate() {
        return transferMinDate;
    }

    public void setTransferMinDate(Date transferMinDate) {
        this.transferMinDate = transferMinDate;
    }

    public String getOrderSeqNo() {
        return orderSeqNo;
    }

    public void setOrderSeqNo(String orderSeqNo) {
        this.orderSeqNo = orderSeqNo;
    }
}
