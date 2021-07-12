package com.jinlong.rpm.controller;

import com.jinlong.bank.pricing.common.api.CommonPage;
import com.jinlong.bank.pricing.common.api.CommonResult;
import com.jinlong.bank.pricing.mbg.model.RpmParOc;
import com.jinlong.dubble.api.common.params.rpm.service.RpmParOcService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 管理成本Controller
 */
@Api(tags = "RpmParOcController", description = "公共参数-管理成本")
@RestController
@RequestMapping("/rpm")
public class RpmParOcController {

    @DubboReference
    private RpmParOcService service;


    @ApiOperation("创建")
    @PostMapping("/oc/create")
    public CommonResult create(@RequestBody RpmParOc entity) {
        service.create(entity);
        return CommonResult.success(null);
    }

    @ApiOperation("修改")
    @PostMapping("/oc/update/{id}")
    public CommonResult update(@PathVariable Long id, @RequestBody RpmParOc entity) {
        entity.setId(id);
        service.updateById(entity);
        return CommonResult.success(null);
    }

    @ApiOperation("删除")
    @PostMapping("/oc/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        service.delete(id);
        return CommonResult.success(null);
    }

    @ApiOperation("根据ID查询")
    @GetMapping("/oc/select/{id}")
    public CommonResult<RpmParOc> select(@PathVariable Long id) {
        RpmParOc entity = service.selectById(id);
        return CommonResult.success(entity);
    }

    @ApiOperation("分页查询所有")
    @GetMapping("/oc/listAll")
    public CommonResult<CommonPage<RpmParOc>> listAll(@RequestParam(value = "pageNum", defaultValue = "1")
                                                      @ApiParam("页码") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "5")
                                                      @ApiParam("每页数量") Integer pageSize) {
        List<RpmParOc> list = service.listAll(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
