package com.springdemo;

public class SadFortune implements FortuneService{
    @Override
    public String getRandomFortune() {
        return "Today is a sad day";
    }
}
