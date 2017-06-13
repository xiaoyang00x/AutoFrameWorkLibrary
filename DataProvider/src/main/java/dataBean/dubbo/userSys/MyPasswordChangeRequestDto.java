package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/13.
 */
public class MyPasswordChangeRequestDto implements IDataBean{

    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户uid
     */
    private String uid;
    /**
     * 旧密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "MyPasswordChangeRequestDto{" +
                "uid='" + uid + '\'' +
                ", password='" + password + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
