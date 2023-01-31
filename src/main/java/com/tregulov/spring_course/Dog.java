package com.tregulov.spring_course;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bark");
    }
}
