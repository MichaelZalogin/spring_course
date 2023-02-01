package com.tregulov.spring_course.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bark");
    }
}
