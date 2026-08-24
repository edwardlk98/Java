package com.example.Beans;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
@Component
public class Parrot {
    private String name;
    @PostConstruct
    public void setName(){
        this.name = "kiki";
    }
    public String getName(){
        return this.name;
    }
}
