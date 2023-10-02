package com.example.infinitscroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class InfinitScrollApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfinitScrollApplication.class, args);
    }

}
