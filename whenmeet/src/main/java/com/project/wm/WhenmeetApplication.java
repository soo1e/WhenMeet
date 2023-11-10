package com.project.wm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"main","login","schedule","meeting","search","group","websocket"})
@MapperScan(basePackages = {"main","login","schedule","meeting","search","group"})
public class WhenmeetApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(WhenmeetApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WhenmeetApplication.class);
	}

}