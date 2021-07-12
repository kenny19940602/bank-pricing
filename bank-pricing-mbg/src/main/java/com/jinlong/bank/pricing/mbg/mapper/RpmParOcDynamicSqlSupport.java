package com.jinlong.bank.pricing.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RpmParOcDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final RpmParOc rpmParOc = new RpmParOc();

    public static final SqlColumn<Long> id = rpmParOc.id;

    public static final SqlColumn<Long> orgId = rpmParOc.orgId;

    public static final SqlColumn<Long> productId = rpmParOc.productId;

    public static final SqlColumn<Long> custSize = rpmParOc.custSize;

    public static final SqlColumn<Long> autoOc = rpmParOc.autoOc;

    public static final SqlColumn<Long> manualOc = rpmParOc.manualOc;

    public static final SqlColumn<Date> startTime = rpmParOc.startTime;

    public static final SqlColumn<Integer> status = rpmParOc.status;

    public static final SqlColumn<Integer> paramType = rpmParOc.paramType;

    public static final SqlColumn<Integer> sysLine = rpmParOc.sysLine;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class RpmParOc extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> orgId = column("ORG_ID", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("PROduct_id", JDBCType.BIGINT);

        public final SqlColumn<Long> custSize = column("cust_size", JDBCType.BIGINT);

        public final SqlColumn<Long> autoOc = column("auto_oc", JDBCType.DECIMAL);

        public final SqlColumn<Long> manualOc = column("manual_oc", JDBCType.DECIMAL);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> paramType = column("param_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> sysLine = column("sys_line", JDBCType.INTEGER);

        public RpmParOc() {
            super("rpm_par_oc");
        }
    }
}