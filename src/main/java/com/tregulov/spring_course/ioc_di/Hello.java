package com.tregulov.spring_course.ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Pet pet = context.getBean("MyPet", Pet.class);
        pet.say();
        context.close();
    }
}