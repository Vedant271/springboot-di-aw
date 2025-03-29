package com.javaproject.springbootdiaw.springboot_di_aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
    Laptop l;

    public void task(){
        System.out.println("Coding");
        l.compile();
    }
}
