package com.test.springcoredemo.p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.springcoredemo.p1.JavaContainer;

public class Demo1 {

	public static void main(String[] args) {
		try {
			 ApplicationContext context=new AnnotationConfigApplicationContext(JavaContainer.class);
			 Arithmetic ob=context.getBean(Arithmetic.class);
			// System.out.println(ob.add(-10,20));
			 System.out.println(ob.add(200000,100000));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
