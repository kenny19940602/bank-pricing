package com.jinlong.bank.pricing.mbg.mapper;

import static com.jinlong.bank.pricing.mbg.mapper.PmsProductDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.jinlong.bank.pricing.mbg.model.PmsProduct;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PmsProductMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommandStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName, description, detailDesc, detailHtml, detailMobileHtml);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<PmsProduct> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductResult")
    Optional<PmsProduct> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="feight_template_id", property="feightTemplateId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_attribute_category_id", property="productAttributeCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="publish_status", property="publishStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="new_status", property="newStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="recommand_status", property="recommandStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="verify_status", property="verifyStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="sale", property="sale", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="promotion_price", property="promotionPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="gift_growth", property="giftGrowth", jdbcType=JdbcType.INTEGER),
        @Result(column="gift_point", property="giftPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="use_point_limit", property="usePointLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="sub_title", property="subTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
        @Result(column="low_stock", property="lowStock", jdbcType=JdbcType.INTEGER),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="preview_status", property="previewStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="service_ids", property="serviceIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="keywords", property="keywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="album_pics", property="albumPics", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_title", property="detailTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="promotion_start_time", property="promotionStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="promotion_end_time", property="promotionEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="promotion_per_limit", property="promotionPerLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="promotion_type", property="promotionType", jdbcType=JdbcType.INTEGER),
        @Result(column="brand_name", property="brandName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_category_name", property="productCategoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_desc", property="detailDesc", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_html", property="detailHtml", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_mobile_html", property="detailMobileHtml", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PmsProduct> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(PmsProduct record) {
        return MyBatis3Utils.insert(this::insert, record, pmsProduct, c ->
            c.map(brandId).toProperty("brandId")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(feightTemplateId).toProperty("feightTemplateId")
            .map(productAttributeCategoryId).toProperty("productAttributeCategoryId")
            .map(name).toProperty("name")
            .map(pic).toProperty("pic")
            .map(productSn).toProperty("productSn")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(publishStatus).toProperty("publishStatus")
            .map(newStatus).toProperty("newStatus")
            .map(recommandStatus).toProperty("recommandStatus")
            .map(verifyStatus).toProperty("verifyStatus")
            .map(sort).toProperty("sort")
            .map(sale).toProperty("sale")
            .map(price).toProperty("price")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(giftPoint).toProperty("giftPoint")
            .map(usePointLimit).toProperty("usePointLimit")
            .map(subTitle).toProperty("subTitle")
            .map(originalPrice).toProperty("originalPrice")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(unit).toProperty("unit")
            .map(weight).toProperty("weight")
            .map(previewStatus).toProperty("previewStatus")
            .map(serviceIds).toProperty("serviceIds")
            .map(keywords).toProperty("keywords")
            .map(note).toProperty("note")
            .map(albumPics).toProperty("albumPics")
            .map(detailTitle).toProperty("detailTitle")
            .map(promotionStartTime).toProperty("promotionStartTime")
            .map(promotionEndTime).toProperty("promotionEndTime")
            .map(promotionPerLimit).toProperty("promotionPerLimit")
            .map(promotionType).toProperty("promotionType")
            .map(brandName).toProperty("brandName")
            .map(productCategoryName).toProperty("productCategoryName")
            .map(description).toProperty("description")
            .map(detailDesc).toProperty("detailDesc")
            .map(detailHtml).toProperty("detailHtml")
            .map(detailMobileHtml).toProperty("detailMobileHtml")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(PmsProduct record) {
        return MyBatis3Utils.insert(this::insert, record, pmsProduct, c ->
            c.map(brandId).toPropertyWhenPresent("brandId", record::getBrandId)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", record::getProductCategoryId)
            .map(feightTemplateId).toPropertyWhenPresent("feightTemplateId", record::getFeightTemplateId)
            .map(productAttributeCategoryId).toPropertyWhenPresent("productAttributeCategoryId", record::getProductAttributeCategoryId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(pic).toPropertyWhenPresent("pic", record::getPic)
            .map(productSn).toPropertyWhenPresent("productSn", record::getProductSn)
            .map(deleteStatus).toPropertyWhenPresent("deleteStatus", record::getDeleteStatus)
            .map(publishStatus).toPropertyWhenPresent("publishStatus", record::getPublishStatus)
            .map(newStatus).toPropertyWhenPresent("newStatus", record::getNewStatus)
            .map(recommandStatus).toPropertyWhenPresent("recommandStatus", record::getRecommandStatus)
            .map(verifyStatus).toPropertyWhenPresent("verifyStatus", record::getVerifyStatus)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(sale).toPropertyWhenPresent("sale", record::getSale)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(promotionPrice).toPropertyWhenPresent("promotionPrice", record::getPromotionPrice)
            .map(giftGrowth).toPropertyWhenPresent("giftGrowth", record::getGiftGrowth)
            .map(giftPoint).toPropertyWhenPresent("giftPoint", record::getGiftPoint)
            .map(usePointLimit).toPropertyWhenPresent("usePointLimit", record::getUsePointLimit)
            .map(subTitle).toPropertyWhenPresent("subTitle", record::getSubTitle)
            .map(originalPrice).toPropertyWhenPresent("originalPrice", record::getOriginalPrice)
            .map(stock).toPropertyWhenPresent("stock", record::getStock)
            .map(lowStock).toPropertyWhenPresent("lowStock", record::getLowStock)
            .map(unit).toPropertyWhenPresent("unit", record::getUnit)
            .map(weight).toPropertyWhenPresent("weight", record::getWeight)
            .map(previewStatus).toPropertyWhenPresent("previewStatus", record::getPreviewStatus)
            .map(serviceIds).toPropertyWhenPresent("serviceIds", record::getServiceIds)
            .map(keywords).toPropertyWhenPresent("keywords", record::getKeywords)
            .map(note).toPropertyWhenPresent("note", record::getNote)
            .map(albumPics).toPropertyWhenPresent("albumPics", record::getAlbumPics)
            .map(detailTitle).toPropertyWhenPresent("detailTitle", record::getDetailTitle)
            .map(promotionStartTime).toPropertyWhenPresent("promotionStartTime", record::getPromotionStartTime)
            .map(promotionEndTime).toPropertyWhenPresent("promotionEndTime", record::getPromotionEndTime)
            .map(promotionPerLimit).toPropertyWhenPresent("promotionPerLimit", record::getPromotionPerLimit)
            .map(promotionType).toPropertyWhenPresent("promotionType", record::getPromotionType)
            .map(brandName).toPropertyWhenPresent("brandName", record::getBrandName)
            .map(productCategoryName).toPropertyWhenPresent("productCategoryName", record::getProductCategoryName)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(detailDesc).toPropertyWhenPresent("detailDesc", record::getDetailDesc)
            .map(detailHtml).toPropertyWhenPresent("detailHtml", record::getDetailHtml)
            .map(detailMobileHtml).toPropertyWhenPresent("detailMobileHtml", record::getDetailMobileHtml)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProduct> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProduct> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<PmsProduct> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<PmsProduct> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProduct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProduct record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(brandId).equalTo(record::getBrandId)
                .set(productCategoryId).equalTo(record::getProductCategoryId)
                .set(feightTemplateId).equalTo(record::getFeightTemplateId)
                .set(productAttributeCategoryId).equalTo(record::getProductAttributeCategoryId)
                .set(name).equalTo(record::getName)
                .set(pic).equalTo(record::getPic)
                .set(productSn).equalTo(record::getProductSn)
                .set(deleteStatus).equalTo(record::getDeleteStatus)
                .set(publishStatus).equalTo(record::getPublishStatus)
                .set(newStatus).equalTo(record::getNewStatus)
                .set(recommandStatus).equalTo(record::getRecommandStatus)
                .set(verifyStatus).equalTo(record::getVerifyStatus)
                .set(sort).equalTo(record::getSort)
                .set(sale).equalTo(record::getSale)
                .set(price).equalTo(record::getPrice)
                .set(promotionPrice).equalTo(record::getPromotionPrice)
                .set(giftGrowth).equalTo(record::getGiftGrowth)
                .set(giftPoint).equalTo(record::getGiftPoint)
                .set(usePointLimit).equalTo(record::getUsePointLimit)
                .set(subTitle).equalTo(record::getSubTitle)
                .set(originalPrice).equalTo(record::getOriginalPrice)
                .set(stock).equalTo(record::getStock)
                .set(lowStock).equalTo(record::getLowStock)
                .set(unit).equalTo(record::getUnit)
                .set(weight).equalTo(record::getWeight)
                .set(previewStatus).equalTo(record::getPreviewStatus)
                .set(serviceIds).equalTo(record::getServiceIds)
                .set(keywords).equalTo(record::getKeywords)
                .set(note).equalTo(record::getNote)
                .set(albumPics).equalTo(record::getAlbumPics)
                .set(detailTitle).equalTo(record::getDetailTitle)
                .set(promotionStartTime).equalTo(record::getPromotionStartTime)
                .set(promotionEndTime).equalTo(record::getPromotionEndTime)
                .set(promotionPerLimit).equalTo(record::getPromotionPerLimit)
                .set(promotionType).equalTo(record::getPromotionType)
                .set(brandName).equalTo(record::getBrandName)
                .set(productCategoryName).equalTo(record::getProductCategoryName)
                .set(description).equalTo(record::getDescription)
                .set(detailDesc).equalTo(record::getDetailDesc)
                .set(detailHtml).equalTo(record::getDetailHtml)
                .set(detailMobileHtml).equalTo(record::getDetailMobileHtml);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProduct record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(brandId).equalToWhenPresent(record::getBrandId)
                .set(productCategoryId).equalToWhenPresent(record::getProductCategoryId)
                .set(feightTemplateId).equalToWhenPresent(record::getFeightTemplateId)
                .set(productAttributeCategoryId).equalToWhenPresent(record::getProductAttributeCategoryId)
                .set(name).equalToWhenPresent(record::getName)
                .set(pic).equalToWhenPresent(record::getPic)
                .set(productSn).equalToWhenPresent(record::getProductSn)
                .set(deleteStatus).equalToWhenPresent(record::getDeleteStatus)
                .set(publishStatus).equalToWhenPresent(record::getPublishStatus)
                .set(newStatus).equalToWhenPresent(record::getNewStatus)
                .set(recommandStatus).equalToWhenPresent(record::getRecommandStatus)
                .set(verifyStatus).equalToWhenPresent(record::getVerifyStatus)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(sale).equalToWhenPresent(record::getSale)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(promotionPrice).equalToWhenPresent(record::getPromotionPrice)
                .set(giftGrowth).equalToWhenPresent(record::getGiftGrowth)
                .set(giftPoint).equalToWhenPresent(record::getGiftPoint)
                .set(usePointLimit).equalToWhenPresent(record::getUsePointLimit)
                .set(subTitle).equalToWhenPresent(record::getSubTitle)
                .set(originalPrice).equalToWhenPresent(record::getOriginalPrice)
                .set(stock).equalToWhenPresent(record::getStock)
                .set(lowStock).equalToWhenPresent(record::getLowStock)
                .set(unit).equalToWhenPresent(record::getUnit)
                .set(weight).equalToWhenPresent(record::getWeight)
                .set(previewStatus).equalToWhenPresent(record::getPreviewStatus)
                .set(serviceIds).equalToWhenPresent(record::getServiceIds)
                .set(keywords).equalToWhenPresent(record::getKeywords)
                .set(note).equalToWhenPresent(record::getNote)
                .set(albumPics).equalToWhenPresent(record::getAlbumPics)
                .set(detailTitle).equalToWhenPresent(record::getDetailTitle)
                .set(promotionStartTime).equalToWhenPresent(record::getPromotionStartTime)
                .set(promotionEndTime).equalToWhenPresent(record::getPromotionEndTime)
                .set(promotionPerLimit).equalToWhenPresent(record::getPromotionPerLimit)
                .set(promotionType).equalToWhenPresent(record::getPromotionType)
                .set(brandName).equalToWhenPresent(record::getBrandName)
                .set(productCategoryName).equalToWhenPresent(record::getProductCategoryName)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(detailDesc).equalToWhenPresent(record::getDetailDesc)
                .set(detailHtml).equalToWhenPresent(record::getDetailHtml)
                .set(detailMobileHtml).equalToWhenPresent(record::getDetailMobileHtml);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(PmsProduct record) {
        return update(c ->
            c.set(brandId).equalTo(record::getBrandId)
            .set(productCategoryId).equalTo(record::getProductCategoryId)
            .set(feightTemplateId).equalTo(record::getFeightTemplateId)
            .set(productAttributeCategoryId).equalTo(record::getProductAttributeCategoryId)
            .set(name).equalTo(record::getName)
            .set(pic).equalTo(record::getPic)
            .set(productSn).equalTo(record::getProductSn)
            .set(deleteStatus).equalTo(record::getDeleteStatus)
            .set(publishStatus).equalTo(record::getPublishStatus)
            .set(newStatus).equalTo(record::getNewStatus)
            .set(recommandStatus).equalTo(record::getRecommandStatus)
            .set(verifyStatus).equalTo(record::getVerifyStatus)
            .set(sort).equalTo(record::getSort)
            .set(sale).equalTo(record::getSale)
            .set(price).equalTo(record::getPrice)
            .set(promotionPrice).equalTo(record::getPromotionPrice)
            .set(giftGrowth).equalTo(record::getGiftGrowth)
            .set(giftPoint).equalTo(record::getGiftPoint)
            .set(usePointLimit).equalTo(record::getUsePointLimit)
            .set(subTitle).equalTo(record::getSubTitle)
            .set(originalPrice).equalTo(record::getOriginalPrice)
            .set(stock).equalTo(record::getStock)
            .set(lowStock).equalTo(record::getLowStock)
            .set(unit).equalTo(record::getUnit)
            .set(weight).equalTo(record::getWeight)
            .set(previewStatus).equalTo(record::getPreviewStatus)
            .set(serviceIds).equalTo(record::getServiceIds)
            .set(keywords).equalTo(record::getKeywords)
            .set(note).equalTo(record::getNote)
            .set(albumPics).equalTo(record::getAlbumPics)
            .set(detailTitle).equalTo(record::getDetailTitle)
            .set(promotionStartTime).equalTo(record::getPromotionStartTime)
            .set(promotionEndTime).equalTo(record::getPromotionEndTime)
            .set(promotionPerLimit).equalTo(record::getPromotionPerLimit)
            .set(promotionType).equalTo(record::getPromotionType)
            .set(brandName).equalTo(record::getBrandName)
            .set(productCategoryName).equalTo(record::getProductCategoryName)
            .set(description).equalTo(record::getDescription)
            .set(detailDesc).equalTo(record::getDetailDesc)
            .set(detailHtml).equalTo(record::getDetailHtml)
            .set(detailMobileHtml).equalTo(record::getDetailMobileHtml)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(PmsProduct record) {
        return update(c ->
            c.set(brandId).equalToWhenPresent(record::getBrandId)
            .set(productCategoryId).equalToWhenPresent(record::getProductCategoryId)
            .set(feightTemplateId).equalToWhenPresent(record::getFeightTemplateId)
            .set(productAttributeCategoryId).equalToWhenPresent(record::getProductAttributeCategoryId)
            .set(name).equalToWhenPresent(record::getName)
            .set(pic).equalToWhenPresent(record::getPic)
            .set(productSn).equalToWhenPresent(record::getProductSn)
            .set(deleteStatus).equalToWhenPresent(record::getDeleteStatus)
            .set(publishStatus).equalToWhenPresent(record::getPublishStatus)
            .set(newStatus).equalToWhenPresent(record::getNewStatus)
            .set(recommandStatus).equalToWhenPresent(record::getRecommandStatus)
            .set(verifyStatus).equalToWhenPresent(record::getVerifyStatus)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(sale).equalToWhenPresent(record::getSale)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(promotionPrice).equalToWhenPresent(record::getPromotionPrice)
            .set(giftGrowth).equalToWhenPresent(record::getGiftGrowth)
            .set(giftPoint).equalToWhenPresent(record::getGiftPoint)
            .set(usePointLimit).equalToWhenPresent(record::getUsePointLimit)
            .set(subTitle).equalToWhenPresent(record::getSubTitle)
            .set(originalPrice).equalToWhenPresent(record::getOriginalPrice)
            .set(stock).equalToWhenPresent(record::getStock)
            .set(lowStock).equalToWhenPresent(record::getLowStock)
            .set(unit).equalToWhenPresent(record::getUnit)
            .set(weight).equalToWhenPresent(record::getWeight)
            .set(previewStatus).equalToWhenPresent(record::getPreviewStatus)
            .set(serviceIds).equalToWhenPresent(record::getServiceIds)
            .set(keywords).equalToWhenPresent(record::getKeywords)
            .set(note).equalToWhenPresent(record::getNote)
            .set(albumPics).equalToWhenPresent(record::getAlbumPics)
            .set(detailTitle).equalToWhenPresent(record::getDetailTitle)
            .set(promotionStartTime).equalToWhenPresent(record::getPromotionStartTime)
            .set(promotionEndTime).equalToWhenPresent(record::getPromotionEndTime)
            .set(promotionPerLimit).equalToWhenPresent(record::getPromotionPerLimit)
            .set(promotionType).equalToWhenPresent(record::getPromotionType)
            .set(brandName).equalToWhenPresent(record::getBrandName)
            .set(productCategoryName).equalToWhenPresent(record::getProductCategoryName)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(detailDesc).equalToWhenPresent(record::getDetailDesc)
            .set(detailHtml).equalToWhenPresent(record::getDetailHtml)
            .set(detailMobileHtml).equalToWhenPresent(record::getDetailMobileHtml)
            .where(id, isEqualTo(record::getId))
        );
    }
}