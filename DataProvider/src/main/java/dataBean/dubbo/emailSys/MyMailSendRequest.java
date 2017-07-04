package dataBean.dubbo.emailSys;

import com.miaoqian.email.api.dubbo.request.MailInfo;
import com.miaoqian.email.api.dubbo.request.MailMode;
import com.miaoqian.email.api.dubbo.request.MailSendRequest;
import dataBean.IDataBean;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by guchenglong on 2017/6/8.
 */
public class MyMailSendRequest implements IDataBean, Serializable {
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private static final long serialVersionUID = -3861958140476271300L;
    private MailMode mode;
    @NotNull(
            message = "mailInfo can not be null."
    )
    private MailInfo mailInfo;

    public MyMailSendRequest() {
        this.mode = MailMode.POP3;
    }

    public MailMode getMode() {
        return this.mode;
    }

    public void setMode(MailMode mode) {
        this.mode = mode;
    }

    public MailInfo getMailInfo() {
        return this.mailInfo;
    }

    public void setMailInfo(MailInfo mailInfo) {
        this.mailInfo = mailInfo;
    }
}
