package com.jason;

public class Alien {
    private int age;
    private Computer comp;
    public Alien() {
        System.out.println("Object Created");
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

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
}
