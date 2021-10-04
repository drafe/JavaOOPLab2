package com.example.lab2.ex3;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Employee em = context.getBean("menBean", Employee.class);

        em.goToWork();
//        em.wentFromWork();
//        em.restAtHome();

        System.out.println(String.format("This is a routine of %s, that is %d years old..", em.getName(), em.getAge()));

        context.close();
    }
}
