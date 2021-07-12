package com.jinlong.bank.pricing.mbg.mapper;

import static com.jinlong.bank.pricing.mbg.mapper.RpmParOcDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.jinlong.bank.pricing.mbg.model.RpmParOc;
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
public interface RpmParOcMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, orgId, productId, custSize, autoOc, manualOc, startTime, status, paramType, sysLine);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<RpmParOc> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RpmParOcResult")
    Optional<RpmParOc> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RpmParOcResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ORG_ID", property="orgId", jdbcType=JdbcType.BIGINT),
        @Result(column="PROduct_id", property="productId", jdbcType=JdbcType.BIGINT),
        @Result(column="cust_size", property="custSize", jdbcType=JdbcType.BIGINT),
        @Result(column="auto_oc", property="autoOc", jdbcType=JdbcType.DECIMAL),
        @Result(column="manual_oc", property="manualOc", jdbcType=JdbcType.DECIMAL),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="param_type", property="paramType", jdbcType=JdbcType.INTEGER),
        @Result(column="sys_line", property="sysLine", jdbcType=JdbcType.INTEGER)
    })
    List<RpmParOc> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rpmParOc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rpmParOc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(RpmParOc record) {
        return MyBatis3Utils.insert(this::insert, record, rpmParOc, c ->
            c.map(orgId).toProperty("orgId")
            .map(productId).toProperty("productId")
            .map(custSize).toProperty("custSize")
            .map(autoOc).toProperty("autoOc")
            .map(manualOc).toProperty("manualOc")
            .map(startTime).toProperty("startTime")
            .map(status).toProperty("status")
            .map(paramType).toProperty("paramType")
            .map(sysLine).toProperty("sysLine")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(RpmParOc record) {
        return MyBatis3Utils.insert(this::insert, record, rpmParOc, c ->
            c.map(orgId).toPropertyWhenPresent("orgId", record::getOrgId)
            .map(productId).toPropertyWhenPresent("productId", record::getProductId)
            .map(custSize).toPropertyWhenPresent("custSize", record::getCustSize)
            .map(autoOc).toPropertyWhenPresent("autoOc", record::getAutoOc)
            .map(manualOc).toPropertyWhenPresent("manualOc", record::getManualOc)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(paramType).toPropertyWhenPresent("paramType", record::getParamType)
            .map(sysLine).toPropertyWhenPresent("sysLine", record::getSysLine)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RpmParOc> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, rpmParOc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RpmParOc> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, rpmParOc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RpmParOc> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, rpmParOc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RpmParOc> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rpmParOc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(RpmParOc record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orgId).equalTo(record::getOrgId)
                .set(productId).equalTo(record::getProductId)
                .set(custSize).equalTo(record::getCustSize)
                .set(autoOc).equalTo(record::getAutoOc)
                .set(manualOc).equalTo(record::getManualOc)
                .set(startTime).equalTo(record::getStartTime)
                .set(status).equalTo(record::getStatus)
                .set(paramType).equalTo(record::getParamType)
                .set(sysLine).equalTo(record::getSysLine);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RpmParOc record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orgId).equalToWhenPresent(record::getOrgId)
                .set(productId).equalToWhenPresent(record::getProductId)
                .set(custSize).equalToWhenPresent(record::getCustSize)
                .set(autoOc).equalToWhenPresent(record::getAutoOc)
                .set(manualOc).equalToWhenPresent(record::getManualOc)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(paramType).equalToWhenPresent(record::getParamType)
                .set(sysLine).equalToWhenPresent(record::getSysLine);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(RpmParOc record) {
        return update(c ->
            c.set(orgId).equalTo(record::getOrgId)
            .set(productId).equalTo(record::getProductId)
            .set(custSize).equalTo(record::getCustSize)
            .set(autoOc).equalTo(record::getAutoOc)
            .set(manualOc).equalTo(record::getManualOc)
            .set(startTime).equalTo(record::getStartTime)
            .set(status).equalTo(record::getStatus)
            .set(paramType).equalTo(record::getParamType)
            .set(sysLine).equalTo(record::getSysLine)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(RpmParOc record) {
        return update(c ->
            c.set(orgId).equalToWhenPresent(record::getOrgId)
            .set(productId).equalToWhenPresent(record::getProductId)
            .set(custSize).equalToWhenPresent(record::getCustSize)
            .set(autoOc).equalToWhenPresent(record::getAutoOc)
            .set(manualOc).equalToWhenPresent(record::getManualOc)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(paramType).equalToWhenPresent(record::getParamType)
            .set(sysLine).equalToWhenPresent(record::getSysLine)
            .where(id, isEqualTo(record::getId))
        );
    }
}