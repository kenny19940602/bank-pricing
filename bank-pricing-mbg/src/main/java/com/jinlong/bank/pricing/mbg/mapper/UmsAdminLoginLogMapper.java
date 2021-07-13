package com.jinlong.bank.pricing.mbg.mapper;

import static com.jinlong.bank.pricing.mbg.mapper.UmsAdminLoginLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.jinlong.bank.pricing.mbg.model.UmsAdminLoginLog;
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
public interface UmsAdminLoginLogMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, adminId, createTime, ip, address, userAgent);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<UmsAdminLoginLog> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsAdminLoginLogResult")
    Optional<UmsAdminLoginLog> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsAdminLoginLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="admin_id", property="adminId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR)
    })
    List<UmsAdminLoginLog> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UmsAdminLoginLog record) {
        return MyBatis3Utils.insert(this::insert, record, umsAdminLoginLog, c ->
            c.map(adminId).toProperty("adminId")
            .map(createTime).toProperty("createTime")
            .map(ip).toProperty("ip")
            .map(address).toProperty("address")
            .map(userAgent).toProperty("userAgent")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UmsAdminLoginLog record) {
        return MyBatis3Utils.insert(this::insert, record, umsAdminLoginLog, c ->
            c.map(adminId).toPropertyWhenPresent("adminId", record::getAdminId)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(ip).toPropertyWhenPresent("ip", record::getIp)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(userAgent).toPropertyWhenPresent("userAgent", record::getUserAgent)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsAdminLoginLog> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsAdminLoginLog> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UmsAdminLoginLog> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UmsAdminLoginLog> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsAdminLoginLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsAdminLoginLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(adminId).equalTo(record::getAdminId)
                .set(createTime).equalTo(record::getCreateTime)
                .set(ip).equalTo(record::getIp)
                .set(address).equalTo(record::getAddress)
                .set(userAgent).equalTo(record::getUserAgent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsAdminLoginLog record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(adminId).equalToWhenPresent(record::getAdminId)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(userAgent).equalToWhenPresent(record::getUserAgent);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(UmsAdminLoginLog record) {
        return update(c ->
            c.set(adminId).equalTo(record::getAdminId)
            .set(createTime).equalTo(record::getCreateTime)
            .set(ip).equalTo(record::getIp)
            .set(address).equalTo(record::getAddress)
            .set(userAgent).equalTo(record::getUserAgent)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(UmsAdminLoginLog record) {
        return update(c ->
            c.set(adminId).equalToWhenPresent(record::getAdminId)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(ip).equalToWhenPresent(record::getIp)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(userAgent).equalToWhenPresent(record::getUserAgent)
            .where(id, isEqualTo(record::getId))
        );
    }
}