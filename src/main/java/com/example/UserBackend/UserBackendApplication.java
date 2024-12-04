package com.example.UserBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controller","com.service"})
@Configuration
@EntityScan("com.dto")
@EnableAutoConfiguration
@EnableJpaRepositories("com.repo")
public class UserBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

}
