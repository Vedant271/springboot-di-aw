package com.javaproject.springbootdiaw.springboot_di_aw.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("Compiling Using Laptop");
    }
}
