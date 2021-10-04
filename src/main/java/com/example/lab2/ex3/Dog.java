package com.example.lab2.ex3;

public class Dog implements Pet{
    public void init() {
        System.out.println("Class Dog: init method");
    }

    public Dog() {
        System.out.println("Dog was created");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Woof-woof");
    }
}
