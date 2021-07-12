package com.jinlong.bank.pricing.mbg.mapper;

import static com.jinlong.bank.pricing.mbg.mapper.RpmParTaxDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.jinlong.bank.pricing.mbg.model.RpmParTax;
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
public interface RpmParTaxMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, taxType, orgId, taxRate, startTime, createTime, status, paramType, appendTaxRate, contractSumThreshold, productId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<RpmParTax> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RpmParTaxResult")
    Optional<RpmParTax> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RpmParTaxResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="tax_type", property="taxType", jdbcType=JdbcType.VARCHAR),
        @Result(column="org_id", property="orgId", jdbcType=JdbcType.INTEGER),
        @Result(column="tax_rate", property="taxRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="param_type", property="paramType", jdbcType=JdbcType.INTEGER),
        @Result(column="append_tax_rate", property="appendTaxRate", jdbcType=JdbcType.DOUBLE),
        @Result(column="contract_sum_threshold", property="contractSumThreshold", jdbcType=JdbcType.DECIMAL),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.INTEGER)
    })
    List<RpmParTax> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rpmParTax, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rpmParTax, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(RpmParTax record) {
        return MyBatis3Utils.insert(this::insert, record, rpmParTax, c ->
            c.map(taxType).toProperty("taxType")
            .map(orgId).toProperty("orgId")
            .map(taxRate).toProperty("taxRate")
            .map(startTime).toProperty("startTime")
            .map(createTime).toProperty("createTime")
            .map(status).toProperty("status")
            .map(paramType).toProperty("paramType")
            .map(appendTaxRate).toProperty("appendTaxRate")
            .map(contractSumThreshold).toProperty("contractSumThreshold")
            .map(productId).toProperty("productId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(RpmParTax record) {
        return MyBatis3Utils.insert(this::insert, record, rpmParTax, c ->
            c.map(taxType).toPropertyWhenPresent("taxType", record::getTaxType)
            .map(orgId).toPropertyWhenPresent("orgId", record::getOrgId)
            .map(taxRate).toPropertyWhenPresent("taxRate", record::getTaxRate)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(paramType).toPropertyWhenPresent("paramType", record::getParamType)
            .map(appendTaxRate).toPropertyWhenPresent("appendTaxRate", record::getAppendTaxRate)
            .map(contractSumThreshold).toPropertyWhenPresent("contractSumThreshold", record::getContractSumThreshold)
            .map(productId).toPropertyWhenPresent("productId", record::getProductId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RpmParTax> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rpmParTax, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RpmParTax> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rpmParTax, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RpmParTax> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rpmParTax, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RpmParTax> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rpmParTax, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(RpmParTax record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(taxType).equalTo(record::getTaxType)
                .set(orgId).equalTo(record::getOrgId)
                .set(taxRate).equalTo(record::getTaxRate)
                .set(startTime).equalTo(record::getStartTime)
                .set(createTime).equalTo(record::getCreateTime)
                .set(status).equalTo(record::getStatus)
                .set(paramType).equalTo(record::getParamType)
                .set(appendTaxRate).equalTo(record::getAppendTaxRate)
                .set(contractSumThreshold).equalTo(record::getContractSumThreshold)
                .set(productId).equalTo(record::getProductId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RpmParTax record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(taxType).equalToWhenPresent(record::getTaxType)
                .set(orgId).equalToWhenPresent(record::getOrgId)
                .set(taxRate).equalToWhenPresent(record::getTaxRate)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(paramType).equalToWhenPresent(record::getParamType)
                .set(appendTaxRate).equalToWhenPresent(record::getAppendTaxRate)
                .set(contractSumThreshold).equalToWhenPresent(record::getContractSumThreshold)
                .set(productId).equalToWhenPresent(record::getProductId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(RpmParTax record) {
        return update(c ->
            c.set(taxType).equalTo(record::getTaxType)
            .set(orgId).equalTo(record::getOrgId)
            .set(taxRate).equalTo(record::getTaxRate)
            .set(startTime).equalTo(record::getStartTime)
            .set(createTime).equalTo(record::getCreateTime)
            .set(status).equalTo(record::getStatus)
            .set(paramType).equalTo(record::getParamType)
            .set(appendTaxRate).equalTo(record::getAppendTaxRate)
            .set(contractSumThreshold).equalTo(record::getContractSumThreshold)
            .set(productId).equalTo(record::getProductId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(RpmParTax record) {
        return update(c ->
            c.set(taxType).equalToWhenPresent(record::getTaxType)
            .set(orgId).equalToWhenPresent(record::getOrgId)
            .set(taxRate).equalToWhenPresent(record::getTaxRate)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(paramType).equalToWhenPresent(record::getParamType)
            .set(appendTaxRate).equalToWhenPresent(record::getAppendTaxRate)
            .set(contractSumThreshold).equalToWhenPresent(record::getContractSumThreshold)
            .set(productId).equalToWhenPresent(record::getProductId)
            .where(id, isEqualTo(record::getId))
        );
    }
}