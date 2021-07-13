package com.jinlong.rpm.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinlong.bank.pricing.mbg.mapper.UmsResourceDynamicSqlSupport;
import com.jinlong.bank.pricing.mbg.mapper.UmsResourceMapper;
import com.jinlong.bank.pricing.mbg.model.UmsResource;
import com.jinlong.rpm.service.UmsResourceService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;

@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Autowired
    private UmsResourceMapper resourceMapper;
//    @Autowired
//    private UmsAdminCacheService adminCacheService;
    @Override
    public int create(UmsResource umsResource) {
        umsResource.setCreateTime(new Date());
        return resourceMapper.insert(umsResource);
    }

    @Override
    public int update(Long id, UmsResource umsResource) {
        umsResource.setId(id);
        int count = resourceMapper.updateByPrimaryKeySelective(umsResource);
//        adminCacheService.delResourceListByResource(id);
        return count;
    }

    @Override
    public UmsResource getItem(Long id) {
        return resourceMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public int delete(Long id) {
        int count = resourceMapper.deleteByPrimaryKey(id);
//        adminCacheService.delResourceListByResource(id);
        return count;
    }

    @Override
    public List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
//        UmsResourceExample example = new UmsResourceExample();
//        UmsResourceExample.Criteria criteria = example.createCriteria();
//        if(categoryId!=null){
//            criteria.andCategoryIdEqualTo(categoryId);
//        }
//        if(StrUtil.isNotEmpty(nameKeyword)){
//            criteria.andNameLike('%'+nameKeyword+'%');
//        }
//        if(StrUtil.isNotEmpty(urlKeyword)){
//            criteria.andUrlLike('%'+urlKeyword+'%');
//        }
        return resourceMapper.select(c -> c.where(UmsResourceDynamicSqlSupport.categoryId, isEqualToWhenPresent(categoryId)).and(UmsResourceDynamicSqlSupport.name, isEqualToWhenPresent(nameKeyword)).and(UmsResourceDynamicSqlSupport.url, isEqualToWhenPresent(urlKeyword)));
//        return resourceMapper.selectByExample(example);
    }

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.select(SelectDSLCompleter.allRows());
    }

}
