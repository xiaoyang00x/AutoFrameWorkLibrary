package dataBean.dubbo.userSys;

import dataBean.IDataBean;

import java.util.List;

/**
 * Created by guchenglong on 2017/6/29.
 */
public class MyUserRoleMapRequestDto implements IDataBean {
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
     * 角色id
     */
    private List<String> roleId;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<String> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<String> roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "MyUserRoleMapRequestDto{" +
                "uid=" + uid +
                ", roleId=" + roleId.toString() + '\'' +
                '}';
    }
}
