//package com.amir.spring6learning.controllers;
//
//import ch.qos.logback.core.net.SyslogOutputStream;
//import com.amir.spring6learning.services.GreetingService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class MyController {
//
//    @Qualifier("GreettingSevicepimary")
//    private final GreetingService greetingService;
//
//    public MyController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    public String sayHello(){
//        System.out.println("i am in controller class");
//        return greetingService.sayGreeting();
//    }
//}
