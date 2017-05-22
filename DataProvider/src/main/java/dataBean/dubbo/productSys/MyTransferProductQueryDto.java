package dataBean.dubbo.productSys;

import com.miaoqian.prod.api.dto.request.*;

import java.util.Date;

/**
 * Created by alex on 2017/5/19.
 */
public class MyTransferProductQueryDto extends com.miaoqian.prod.api.dto.request.ProductQueryDto {

    private String id;


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

    public MyTransferProductQueryDto(){
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
