package com.tregulov.spring_course.ioc_di;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bark");
    }
}
