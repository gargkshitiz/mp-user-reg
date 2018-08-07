package com.mp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.mp.demo.model")
@EnableJpaRepositories("com.mp.demo.repo")
@ComponentScan(basePackages="com.mp.*")
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
