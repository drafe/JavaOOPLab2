package com.example.lab2.ex2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("kiaCar")
public class Car {
    public Car(){
        System.out.println("Car was created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Car: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Car: destroy method");
    }
    public void drive(){
        System.out.println(" ~ VROOM VROOM ~ ");
    }
}
