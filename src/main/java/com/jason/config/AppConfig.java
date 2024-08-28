package com.jason.config;

import com.jason.Alien;
import com.jason.Computer;
import com.jason.Desktop;
import com.jason.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.jason")
public class AppConfig {

//    @Bean
////    By using the @Qualifier annotation, we can eliminate the issue of which bean needs to be injected.
////    Qualifier precedes primary.
////    public Alien alien(@Qualifier("desktop") Computer comp){
//    public Alien alien(Computer comp){
//        Alien obj = new Alien();
//        obj.setAge(23);
//        obj.setComp(comp);
//        return obj;
//    }
//
//
////    @Bean(name = {"comp2","desktop1", "desk"}) //can change bean name by defining them
//
//    @Bean
////    @Scope("prototype")     //default scope is singleton
//    public Desktop desktop(){       //method name is default bean name (here bean name- desktop)
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
