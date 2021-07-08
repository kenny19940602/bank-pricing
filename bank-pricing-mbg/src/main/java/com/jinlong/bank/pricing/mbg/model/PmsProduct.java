package com.jinlong.bank.pricing.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class PmsProduct implements Serializable {
    private Long id;

    private Long brandId;

    private Long productCategoryId;

    private Long feightTemplateId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    @ApiModelProperty(value = "货号")
    private String productSn;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "上架状态：0->下架；1->上架")
    private Integer publishStatus;

    @ApiModelProperty(value = "新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    @ApiModelProperty(value = "推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "销量")
    private Integer sale;

    private BigDecimal price;

    @ApiModelProperty(value = "促销价格")
    private BigDecimal promotionPrice;

    @ApiModelProperty(value = "赠送的成长值")
    private Integer giftGrowth;

    @ApiModelProperty(value = "赠送的积分")
    private Integer giftPoint;

    @ApiModelProperty(value = "限制使用的积分数")
    private Integer usePointLimit;

    @ApiModelProperty(value = "副标题")
    private String subTitle;

    @ApiModelProperty(value = "市场价")
    private BigDecimal originalPrice;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "库存预警值")
    private Integer lowStock;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "商品重量，默认为克")
    private BigDecimal weight;

    @ApiModelProperty(value = "是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    @ApiModelProperty(value = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    private String keywords;

    private String note;

    @ApiModelProperty(value = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    private String detailTitle;

    @ApiModelProperty(value = "促销开始时间")
    private Date promotionStartTime;

    @ApiModelProperty(value = "促销结束时间")
    private Date promotionEndTime;

    @ApiModelProperty(value = "活动限购数量")
    private Integer promotionPerLimit;

    @ApiModelProperty(value = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "商品分类名称")
    private String productCategoryName;

    @ApiModelProperty(value = "商品描述")
    private String description;

    private String detailDesc;

    @ApiModelProperty(value = "产品详情网页内容")
    private String detailHtml;

    @ApiModelProperty(value = "移动端网页详情")
    private String detailMobileHtml;

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
    public Long getBrandId() {
        return brandId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPic() {
        return pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPic(String pic) {
        this.pic = pic;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductSn() {
        return productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPublishStatus() {
        return publishStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getNewStatus() {
        return newStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSort() {
        return sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getSale() {
        return sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getGiftPoint() {
        return giftPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSubTitle() {
        return subTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStock() {
        return stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getLowStock() {
        return lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUnit() {
        return unit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getWeight() {
        return weight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getServiceIds() {
        return serviceIds;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getKeywords() {
        return keywords;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNote() {
        return note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAlbumPics() {
        return albumPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailTitle() {
        return detailTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPromotionType() {
        return promotionType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBrandName() {
        return brandName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getProductCategoryName() {
        return productCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailDesc() {
        return detailDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailHtml() {
        return detailHtml;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", feightTemplateId=").append(feightTemplateId);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", sort=").append(sort);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", giftPoint=").append(giftPoint);
        sb.append(", usePointLimit=").append(usePointLimit);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", previewStatus=").append(previewStatus);
        sb.append(", serviceIds=").append(serviceIds);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", promotionStartTime=").append(promotionStartTime);
        sb.append(", promotionEndTime=").append(promotionEndTime);
        sb.append(", promotionPerLimit=").append(promotionPerLimit);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", description=").append(description);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}