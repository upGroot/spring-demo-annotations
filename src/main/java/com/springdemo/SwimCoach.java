package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
    @Value("${foo.name}")
    private String name;

    @Value("${foo.email}")
   private String email;

    @Autowired
    //@Qualifier("sadFortune")
    FortuneService fortuneService;

    public  SwimCoach(@Qualifier("sadFortune") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim for 15 minutes straight";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getRandomFortune();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
