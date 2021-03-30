package com.websystique.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.websystique.spring.service.ProductService;
import com.websystique.spring.service.ProductServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.websystique.spring")
public class AppConfig {

	 @Bean
	 public ProductService productService() {
		 return new ProductServiceImpl();
	 }
}
