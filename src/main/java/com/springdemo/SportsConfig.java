package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
@ComponentScan("com.springdemo")
public class SportsConfig {

    @Bean
    public FortuneService sadFortune(){
        return new SadFortune();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortune());
    }
}
