package com.vs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.vs.controller","com.vs.services"})
@EntityScan(basePackages= {"com.vs.model"})
@EnableJpaRepositories(basePackages= {"com.vs.repository"})
public class SpringBootEedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEedApplication.class, args);
	}

}
