package com.yujun.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@Configuration
@ComponentScan
@EnableAutoConfiguration
*/ //자동 탑재

@SpringBootApplication
public class BootPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPracticeApplication.class, args);
	}

}
