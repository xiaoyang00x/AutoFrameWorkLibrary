package dataBean.dubbo.emailSys;

import com.alibaba.fastjson.annotation.JSONField;
import com.miaoqian.email.api.dubbo.request.MailAttachFile;
import dataBean.IDataBean;

import java.io.Serializable;

/**
 * Created by guchenglong on 2017/6/8.
 */
public class MyMailAttachFile implements IDataBean, Serializable {
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id ;

    @JSONField(
            serialize = false
    )
    private byte[] fileContent;
    private String fileName;

    public MyMailAttachFile() {
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileContent() {
        return this.fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

}
