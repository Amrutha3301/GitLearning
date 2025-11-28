package com.test.mavenproject1.p6;

import com.test.mavenproject1.p1.Read;

public class SelectionDemo {

	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
	
		System.out.println("Enter the array size:");
		int n=Read.sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elemnets:");
		for(int i=0;i<a.length;i++) {
			a[i]=Read.sc.nextInt();
			
		}ob.Selectionsort(a);
		ob.printArray(a);
}
}
