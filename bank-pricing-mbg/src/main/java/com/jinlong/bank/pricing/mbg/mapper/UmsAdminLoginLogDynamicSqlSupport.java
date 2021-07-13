package com.jinlong.bank.pricing.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UmsAdminLoginLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UmsAdminLoginLog umsAdminLoginLog = new UmsAdminLoginLog();

    public static final SqlColumn<Long> id = umsAdminLoginLog.id;

    public static final SqlColumn<Long> adminId = umsAdminLoginLog.adminId;

    public static final SqlColumn<Date> createTime = umsAdminLoginLog.createTime;

    public static final SqlColumn<String> ip = umsAdminLoginLog.ip;

    public static final SqlColumn<String> address = umsAdminLoginLog.address;

    public static final SqlColumn<String> userAgent = umsAdminLoginLog.userAgent;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UmsAdminLoginLog extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> adminId = column("admin_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ip = column("ip", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> userAgent = column("user_agent", JDBCType.VARCHAR);

        public UmsAdminLoginLog() {
            super("ums_admin_login_log");
        }
    }
}