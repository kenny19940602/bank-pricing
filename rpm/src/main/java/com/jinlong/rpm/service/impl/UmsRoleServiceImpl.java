package com.jinlong.rpm.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinlong.bank.pricing.mbg.dao.UmsRoleDao;
import com.jinlong.bank.pricing.mbg.mapper.*;
import com.jinlong.bank.pricing.mbg.model.*;
import com.jinlong.rpm.service.UmsRoleService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleMapper roleMapper;
    @Autowired
    private UmsRoleMenuRelationMapper roleMenuRelationMapper;
    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;
    @Autowired
    private UmsRoleDao roleDao;
//    @Autowired
//    private UmsAdminCacheService adminCacheService;
    @Override
    public int create(UmsRole role) {
        role.setCreateTime(new Date());
        role.setAdminCount(0);
        role.setSort(0);
        return roleMapper.insert(role);
    }

    @Override
    public int update(Long id, UmsRole role) {
        role.setId(id);
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int delete(List<Long> ids) {
//        UmsRoleExample example = new UmsRoleExample();
//        example.createCriteria().andIdIn(ids);
//        int count = roleMapper.deleteByExample(example);
//        adminCacheService.delResourceListByRoleIds(ids);
        return roleMapper.delete(c->c.where(UmsRoleDynamicSqlSupport.id,isIn(ids)));
//        return count;
    }

    @Override
    public List<UmsRole> list() {
        return roleMapper.select(SelectDSLCompleter.allRows());
    }

    @Override
    public List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
//        UmsRoleExample example = new UmsRoleExample();
//        if (!StringUtils.isEmpty(keyword)) {
//            example.createCriteria().andNameLike("%" + keyword + "%");
//        }
        return roleMapper.select(c -> c.where(UmsRoleDynamicSqlSupport.name, isLikeWhenPresent(keyword)));
//        return roleMapper.selectByExample(example);
    }

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }

    @Override
    public List<UmsMenu> listMenu(Long roleId) {
        return roleDao.getMenuListByRoleId(roleId);
    }

    @Override
    public List<UmsResource> listResource(Long roleId) {
        return roleDao.getResourceListByRoleId(roleId);
    }

    @Override
    public int allocMenu(Long roleId, List<Long> menuIds) {
        //先删除原有关系
//        UmsRoleMenuRelationExample example=new UmsRoleMenuRelationExample();
//        example.createCriteria().andRoleIdEqualTo(roleId);
//        roleMenuRelationMapper.deleteByExample(example);
        roleMenuRelationMapper.delete(c -> c.where(UmsRoleMenuRelationDynamicSqlSupport.roleId, isEqualTo(roleId)));
        //批量插入新关系
        for (Long menuId : menuIds) {
            UmsRoleMenuRelation relation = new UmsRoleMenuRelation();
            relation.setRoleId(roleId);
            relation.setMenuId(menuId);
            roleMenuRelationMapper.insert(relation);
        }
        return menuIds.size();
    }

    @Override
    public int allocResource(Long roleId, List<Long> resourceIds) {
        //先删除原有关系
//        UmsRoleResourceRelationExample example=new UmsRoleResourceRelationExample();
//        example.createCriteria().andRoleIdEqualTo(roleId);
//        roleResourceRelationMapper.deleteByExample(example);
        roleResourceRelationMapper.delete(c -> c.where(UmsRoleResourceRelationDynamicSqlSupport.roleId, isEqualToWhenPresent(roleId)));
        //批量插入新关系
        for (Long resourceId : resourceIds) {
            UmsRoleResourceRelation relation = new UmsRoleResourceRelation();
            relation.setRoleId(roleId);
            relation.setResourceId(resourceId);
            roleResourceRelationMapper.insert(relation);
        }
//        adminCacheService.delResourceListByRole(roleId);
        return resourceIds.size();
    }
}
