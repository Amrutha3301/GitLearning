package com.test.springcoredemo.p2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class Validate {
	@Before("execution(* *.*(int,int))")
  public void valid(JoinPoint arg) throws IllegalArgumentException{
	  for(Object x: arg.getArgs()) {
		  if((Integer) x<0) {
			  throw new IllegalArgumentException("Negative numbers not supported");
		  }
	  }
  }
	@AfterReturning(pointcut="execution(* *.*(int,int))",returning="abc")
	 public void valid(JoinPoint jp,Object abc) throws IllegalArgumentException{
			  if((Integer) abc>200000) {
				  throw new IllegalArgumentException("value crosses max limit");
			  }
		  }
	
}
