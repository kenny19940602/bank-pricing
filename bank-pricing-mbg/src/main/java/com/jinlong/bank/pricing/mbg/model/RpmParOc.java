package com.jinlong.bank.pricing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class RpmParOc implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "机构id")
    private Long orgId;

    @ApiModelProperty(value = "产品id")
    private Long productId;

    @ApiModelProperty(value = "客户规模id")
    private Long custSize;

    @ApiModelProperty(value = "费用率")
    private Long autoOc;

    @ApiModelProperty(value = "手工值")
    private Long manualOc;

    @ApiModelProperty(value = "开始时间")
    private Date startTime;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "参数类型")
    private Integer paramType;

    @ApiModelProperty(value = "条线")
    private Integer sysLine;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getOrgId() {
        return orgId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getCustSize() {
        return custSize;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCustSize(Long custSize) {
        this.custSize = custSize;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getAutoOc() {
        return autoOc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAutoOc(Long autoOc) {
        this.autoOc = autoOc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getManualOc() {
        return manualOc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setManualOc(Long manualOc) {
        this.manualOc = manualOc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getStartTime() {
        return startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getParamType() {
        return paramType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSysLine() {
        return sysLine;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysLine(Integer sysLine) {
        this.sysLine = sysLine;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgId=").append(orgId);
        sb.append(", productId=").append(productId);
        sb.append(", custSize=").append(custSize);
        sb.append(", autoOc=").append(autoOc);
        sb.append(", manualOc=").append(manualOc);
        sb.append(", startTime=").append(startTime);
        sb.append(", status=").append(status);
        sb.append(", paramType=").append(paramType);
        sb.append(", sysLine=").append(sysLine);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}