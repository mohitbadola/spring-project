package com.jason;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop object Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
