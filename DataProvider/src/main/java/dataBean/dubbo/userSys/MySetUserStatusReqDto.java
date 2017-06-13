package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/13.
 */
public class MySetUserStatusReqDto implements IDataBean{
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    private String uid;

    /**
     * 用户状态
     */
    private Boolean userStatus;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "MySetUserStatusReqDto{" +
                "uid='" + uid + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
