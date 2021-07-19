package com.example.provinceservice;

import config.MSSQLConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@EnableEurekaClient
@SpringBootApplication
@Import(MSSQLConfiguration.class)
public class ProvinceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvinceServiceApplication.class, args);
	}

}
