package com.example.lab2.ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet dogBean () {
        return new Dog();
    }

    @Bean
    public Car carBean () {
        return new Car();
    }

    @Bean
    public Employee menBean () {
        return new Employee(dogBean(), carBean());
    }
}
