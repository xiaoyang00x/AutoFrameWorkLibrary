package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/13.
 */
public class MyPasswordResetRequestDto implements IDataBean {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户手机号
     */
    private String mobile;
    /**
     * 新密码
     */
    private String newPassword;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "MyPasswordResetRequestDto{" +
                "mobile='" + mobile + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
