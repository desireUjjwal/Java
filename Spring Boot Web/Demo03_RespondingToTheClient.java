package com.ujjwal;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        //Earlier we use to do mapping using web.xml in external tomcat where we need to specify the url and we need to specify the servlet correspondingly.
        //@WebServlet("/hello") --> Using External Tomcat we can also do this
        // mapping for Internal Tomcat server which we use now:
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}
