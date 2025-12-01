package com.ujjwal.config;

import com.ujjwal.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
