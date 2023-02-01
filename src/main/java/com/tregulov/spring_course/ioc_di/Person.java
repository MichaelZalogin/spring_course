package com.tregulov.spring_course.ioc_di;

public class Person {

    private Pet pet;

    private String surname;

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
}
