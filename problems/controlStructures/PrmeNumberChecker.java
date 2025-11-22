package com.company.problems.controlStructures;

import com.company.problems.Read;

/**
	 * check if a given number is prime, if not list its factors.
	 * @param args
	 */
public class PrmeNumberChecker {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the Value of 'n'");
		
		int n = Read.sc.nextInt();

		
		if(isPrime(n)) {
			System.out.print("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number, The factors are");
			printFactors(n);
		}
		
	}
	
	
	static boolean isPrime(int n) {
		   if(n <= 2) {
			   return true;
		   }
		   for(int i=3; i<=Math.sqrt(n); i++) {
			   if(n % i == 0) {
				   return false;
			   }
		   }
		   return true;
	}

	
	static void printFactors(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
