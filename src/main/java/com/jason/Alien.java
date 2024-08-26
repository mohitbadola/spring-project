package com.jason;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien() {
        System.out.println("Object Created");
    }

    public Alien(int age, Laptop lap) {
        System.out.println("para constructor");
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   //Setter Injection
        System.out.println("Setter Called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
