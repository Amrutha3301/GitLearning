package com.test.mavenproject1.p2;

import com.test.mavenproject1.p1.Read;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic ob2[]=new Arithmetic[4];
		ob2[0]=new Add();
		ob2[1]=new Sub();
		ob2[2]=new Mul();
		ob2[3]=new Div();
		
		System.out.println("Enter 1 for Add, 2 for sub, 3 for Mul, 4 for Div");
		int ch=Read.sc.nextInt();
		System.out.println("Enter two numbers:");
		ob2[ch-1].setData(Read.sc.nextInt(),Read.sc.nextInt());
		ob2[ch-1].cal();
		ob2[ch-1].display();
		
		

	}

}
