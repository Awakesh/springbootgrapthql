package com.graphsql.SpringBootGraphSqlDemo;

import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGraphSqlDemoApplication {

	@Bean
	public ExitCodeGenerator exitCodeGenerator(){
		return ()->4555;
	}
	public static void main(String[] args) {

		System.exit(SpringApplication.exit(SpringApplication.run(SpringBootGraphSqlDemoApplication.class,args)));
	}

}
