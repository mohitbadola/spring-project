package com.jason.config;

import com.jason.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name = {"comp2","desktop1", "desk"}) //can change bean name by defining them

    @Bean
    @Scope("prototype")     //default scope is singleton
    public Desktop desktop(){       //method name is default bean name (here bean name- desktop)
        return new Desktop();
    }
}
