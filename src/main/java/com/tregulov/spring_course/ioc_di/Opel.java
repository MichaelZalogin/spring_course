package com.tregulov.spring_course.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class Opel implements Car{
    @Override
    public void drive() {
        System.out.println("Drives a Opel");
    }
}