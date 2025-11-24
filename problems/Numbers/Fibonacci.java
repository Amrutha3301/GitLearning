package com.company.problems.Numbers;

import com.company.problems.Read;

/*
 * Generate first n number in the Fibonacci sequence
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter N value");
		int n = Read.sc.nextInt();
		fibonacci(n);
		
	}
	public static void fibonacci(int n) {
		if(n == 1) {
			System.out.print(0);
		}
		else if(n == 2) {
			System.out.print(0 + " " + 1);
		}
		else {
			int a = 0, b = 1;
			System.out.print(a + " " + b + " ");
			for(int i = 3; i <= n ; i++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
		
			}
		}
	}
}
