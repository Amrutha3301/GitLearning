package com.test.mavenproject1.p1;

import java.util.Scanner;

public class Demo5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int num =Read.sc.nextInt();
		
		System.out.println("Binary:"+ convert(num,2));
		System.out.println("octal:"+ convert(num,8));
		sc.close();
		
		
	}
	public static String convert (int num,int base) {
		String result="";
		while(num>0) {
			int remainder=num%base;
			result=remainder+result;
			num/=base;
		}
		return result;
		
	}
	

}
