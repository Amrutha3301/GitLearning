package com.company.problems.controlStructures;

import com.company.problems.Read;

/*
 * Use loops and conditions to compute both GCD and LCM of two numbers
 */
public class GcdLcm {
	public static void main(String[] args) {
		
		System.out.println("Enter 'A' value");
		int a = Read.sc.nextInt();

		System.out.println("Enter 'A' value");
		int b = Read.sc.nextInt();
		
		int gdc = gcd(a, b);
		int lcm = a * b / gdc;
		
		System.out.println("Gcd is " + gdc);
		System.out.println("Lcm is " + lcm);
		
		
	}
	
	public static int gcd(int a, int b) {
		while(b !=  0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
		
	}
}
