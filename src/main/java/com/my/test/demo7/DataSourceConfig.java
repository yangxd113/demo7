package com.my.test.demo7;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
@Configuration
public class DataSourceConfig {
	@Primary
    @Bean
    @ConfigurationProperties("spring.datasource.druid.mysqlone")
    DataSource mysqlDataSource(){
        return DruidDataSourceBuilder.create().build();
	}
}
