package com.company.problems.Arrays;


/*
 * Find the second largest number if an array without sorting
 */
public class SecondLargestElement {

	public static void main(String[] args) {
		
		int[] array = ReadArray.read();
		
		System.out.println(secondLargest(array));
		
	}
	
	public static int secondLargest(int[] array) {
		if(array.length < 2) {
			return array[0];
		}
		
		int x, y;
		x = Math.max(array[0], array[1]);
		y = Math.min(array[0], array[1]);
		
		for(int i = 2; i<array.length; i++) {
			y = Math.max(array[i], y);
			int temp = x;
			x = Math.max(x,  y);
			y = Math.min(temp,  y);
		}
		
		return y;
	}
	
}
