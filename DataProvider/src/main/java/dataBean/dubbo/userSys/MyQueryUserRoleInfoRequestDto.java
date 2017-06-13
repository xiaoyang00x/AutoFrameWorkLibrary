package dataBean.dubbo.userSys;

import com.miaoqian.usersvc.dubbo.api.dto.interuser.queryuserauthinfo.Platform;
import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/29.
 */
public class MyQueryUserRoleInfoRequestDto implements IDataBean{

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 登录名
     */
    private String loginName;
    /**
     * 平台标识
     */
    private Platform platform;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "MyQueryUserRoleInfoRequestDto{" +
                "platform='" + platform  +
                "loginName='" + loginName + '\'' +
                '}';
    }
}
