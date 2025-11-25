package com.test.mavenproject1.p5;

import com.test.mavenproject1.p2.Add;
import com.test.mavenproject1.p2.Arithmetic;
import com.test.mavenproject1.p2.Div;
import com.test.mavenproject1.p2.Mul;
import com.test.mavenproject1.p2.Sub;


public class ArithmeticFactory {
	private static Arithmetic arr[]=new Arithmetic[] { new Add(),new Sub(), new Mul(),new Div()
	};
 public static Arithmetic getarithmetic(int i) {
	 return arr[i];
 }
}
