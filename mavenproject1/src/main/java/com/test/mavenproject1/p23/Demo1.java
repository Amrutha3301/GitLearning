package com.test.mavenproject1.p23;

import com.test.mavenproject1.p22.EncapsulationDemo;

public class Demo1 extends EncapsulationDemo  {

	public static void main(String[] args) {
	
				EncapsulationDemo ob=new EncapsulationDemo();
				// private member so can not be accessed System.out.println(ob.a);
				// will not work as it is outside the package System.out.println(ob.b);
				// will not work as it is outside the package System.out.println(ob.c);
				System.out.println(ob.d);
				
				// private member ob.f1();
				// will not work as it is outside the package ob.f2();
				// will not work as it is outside the package ob.f3();
				ob.f4();

			}
	
	public void test() {
		// not allowed as private - System.out.println(a);
		// not allowed as private - System.out.println(b);
		
		// public member and member function are allowed
		//And protected members are allowed as it has been inherited
		
		System.out.println(c);
		System.out.println(d);
		
	}

}
