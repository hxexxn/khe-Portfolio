package com.portfolio.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class KhePortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(KhePortfolioApplication.class, args);
	}

}
