package com.wxy.util;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * DIY_SNOWFLAKE
 * 自定义主键生成策略
 */
@Component

public class KeyGenerator implements ShardingKeyGenerator {
    private Properties properties;

    // 自定义id生成
    @Override
    public Comparable<?> generateKey() {
        return System.currentTimeMillis();
    }

    @Override
    public String getType() {
        return "DIY_ID_GENERATOR";   // 对应yml文件
    }

    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
