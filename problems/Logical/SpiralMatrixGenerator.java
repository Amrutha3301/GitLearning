package com.company.problems.Logical;

import com.company.problems.Read;
/*
 * Given an integer n, generate and n x n matrix with numbers from 1 to n^2 in a spiral order (clockwise);
 * example n = 3
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * 
 * n = 4
 * 1  2  3  4
 * 12 13 14 5
 * 11 16 15 6
 * 10 9  8  7
 *      
 */      
public class SpiralMatrixGenerator {
	
	public static void main(String[] args) {
		System.out.println("Enter the value of N");
		int n = Read.sc.nextInt();
		generate(n);
	}
	
	public static void generate (int n) {
		
	}
}
