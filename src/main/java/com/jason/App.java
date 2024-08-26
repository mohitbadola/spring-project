package com.jason;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //create a container
        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.age = 24;
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien");
//        System.out.println(obj2.age);
//        obj2.code();
    }
}
