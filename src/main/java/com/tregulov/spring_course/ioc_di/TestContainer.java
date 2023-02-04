package com.tregulov.spring_course.ioc_di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContainer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        ApplicationContextClass.class
                );

        Driver driver = context.getBean("driver", Driver.class);
        driver.drive();
        context.close();
    }
}
