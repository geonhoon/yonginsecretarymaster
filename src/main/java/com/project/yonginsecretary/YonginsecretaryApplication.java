package com.project.yonginsecretary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.Entity;

@SpringBootApplication
public class YonginsecretaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(YonginsecretaryApplication.class, args);
	}

}
