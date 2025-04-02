package com.javaproject.springbootdiaw.springboot_di_aw.service;

import com.javaproject.springbootdiaw.springboot_di_aw.model.Laptop;
import com.javaproject.springbootdiaw.springboot_di_aw.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop){
        laptopRepository.saveLaptop(laptop);
    }

    public boolean isLaptopGaming(Laptop laptop){
        return true;
    }
}
