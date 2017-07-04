package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/12.
 */
public class MyUserRegisterReqDto implements IDataBean {


    private String id;
    private String mobile;
    private String password;
    private String ip;
    private String channel;
    private String inviteId;

    public MyUserRegisterReqDto() {
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getInviteId() {
        return this.inviteId;
    }

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    public String toString() {
        return "MyUserRegisterReqDto{mobile='" + this.mobile + '\'' + ", password='" + this.password + '\'' + ", ip='" + this.ip + '\'' + ", channel='" + this.channel + '\'' + ", inviteId='" + this.inviteId + '\'' + '}';
    }
}
