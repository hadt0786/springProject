package com.sutherland.AutowireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
        A obj=(A) context.getBean("a");
        obj.dispaly();
    }
}
