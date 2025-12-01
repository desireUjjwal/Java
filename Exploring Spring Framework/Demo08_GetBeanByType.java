package com.ujjwal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // creates a container(Ioc) // object is also created at this stage
        Alien obj1 = (Alien) context.getBean("alien1", Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

        Desktop obj = context.getBean(Desktop.class);

        Computer com = context.getBean(Computer.class);
    }
}
