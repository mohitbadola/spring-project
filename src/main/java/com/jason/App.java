package com.jason;

import com.jason.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();

        Desktop dt2 = context.getBean(Desktop.class);
        dt2.compile();







//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //create a container
//        Alien obj1 = context.getBean("alien", Alien.class);
////        obj1.age = 24;
////        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien");
//        System.out.println(obj2.age);
//        obj2.code();

//        Computer com = context.getBean( Desktop.class);
//        Computer is interface hence it is also allowed
//        Computer com = context.getBean( Computer.class);

//        Desktop desk = context.getBean(Desktop.class);

    }
}
