package dataBean.dubbo.userSys;

import dataBean.IDataBean;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyUpdateRoleInfoRequestDto implements IDataBean {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String roleId;
    private String roleNameZh;
    private String roleDesc;
    private String platform;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        return "MyUpdateRoleInfoRequestDto{" +
                "roleId=" + roleId +
                "platform=" + platform +
                ", roleNameZh='" + roleNameZh +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }
}
