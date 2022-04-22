package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationProperties.xml");

        Coach myCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getDailyWorkout());
        context.close();
    }
}
