package com.jason.config;

import com.jason.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean(name = {"comp2","desktop1", "desk"}) //can change bean name by defining them
    
    @Bean
    public Desktop desktop(){       //method name is default bean name (here bean name- desktop)
        return new Desktop();
    }
}
