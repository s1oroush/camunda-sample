package com.example.camuda.example;

import org.springframework.stereotype.Component;

@Component
public class BeanSample {

    public String test(String name){
        return "Mr " + name;
    }
}
