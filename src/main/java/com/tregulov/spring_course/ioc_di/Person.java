package com.tregulov.spring_course.ioc_di;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("anythingPerson")
public class Person {
    @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYouPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
    @PostConstruct
    public void personInit() {
        System.out.println("run init method");
    }
    @PreDestroy
    public void personDestroy() {
        System.out.println("run destroy method");
    }
}
