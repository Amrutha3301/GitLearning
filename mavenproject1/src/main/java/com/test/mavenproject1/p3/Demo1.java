package com.test.mavenproject1.p3;

public class Demo1 {

	public static void main(String[] args) {
//		IsMath obj = new IsMath() { --> creates a annonimous class
//
//			@Override
//			public int cal(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		}
		  
		IsMath obj =(x,y)->(x+y);   // lamda function  for more than one exp line then {} is used instead of ()
		IsMath obj1 = (x,y)->{int z=x-y;
		return z;};                   // for {} return statement is needed
		System.out.println(obj.cal(10,20));
		System.out.println(obj1.cal(30,40));
		f1((x,y)->(x*y), 10,2);
		f1((x,y)->(x/y), 10,2);
		}

// static is because obj need not be created ,if static is not used then odj must have been created
 public static void f1(IsMath obj, int a, int b) {
	 System.out.println(obj.cal(a, b));
	 
 }
 }
@FunctionalInterface
interface IsMath{
	public int cal (int a,int b);
	// public void cal(); it should contain only one abstract method
	
}
