package com.example.lab2.ex1;

public class Car {
    public Car(){
        System.out.println("Car was created");
    }

    public void init() {
        System.out.println("Class Car: init method");
    }

    public void destroy() {
        System.out.println("Class Car: destroy method");
    }
    public void drive(){
        System.out.println(" ~ VROOM VROOM ~ ");
    }
}
