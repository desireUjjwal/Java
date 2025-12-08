package com.ujjwal;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com2") // com2 is the name of bean here
@Primary
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop Object Created");
    }
    @Override
    public void compile(){
        System.out.println("Compiling using desktop");
    }
}
