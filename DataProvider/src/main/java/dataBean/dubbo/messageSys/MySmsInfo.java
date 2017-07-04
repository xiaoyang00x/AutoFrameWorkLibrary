package dataBean.dubbo.messageSys;

import com.miaoqian.sms.api.dubbo.request.SmsBizType;
import com.miaoqian.sms.api.dubbo.request.SmsInfo;
import dataBean.IDataBean;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by guchenglong on 2017/6/7.
 */
public class MySmsInfo implements IDataBean{

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id ;
    private static final long serialVersionUID = 876251068001245527L;
    @NotBlank(
            message = "requestNumber can not be blank."
    )
    @XmlElement(
            name = "requestNumber"
    )
    private String requestNumber;
    @NotNull(
            message = "mobileNumbers can not be null."
    )
    @Size(
            min = 1,
            max = 500,
            message = "mobileNumbers size must greater than 0 and less than 500."
    )
    @XmlElement(
            name = "mobileNumbers"
    )
    private String[] mobileNumbers;
    @XmlElement(
            name = "paramList"
    )
    private String[] paramList;
    @XmlElement(
            name = "templateId"
    )
    private int templateId;
    @NotNull(
            message = "smsBizType can not be null."
    )
    @XmlElement(
            name = "smsBizType"
    )
    private SmsBizType smsBizType;
    @XmlElement(
            name = "messageContent"
    )
    private String messageContent;

    public MySmsInfo() {
        this.smsBizType = SmsBizType.VERIFICATION;
    }

    public String[] getParamList() {
        return this.paramList;
    }

    public void setParamList(String[] paramList) {
        this.paramList = paramList;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String[] getMobileNumbers() {
        return this.mobileNumbers;
    }

    public void setMobileNumbers(String[] mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public String getRequestNumber() {
        return this.requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    public SmsBizType getSmsBizType() {
        return this.smsBizType;
    }

    public void setSmsBizType(SmsBizType smsBizType) {
        this.smsBizType = smsBizType;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
