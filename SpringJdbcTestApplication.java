package com.springJDBC.com.springJDBCTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcTestApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringJdbcTestApplication.class, args);
	}

}
