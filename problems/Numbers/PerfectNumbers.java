package com.company.problems.Numbers;

import com.company.problems.Read;


/*
 * A perfect number is equal to the sum of its proper divisors
 */
public class PerfectNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int n = Read.sc.nextInt();
		if(checkPerfectNumber(n)) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not an Perfect Number");
		}
	}
	
	public static boolean checkPerfectNumber(int n) {
		int temp  = n;
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum == temp;
	}
}
