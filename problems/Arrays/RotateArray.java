package com.company.problems.Arrays;

import com.company.problems.Read;

/*
 * rotate an array to the right by k positions
 */
public class RotateArray {

	public static void main(String[] args) {
		
		int[] array = ReadArray.read();
		
		System.out.println("Enter the value of 'K'");
		int k = Read.sc.nextInt();
		k = k % array.length;
		
		int res[] = new int[array.length];
		int t = 0;
		for(int i = array.length - k; i<array.length; i++)
		{
			res[t++] = array[i];
		}
		for(int i=0 ; i < array.length - k; i++) {
			res[t++] = array[i];
		}
		
		array = res;
		
		for(int i: array) {
			System.out.print(i + " ");
		}
	}
}
