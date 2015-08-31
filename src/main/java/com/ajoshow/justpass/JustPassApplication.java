package com.ajoshow.justpass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class JustPassApplication {

    public static void main(String[] args) {
    	ApplicationContext ctx = SpringApplication.run(JustPassApplication.class, args);
    }
}
