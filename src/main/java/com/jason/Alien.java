package com.jason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;

//    @Autowired
//    @Qualifier("comp2")   //small letter class name or given name inside component
    private Computer comp;
    public Alien() {
        System.out.println("Alien Object Created");
    }

//    public Alien(int age, Laptop lap) {
//    System.out.println("Para Constructor called");
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   //Setter Injection
//        System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired  //setter injection using Autowired
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
}
