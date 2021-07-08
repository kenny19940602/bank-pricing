package com.jinlong.dubble.api.common.params.admin.service;

import com.jinlong.bank.pricing.mbg.domain.AdminRoleDto;
import com.jinlong.bank.pricing.mbg.domain.RoleStatDto;
import com.jinlong.bank.pricing.mbg.model.UmsAdmin;

import java.util.List;

public interface UmsAdminService {

    void create(UmsAdmin entity);

    void updateById(UmsAdmin entity);

    void delete(Long id);

    UmsAdmin selectById(Long id);

    List<UmsAdmin> listAll(Integer pageNum, Integer pageSize);


    List<UmsAdmin> list(Integer pageNum, Integer pageSize, String username, List<Integer> statusList);

    List<UmsAdmin> lambdalist(Integer pageNum, Integer pageSize, String username, List<Integer> statusList);

    List<UmsAdmin> subList(Long roleId);

    List<UmsAdmin> lambdaSubList(Long roleId);

    List<RoleStatDto> groupList();

    void deleteByUsername(String username);

    void lambdaDeleteByUsername(String username);

    void updateByIds(List<Long> ids, Integer status);

    void lambdaUpdateByIds(List<Long> ids, Integer status);

    AdminRoleDto selectWithRoleList(Long id);

//    List<RoleStatDto> lambdaGroupLis1t();
}
