package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyAuthAddRequestDto implements IDataBean {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 平台标识
     */
    private String platform;
    /**
     * 权限英文名
     */
    private String authNameEn;
    /**
     * 权限中文名
     */
    private String authNameZh;
    /**
     * 权限描述
     */
    private String authDesc;
    /**
     * 权限对应菜单的Url
     */
    private String authUrl;

    /**
     * 父级菜单id
     */
    private String parentId;
    /**
     * 序号
     */
    private Integer orderby;

    public String getAuthNameEn() {
        return authNameEn;
    }

    public void setAuthNameEn(String authNameEn) {
        this.authNameEn = authNameEn;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    @Override
    public String toString() {
        return "MyAuthAddRequestDto{" +
                "platform='" + platform + '\'' +
                ", authNameEn='" + authNameEn + '\'' +
                ", authNameZh='" + authNameZh + '\'' +
                ", orderby='" + orderby + '\'' +
                ", authDesc='" + authDesc + '\'' +
                ", authUrl='" + authUrl + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
