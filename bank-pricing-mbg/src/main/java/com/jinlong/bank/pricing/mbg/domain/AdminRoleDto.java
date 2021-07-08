package com.jinlong.bank.pricing.mbg.domain;

import com.jinlong.bank.pricing.mbg.model.UmsAdmin;
import com.jinlong.bank.pricing.mbg.model.UmsRole;

import java.util.List;

public class AdminRoleDto extends UmsAdmin {

    private List<UmsRole> roleList;

    public List<UmsRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<UmsRole> roleList) {
        this.roleList = roleList;
    }
}
