package com.jinlong.bank.pricing.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RpmParTaxDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final RpmParTax rpmParTax = new RpmParTax();

    public static final SqlColumn<Long> id = rpmParTax.id;

    public static final SqlColumn<String> taxType = rpmParTax.taxType;

    public static final SqlColumn<Integer> orgId = rpmParTax.orgId;

    public static final SqlColumn<Long> taxRate = rpmParTax.taxRate;

    public static final SqlColumn<Date> startTime = rpmParTax.startTime;

    public static final SqlColumn<Date> createTime = rpmParTax.createTime;

    public static final SqlColumn<Integer> status = rpmParTax.status;

    public static final SqlColumn<Integer> paramType = rpmParTax.paramType;

    public static final SqlColumn<Double> appendTaxRate = rpmParTax.appendTaxRate;

    public static final SqlColumn<Long> contractSumThreshold = rpmParTax.contractSumThreshold;

    public static final SqlColumn<Integer> productId = rpmParTax.productId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class RpmParTax extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> taxType = column("tax_type", JDBCType.VARCHAR);

        public final SqlColumn<Integer> orgId = column("org_id", JDBCType.INTEGER);

        public final SqlColumn<Long> taxRate = column("tax_rate", JDBCType.DECIMAL);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> paramType = column("param_type", JDBCType.INTEGER);

        public final SqlColumn<Double> appendTaxRate = column("append_tax_rate", JDBCType.DOUBLE);

        public final SqlColumn<Long> contractSumThreshold = column("contract_sum_threshold", JDBCType.DECIMAL);

        public final SqlColumn<Integer> productId = column("product_id", JDBCType.INTEGER);

        public RpmParTax() {
            super("rpm_par_tax");
        }
    }
}