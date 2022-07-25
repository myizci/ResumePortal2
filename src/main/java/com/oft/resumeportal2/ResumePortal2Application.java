package com.oft.resumeportal2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = USerRepository.class)
public class ResumePortal2Application {

    public static void main(String[] args) {
        SpringApplication.run(ResumePortal2Application.class, args);
    }

}
