package com.jinlong.dubble.api.common.params.rpm.service;

import com.jinlong.bank.pricing.mbg.model.RpmParOc;

import java.util.List;

public interface RpmParOcService {
    void create(RpmParOc entity);

    void updateById(RpmParOc entity);

    void delete(Long id);

    RpmParOc selectById(Long id);

    List<RpmParOc> listAll(Integer pageNum, Integer pageSize);

}
