package com.company.problems.Logical;

import com.company.problems.Read;

/*
 * Print the first n rows of Pascal's triangle
 */
public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the n value: ");
		int n = Read.sc.nextInt();
		int space = n;
		for(int i=0; i<=n; i++) {
			for(int k=0; k<space; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(combination(i,j) + " ");
			}
			space--;
			System.out.println();
		}

		
	}
	
	static int combination(int n, int r) {
		return fac(n) / (fac(r) * fac(n-r));
	}
	
	static int fac(int n) {
		if(n<1) {
			return 1;
		}
		return n * fac(n-1);
	}
}
