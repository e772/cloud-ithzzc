package com.ithzzc.cloud.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages="com.ithzzc.cloud")
@MapperScan("com.ithzzc.cloud.modules.system.mapper")
@EnableCaching // 开启缓存
@EnableSwagger2
public class AdminApp extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AdminApp.class, args);
		System.out.println("AdminApp is up!");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return application.sources(AdminApp.class);
	}
	
	
}
