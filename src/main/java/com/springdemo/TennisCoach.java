package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component  //It is used to detect beans automatically
public class TennisCoach implements Coach{

    @Autowired //It is used to make a connection between Interface and the class that implemented it.
    FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Play Backfoot shots for 20 minutes straight";
    }

    @PostConstruct //It is used when we need to call the method after the creation of bean and constructor.
    public void doMyStartUp(){
        System.out.println("Inside startup");
    }

    @PreDestroy   //It is used when we need to call the method before the bean is destroyed.
    public void doMyEnd(){
        System.out.println("Kill me");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getRandomFortune();
    }
}
