package com.example.lab2.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("newWorker")
public class Employee {
    private Pet pet;
    private Car car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

    @Autowired
    public Employee(@Qualifier("lazyCat") Pet pet, Car car) {
        this.pet = pet;
        this.car = car;
        System.out.println("Employee was created and got pet and car");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Employee get name \"" + name + "\"");
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("Employee get age \"" + age + "\"");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Employee: init method");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Employee: destroy method");
    }
    public void restAtHome() {
        System.out.println("[takes favourite toy to play with little friend]");
        this.pet.say();
        System.out.println("[both are filled with happiness]");
    }

    public void goToWork() {
        System.out.println("[pours food to the pet]");
        this.pet.say();
        System.out.println("[close the door and start the engine]");
        this.car.drive();
    }

    public void wentFromWork() {
        this.car.drive();
        System.out.println("[open the door]");
        this.pet.say();
    }
}
