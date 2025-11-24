package com.company.problems.Logical;


import com.company.problems.Arrays.ReadArray;

/*
 * An element is leader if it is greater than all elements to its right
 * [3,2,1,3,4,2,5,3,3,1,6,4,5,3,2]
 */
public class LeaderElement {
	
	public static void main(String[] args) {
		int array[] = ReadArray.read();
		int leaders[] = new int[array.length];
		leaders[0] = array[array.length-1];
		int maxRight = leaders[0];
		int j = 1;
		for(int i=array.length-1; i>0; i--) {
			if(array[i-1] <  array[i] && array[i]> maxRight) {
				maxRight = array[i];
				leaders[j++] = array[i];
			}
		}
		ReadArray.print(leaders, j);
		
	}
}
