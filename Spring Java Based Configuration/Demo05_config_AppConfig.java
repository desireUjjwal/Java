package com.ujjwal.config;

import com.ujjwal.Alien;
import com.ujjwal.Computer;
import com.ujjwal.Desktop;
import com.ujjwal.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Alien alien(Computer com){ // @Autowired is optional @Qualifier("desktop")
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }

    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }
}
