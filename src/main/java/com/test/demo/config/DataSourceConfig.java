package com.test.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.test.demo.mapper"})
public class DataSourceConfig {
	
//	@Bean
//	@ConfigurationProperties(prefix = "mybatis")
//	public SqlSessionFactoryBean sqlSessionFactoryBean() {
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dynamicDataSource());
//		return sqlSessionFactoryBean;
//	}
	
	
}
