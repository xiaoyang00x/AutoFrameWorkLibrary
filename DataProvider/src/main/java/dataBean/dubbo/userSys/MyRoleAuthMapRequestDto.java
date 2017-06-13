package dataBean.dubbo.userSys;

import dataBean.IDataBean;

import java.util.List;

/**
 * Created by guchenglong on 2017/6/27.
 */
public class MyRoleAuthMapRequestDto implements IDataBean{
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 角色id
     */
    private String roleId;
    /**
     * 权限id
     */
    private List<String> authId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<String> getAuthId() {
        return authId;
    }

    public void setAuthId(List<String> authId) {
        this.authId = authId;
    }


    @Override
    public String toString() {
        return "MyRoleAuthMapRequestDto{" +
                "roleId=" + roleId +
                ", authId=" + authId + '\'' +
                '}';
    }
}
