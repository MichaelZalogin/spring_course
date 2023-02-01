package com.tregulov.spring_course.ioc_di;

public class Person {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my pet");
        pet.say();
    }
}
