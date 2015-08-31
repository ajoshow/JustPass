package com.ajoshow.justpass.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class DataSourceConfig {
 
   @Value("${spring.datasource.username}")
   private String username;
 
   @Value("${spring.datasource.password}")
   private String password;
 
   @Value("${spring.datasource.url}")
   private String dataSourceUrl;
 
   @Value("${spring.datasource.dataSourceClassName}")
   private String dataSourceClassName;
 
   @Value("${spring.datasource.poolName}")
   private String poolName;
 
   @Value("${spring.datasource.connectionTimeout}")
   private int connectionTimeout;
 
   @Value("${spring.datasource.maxLifetime}")
   private int maxLifetime;
 
   @Value("${spring.datasource.maximumPoolSize}")
   private int maximumPoolSize;
 
   @Value("${spring.datasource.minimumIdle}")
   private int minimumIdle;
 
   @Value("${spring.datasource.idleTimeout}")
   private int idleTimeout;
}