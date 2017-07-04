package dataBean.dubbo.userSys;

import com.miaoqian.usersvc.dubbo.api.dto.base.BaseReqDto;
import com.miaoqian.usersvc.model.enums.SmsJXTypeEnum;
import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/12.
 */
public class MySendMessageReqDto implements IDataBean{

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String mobile;
    private SmsJXTypeEnum smsJXType;
    private String uid;

    public MySendMessageReqDto() {
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public SmsJXTypeEnum getSmsJXType() {
        return this.smsJXType;
    }

    public void setSmsJXType(SmsJXTypeEnum smsJXType) {
        this.smsJXType = smsJXType;
    }

    public String toString() {
        return "MySendMessageReqDto{mobile='" + this.mobile + '\'' + ", smsJXType=" + this.smsJXType + ", uid='" + this.uid + '\'' + '}';
    }
}
