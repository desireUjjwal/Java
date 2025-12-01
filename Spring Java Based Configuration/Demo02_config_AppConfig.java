package com.ujjwal.config;

import com.ujjwal.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name={"com2","desktop1","Beast"}) // We can give multiple names from which anyone we can use
    public Desktop desktop(){
        return new Desktop();
    }
}
