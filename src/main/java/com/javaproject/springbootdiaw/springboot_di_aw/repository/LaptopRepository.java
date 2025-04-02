package com.javaproject.springbootdiaw.springboot_di_aw.repository;

import com.javaproject.springbootdiaw.springboot_di_aw.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void saveLaptop(Laptop laptop){
        System.out.println("Laptop Saved Successfully");
    }
}
