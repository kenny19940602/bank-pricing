package com.jinlong.common.params.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinlong.bank.pricing.mbg.mapper.RpmParOcMapper;
import com.jinlong.bank.pricing.mbg.model.RpmParOc;
import com.jinlong.dubble.api.common.params.rpm.service.RpmParOcService;
import org.apache.dubbo.config.annotation.DubboService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * 管理成本Service实现类
 */
@DubboService
public class RpmParOcServiceImpl implements RpmParOcService {

    @Autowired
    private RpmParOcMapper parOcMapper;
    @Override
    public void create(RpmParOc entity) {
        parOcMapper.insert(entity);
    }

    @Override
    public void updateById(RpmParOc entity) {
        parOcMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void delete(Long id) {
        parOcMapper.deleteByPrimaryKey(id);
    }

    @Override
    public RpmParOc selectById(Long id) {
        Optional<RpmParOc> rpmParOc = parOcMapper.selectByPrimaryKey(id);
        return rpmParOc.orElse(null);
    }

    @Override
    public List<RpmParOc> listAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return parOcMapper.select(SelectDSLCompleter.allRows());
    }

}
