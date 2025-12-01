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
        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();

        Desktop dt2 = context.getBean(Desktop.class);
        dt2.compile();
    }
}
