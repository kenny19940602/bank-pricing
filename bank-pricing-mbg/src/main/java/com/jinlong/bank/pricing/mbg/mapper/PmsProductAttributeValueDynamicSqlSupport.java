package com.jinlong.bank.pricing.mbg.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PmsProductAttributeValueDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final PmsProductAttributeValue pmsProductAttributeValue = new PmsProductAttributeValue();

    public static final SqlColumn<Long> id = pmsProductAttributeValue.id;

    public static final SqlColumn<Long> productId = pmsProductAttributeValue.productId;

    public static final SqlColumn<Long> productAttributeId = pmsProductAttributeValue.productAttributeId;

    public static final SqlColumn<String> value = pmsProductAttributeValue.value;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class PmsProductAttributeValue extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> productId = column("product_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productAttributeId = column("product_attribute_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public PmsProductAttributeValue() {
            super("pms_product_attribute_value");
        }
    }
}