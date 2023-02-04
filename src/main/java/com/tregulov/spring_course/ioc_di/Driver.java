package com.tregulov.spring_course.ioc_di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("driver")
public class Driver {

    @Value("Max")
    private String name;
    @Value("33")
    private int age;

    private final Car car;

    public void drive() {
        car.drive();
    }

    public Driver (Car car) {
        this.car = car;
    }
}
