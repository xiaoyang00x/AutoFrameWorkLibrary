package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/29.
 */
public class MyInnerUserLoginRequestDto implements IDataBean {
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
     * 登录密码
     */
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyInnerUserLoginRequestDto{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
