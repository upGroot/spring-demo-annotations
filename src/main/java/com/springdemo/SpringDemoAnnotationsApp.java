package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SpringDemoAnnotationsApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationProperties.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("cricketCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call a method on the bean
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
