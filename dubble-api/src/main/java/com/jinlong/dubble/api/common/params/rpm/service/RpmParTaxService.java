package com.jinlong.dubble.api.common.params.rpm.service;

import com.jinlong.bank.pricing.mbg.model.RpmParTax;

import java.util.List;

public interface RpmParTaxService {
    void create(RpmParTax entity);

    void updateById(RpmParTax entity);

    void delete(Long id);

    RpmParTax selectById(Long id);

    List<RpmParTax> listAll(Integer pageNum, Integer pageSize);
}
