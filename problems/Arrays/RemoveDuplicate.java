package com.company.problems.Arrays;

import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;

/*
 * remove duplicate elements from an integer array
 */
public class RemoveDuplicate {
	public static void main(String[] args) {
		
		
		
		int[] array = ReadArray.read();
		
//		Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
//		int[] res = set.stream().mapToInt(Integer::intValue).toArray();
		
		sort(array);
		
		int j = 0;
		for(int i = 1 ; i < array.length; i++) {
			if(array[i] != array[j]) {
				array[++j] = array[i];
			}
		}
		
		array = Arrays.copyOf(array, j + 1);
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void sort(int array[]) {
		
		for(int i=0; i<array.length; i++) {
			for(int j=i; j<array.length; j++) {
				
				if(array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
	}
	
	
}
