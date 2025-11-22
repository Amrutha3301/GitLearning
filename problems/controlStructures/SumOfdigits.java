package com.company.problems.controlStructures;

import com.company.problems.Read;

/**
 * keep Summing the digits until one remains
 */
public class SumOfdigits {

	public static void main(String[] args) {
		System.out.println("Enter the value of 'N' ");
		
		int n = Read.sc.nextInt();

		System.out.println(SumDigits(n));
	}
	
	public static int SumDigits(int n) {
		if(n < 10) {
			return n;
		}
		return SumDigits(sum(n));
	}
	
	public static int sum(int n) {
		int sum = 0;
		
		while(n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		
		return sum;
	}
}
