package com;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.*"})
public class JdbcConfig {
@Bean
public DataSource dataSource(){
    DriverManagerDataSource dataSource = new DriverManagerDataSource();

    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/experis");
    dataSource.setUsername("root");
    dataSource.setPassword("youcanwin80");

    return dataSource;
}

@Bean
public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource());
}
}
