package com.jason;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("comp2")
@Primary                    //Qualifier have more preference than Primary
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop object Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
