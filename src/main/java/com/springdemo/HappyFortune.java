//package com.springdemo;
//
//import org.springframework.stereotype.Component;
//import javax.annotation.PostConstruct;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//
//@Component  //It is used to detect beans automatically
//public class HappyFortune implements FortuneService{
////    private List<String> list = new ArrayList<>();
//    private String fileName = "C:\\Users\\ayush\\Downloads\\SpringBootApplication\\spring-demo-annotations\\src\\main\\resources\\ApplicationProperties.txt";
//    private List<String> theFortunes;
//
//    // create a random number generator
//    private Random myRandom = new Random();
//
//    public HappyFortune() {
//        File theFile = new File(fileName);
//
//        System.out.println("Reading fortunes from file: " + theFile);
//        System.out.println("File exists: " + theFile.exists());
//
//        // initialize array list
//        theFortunes = new ArrayList<String>();
//
//        // read fortunes from file
//        try (BufferedReader br = new BufferedReader(
//                new FileReader(theFile))) {
//
//            String tempLine;
//
//            while ((tempLine = br.readLine()) != null) {
//                theFortunes.add(tempLine);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @Override
//    public String getRandomFortune() {
//        int rnd = new Random().nextInt(theFortunes.size());
//        return theFortunes.get(rnd);
//    }
//
////    @PostConstruct
////    private void randomFortune() {
////
////    }
//}
