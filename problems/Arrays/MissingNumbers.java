package com.company.problems.Arrays;


/*
 * Given an array of n-1 numbers from 1 to n, find the missing number
 */
public class MissingNumbers {
	
	public static void main(String[] args) {
		
		int array[] = ReadArray.read();
		
		System.out.println(findMissing(array));
	}
	
	public static int findMissing(int a[]) {
		int sum = 0;
		for(int i: a) {
			sum += i;
		}
		return fullSum(a.length+1) - sum;
	}
	
	public static int fullSum(int n) {
		return (n * (n+1))/2;
	}
}
