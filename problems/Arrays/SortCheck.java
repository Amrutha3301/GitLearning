package com.company.problems.Arrays;


/*
 * determine if an array is sorted in ascending, descending or unsorted.
 */
public class SortCheck {
	public static void main(String[] args) {
		
		int [] array = ReadArray.read();
		if(asc(array)) {
			System.out.println("Ascending");
		}
		else if(desc(array)) {
			System.out.println("descending");
		}
		else {
			System.out.println("Unsorted");
		}
		
	}
	public static boolean asc(int[] a) {
		if(a.length < 2) {
			return true;
		}
		for(int i=1; i<a.length; i++) {
			if(a[i]<a[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean desc(int[] a) {
		if(a.length < 2) {
			return true;
		}
		for(int i=1; i<a.length; i++) {
			if(a[i]>a[i-1]) {
				return false;
			}
		}
		return true;
	}
}
