package com.ujjwal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {
    private int age;
    @Autowired //--> Field Injection // Injection can be done in 3 levels --> 1.field injection(By default)  2.Constructor Injection 3.Setter Injection
    @Qualifier("com2") // By default, bean name is class name but first letter should be small(eg: laptop, desktop)
    private Computer com;
    public Alien(){
        System.out.println("Alien Object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
