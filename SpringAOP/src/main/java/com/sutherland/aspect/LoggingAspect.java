package com.sutherland.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.sutherland.SpringAOP.model.Circle;

@Aspect
public class LoggingAspect {
	
	
	
	@Before("allCircle() && allGetters()")//good practice to combine
	public void LoggingAdvice(JoinPoint jointpoint ) {
		Circle target = (Circle)jointpoint.getTarget();
		System.out.println("Advice run. "+target.getName()+" Method called");
	}
	
	@Before("args(name)") 
	public void advice(String name) {
	 System.out.println("set Method called: "+name); }
	
	/*
	 * @Before("all()") public void secondAdvice() {
	 * System.out.println("second Advice run. Get Method called"); }
	 * 
	 * @Pointcut("execution( * *(..))")//method public void all() {}
	 */
	
	@Pointcut("execution( * get*())")
	public void allGetters()
	{
		
	}
	
	@Pointcut("within(com.sutherland.SpringAOP.model.Circle)")//package
	public void allCircle()
	{}
	
	//@Pointcut("arg()") methos matches these arguments

}
