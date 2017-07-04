package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyUpdateAuthInfoRequestDto implements IDataBean{
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String authId;
    private String authNameZh;
    private String authDesc;
    private String authUrl;
    private String parentId;
    private Integer orderby;

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getAuthNameZh() {
        return authNameZh;
    }

    public void setAuthNameZh(String authNameZh) {
        this.authNameZh = authNameZh;
    }

    public String getAuthDesc() {
        return authDesc;
    }

    public void setAuthDesc(String authDesc) {
        this.authDesc = authDesc;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    @Override
    public String toString() {
        return "MyUpdateAuthInfoRequestDto{" +
                "authId=" + authId +
                ", authNameZh='" + authNameZh + '\'' +
                ", authDesc='" + authDesc + '\'' +
                ", orderby='" + orderby + '\'' +
                ", authUrl='" + authUrl + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
