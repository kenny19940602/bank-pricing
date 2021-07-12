package com.jinlong.bank.pricing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class RpmParTax implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "税率类型")
    private String taxType;

    @ApiModelProperty(value = "机构id")
    private Integer orgId;

    @ApiModelProperty(value = "增值税率(%)")
    private Long taxRate;

    @ApiModelProperty(value = "生效日期")
    private Date startTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "参数类型")
    private Integer paramType;

    @ApiModelProperty(value = "附加税率(%)")
    private Double appendTaxRate;

    @ApiModelProperty(value = "合同金额起征点(万)")
    private Long contractSumThreshold;

    @ApiModelProperty(value = "产品id")
    private Integer productId;

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
    public String getTaxType() {
        return taxType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getOrgId() {
        return orgId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getTaxRate() {
        return taxRate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTaxRate(Long taxRate) {
        this.taxRate = taxRate;
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
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    public Double getAppendTaxRate() {
        return appendTaxRate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAppendTaxRate(Double appendTaxRate) {
        this.appendTaxRate = appendTaxRate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getContractSumThreshold() {
        return contractSumThreshold;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContractSumThreshold(Long contractSumThreshold) {
        this.contractSumThreshold = contractSumThreshold;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getProductId() {
        return productId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taxType=").append(taxType);
        sb.append(", orgId=").append(orgId);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", startTime=").append(startTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", paramType=").append(paramType);
        sb.append(", appendTaxRate=").append(appendTaxRate);
        sb.append(", contractSumThreshold=").append(contractSumThreshold);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}