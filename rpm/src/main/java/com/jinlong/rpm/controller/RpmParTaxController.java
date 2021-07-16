package com.jinlong.rpm.controller;

import com.jinlong.bank.pricing.common.api.CommonPage;
import com.jinlong.bank.pricing.common.api.CommonResult;
import com.jinlong.bank.pricing.mbg.model.RpmParTax;
import com.jinlong.dubble.api.common.params.rpm.service.RpmParTaxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 税率Controller
 */
@Api(tags = "RpmParTaxController", description = "公共参数-税率")
@RestController
@RequestMapping("/rpm")
public class RpmParTaxController {
    
    @DubboReference
    private RpmParTaxService service;

    @ApiOperation("创建税率")
    @PostMapping("/tax/create")
    public CommonResult create(@RequestBody RpmParTax entity) {
        service.create(entity);
        return CommonResult.success(null);
    }

    @ApiOperation("修改税率")
    @PostMapping("/tax/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody RpmParTax entity) {
        entity.setId(id);
        service.updateById(entity);
        return CommonResult.success(null);
    }

    @ApiOperation("删除税率")
    @PostMapping("/tax/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        service.delete(id);
        return CommonResult.success(null);
    }

    @ApiOperation("根据ID查询税率")
    @GetMapping("/tax/select/{id}")
    public CommonResult<RpmParTax> select(@PathVariable Long id) {
        RpmParTax entity = service.selectById(id);
        return CommonResult.success(entity);
    }

    @ApiOperation("分页查询所有税率")
    @GetMapping("/tax/listAll")
    public CommonResult<CommonPage<RpmParTax>> listAll(@RequestParam(value = "pageNum", defaultValue = "1")
                                                      @ApiParam("页码") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5")
                                                      @ApiParam("每页数量") Integer pageSize) {
        List<RpmParTax> list = service.listAll(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
    
}
