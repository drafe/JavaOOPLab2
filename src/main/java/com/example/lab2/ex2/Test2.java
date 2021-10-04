package com.example.lab2.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans_2.xml");

        Employee em = context.getBean("newWorker", Employee.class);

//        em.goToWork();
//        em.wentFromWork();
//        em.restAtHome();

        System.out.println(String.format("This is a routine of %s, that is %d years old..", em.getName(), em.getAge()));

        int count = 5;
        ArrayList<Pet> cats = new ArrayList<Pet>(count);
        for (int i=0; i<count; i++){
            cats.add(context.getBean("lazyCat", Cat.class));
        }
        context.close();
    }
}
