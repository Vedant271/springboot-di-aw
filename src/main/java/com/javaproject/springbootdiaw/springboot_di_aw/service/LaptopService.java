package com.javaproject.springbootdiaw.springboot_di_aw.service;

import com.javaproject.springbootdiaw.springboot_di_aw.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop laptop){
        System.out.println("Laptop Added Successfully");
    }

    public boolean isLaptopGaming(Laptop laptop){
        return true;
    }
}
