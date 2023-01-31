package com.tregulov.spring_course.ioc_di;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
