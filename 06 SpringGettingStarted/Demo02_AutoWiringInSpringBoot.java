package com.ujjwal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(SpringBootDemoApplication.class, args);

        Alien obj = context.getBean(Alien.class);
        obj.code();

//        Laptop lap = context.getBean(Laptop.class); // object is created in Ioc container but to make is accessible in Laptop we need to do wiring so that Alien class will search for Laptop in Ioc Container
//        lap.compile();

	}
}
