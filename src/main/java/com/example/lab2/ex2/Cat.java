package com.example.lab2.ex2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("lazyCat")
@Scope("prototype")
public class Cat implements Pet {
    @PostConstruct
    public void init() {
        System.out.println("Class Cat: init method");
    }

    public Cat() {
        System.out.println("Cat was created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Meow~~meow");
    }
}
