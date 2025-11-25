package com.company.problems.Numbers;

import com.company.problems.Read;

public class Armstrong {

	/*
	 * Check if a number is an Armstrong eg:  153
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int n = Read.sc.nextInt();
		
		if(checkArmstrong(n)) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}
	
	public static boolean checkArmstrong(int n) {
		int temp  = n;
		int sum = 0;
		while(n > 0) {
			int last = n % 10;
			sum += Math.pow(last, 3);
			n = n / 10;
		}
		return sum == temp;
	}
	
}
