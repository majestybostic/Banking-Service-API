package com.ey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ey")
public class BankingServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingServiceApiApplication.class, args);
	}

}
