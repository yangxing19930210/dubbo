package com.sekorm.dubbo.service.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * DruidConfig
 *
 * @author noah_yang
 * @version 1.0
 * @date 2019-08-22 14:37
 */
@Configuration
public class DruidConfig {

    /**
     * 把配置注入druid中，进行sql监控
     *
     * @return
     */
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource druidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
