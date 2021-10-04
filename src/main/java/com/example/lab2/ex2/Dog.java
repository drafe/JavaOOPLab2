package com.example.lab2.ex2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("cuteDog")
public class Dog implements Pet {
    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

    public Dog() {
        System.out.println("Dog was created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
