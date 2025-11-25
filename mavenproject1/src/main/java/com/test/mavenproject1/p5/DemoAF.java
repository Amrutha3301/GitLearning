package com.test.mavenproject1.p5;

import com.test.mavenproject1.p2.Arithmetic;

public class DemoAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj=ArithmeticFactory.getarithmetic(1);
		obj.setData(20,56);
		obj.cal();
		obj.display();

	}

}
