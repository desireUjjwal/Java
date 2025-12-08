package com.ujjwal;
import com.ujjwal.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt = context.getBean("desktop",Desktop.class); // By default, the name of bean is method name used in AppConfig
        Desktop dt = context.getBean("Beast",Desktop.class);
        dt.compile();
    }
}
