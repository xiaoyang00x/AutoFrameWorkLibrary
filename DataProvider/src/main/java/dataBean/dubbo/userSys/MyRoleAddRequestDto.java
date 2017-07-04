package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyRoleAddRequestDto implements IDataBean {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 角色英文名
     */
    private String roleNameEn;
    /**
     * 角色中文名
     */
    private String roleNameZh;
    /**
     * 角色描述
     */
    private String roleDesc;
    /**
     * 平台信息
     */
    private String platform;

    public String getRoleNameEn() {
        return roleNameEn;
    }

    public void setRoleNameEn(String roleNameEn) {
        this.roleNameEn = roleNameEn;
    }

    public String getRoleNameZh() {
        return roleNameZh;
    }

    public void setRoleNameZh(String roleNameZh) {
        this.roleNameZh = roleNameZh;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "MyRoleAddRequestDto{" +
                "roleNameEn='" + roleNameEn + '\'' +
                ", roleNameZh='" + roleNameZh + '\'' +
                ", platform='" + platform + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}
