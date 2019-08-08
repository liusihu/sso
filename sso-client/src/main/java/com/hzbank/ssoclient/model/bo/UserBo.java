package com.hzbank.ssoclient.model.bo;


import com.hzbank.ssoclient.model.User;

import java.util.Set;

/**
 * 扩展用户类
 */
public class UserBo extends User {
    /**
     * 用户所属的角色信息
     */
    private Set<RoleBo> roles;

    public Set<RoleBo> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleBo> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserBo{" +
                "roles=" + roles +
                '}';
    }
}
