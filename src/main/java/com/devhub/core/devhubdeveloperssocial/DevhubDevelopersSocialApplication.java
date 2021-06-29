package com.devhub.core.devhubdeveloperssocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DevhubDevelopersSocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevhubDevelopersSocialApplication.class, args);
    }

}
