package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component  //It is used to detect beans automatically
public class CricketCoach implements Coach{

    @Autowired  //It is used to make a connection between Interface and the class that implemented it.
    // @Qualifier() is used when more than one class is implementing the interface and you need to specify which class you want to wire with.
    private FortuneService fortuneService;

    public CricketCoach() {

    }
   // private HappyFortune fortune;

//    @Autowired()
//    CricketCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Bat Lofted shots for 1 hour daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getRandomFortune();
    }
}
