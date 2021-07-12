package com.jinlong.common.params.service.impl;

import com.github.pagehelper.PageHelper;
import com.jinlong.bank.pricing.mbg.mapper.RpmParTaxMapper;
import com.jinlong.bank.pricing.mbg.model.RpmParTax;
import com.jinlong.dubble.api.common.params.rpm.service.RpmParTaxService;
import org.apache.dubbo.config.annotation.DubboService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * 税率Service实现类
 */
@DubboService
public class RpmParTaxServiceImpl implements RpmParTaxService {

    @Autowired
    private RpmParTaxMapper parTaxMapper;
    @Override
    public void create(RpmParTax entity) {
        parTaxMapper.insert(entity);
    }

    @Override
    public void updateById(RpmParTax entity) {
        parTaxMapper.updateByPrimaryKey(entity);
    }

    @Override
    public void delete(Long id) {
        parTaxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public RpmParTax selectById(Long id) {
        Optional<RpmParTax> rpmParTax = parTaxMapper.selectByPrimaryKey(id);
        return rpmParTax.orElse(null);
    }

    @Override
    public List<RpmParTax> listAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return parTaxMapper.select(SelectDSLCompleter.allRows());
    }

}
