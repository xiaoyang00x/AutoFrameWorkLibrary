package dataBean.dubbo.userSys;

import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserauthinfo.Platform;
import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/29.
 */
public class MyQueryUserAuthInfoResquestDto implements IDataBean {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    /**
     * 登录ID
     */
    private String uid;

    /**
     * 平台标识
     */
    private Platform platform;


    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "MyQueryUserAuthInfoResquestDto{" +
                "uid='" + uid + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }


}
