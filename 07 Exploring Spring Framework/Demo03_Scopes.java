package com.ujjwal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // creates a container(Ioc) // object is also created at this stage
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.age = 22;
        System.out.println(obj1.age);

        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);

    }
}
