package com.tregulov.spring_course.ioc_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContextAnnotation.xml");
        Person person = context.getBean("anythingPerson", Person.class);
        person.callYouPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
