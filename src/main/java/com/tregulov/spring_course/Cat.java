package com.tregulov.spring_course;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
