package com.springdemo;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Random;

@Service //Annotates class at the service layer
public interface FortuneService {
    //public String getFortune();
    public String getRandomFortune();
}
