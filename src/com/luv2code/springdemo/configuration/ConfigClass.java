package com.luv2code.springdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.BadFortuneService;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.SwimCoach;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class ConfigClass {

    @Bean
    public FortuneService badFortuneService() {
        return new BadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(badFortuneService());
    }

}
