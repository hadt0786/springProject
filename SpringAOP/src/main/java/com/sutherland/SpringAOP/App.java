package com.sutherland.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sutherland.SpringAOP.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        ShapeService shapeService=context.getBean("shapeService",ShapeService.class);
        shapeService.getCircle().setName("abc");
        System.out.println(shapeService.getCircle()
        		.getName());
    }
}
