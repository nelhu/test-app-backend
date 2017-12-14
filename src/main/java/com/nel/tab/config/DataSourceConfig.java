package com.nel.tab.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="com.nel.tab")
@EnableTransactionManagement(mode = AdviceMode.PROXY)
public class DataSourceConfig {
	
	@Autowired
	Environment env;
	
//	@Autowired
//	EntityManagerFactory entityManagerFactory;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}
	
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//		LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean = 
//				new LocalContainerEntityManagerFactoryBean();
//		containerEntityManagerFactoryBean.setDataSource(dataSource);
//		containerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//		containerEntityManagerFactoryBean.setPackagesToScan("com.nel.tab");
//		
//		return containerEntityManagerFactoryBean;
//		
//	}
	
	
}
