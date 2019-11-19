package com.sutherland.ConfigClassSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        Samsung abc = (Samsung) context.getBean("samsung1");
        abc.process();
    }
}
