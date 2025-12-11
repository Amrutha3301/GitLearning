package com.test.springcoredemo.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.test.springcoredemo.p2.Arithmetic;
import com.test.springcoredemo.p2.Arithmetic1;
import com.test.springcoredemo.p2.EmployeeDao;
import com.test.springcoredemo.p2.EmployeeService;
import com.test.springcoredemo.p2.Validate;

@Configuration
@EnableAspectJAutoProxy
public class JavaContainer {
@Bean
@Lazy
@Scope(value="singleton")
public Holiday f1(){

	return new Holiday("Christmas", "25 Dec");
	
}
@Bean
public Holiday f2(){

	Holiday ob=new Holiday();
	ob.setHolidayname("New Year");
	ob.setHolidaydate( "1 Jan");
	return ob;
			
	
}
@Bean
public EmployeeBuilder f3() {
	return new EmployeeBuilder. Build().empid("1001").empname("Aria").build();
}
 @Bean
 public Arithmetic f4() {
	 return new Arithmetic1();
 }
 @Bean
 public Validate f5() {
	 return new Validate();
	 
 }
 
 @Bean
 public EmployeeDao f6() {
	 return new EmployeeDao();
 }
 @Bean
 public EmployeeService f7() {
	 return new EmployeeService();
 }

}
