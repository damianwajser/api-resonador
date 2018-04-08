package com.example.myapp;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatabaseConfig {
	Logger log = LoggerFactory.getLogger(getClass());

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource postgresDataSource() {
		return DataSourceBuilder.create().build();
	}
}
