package com.test.mavenproject1.p6;

public class SelectionSort {
	
public static void Selectionsort(int a[]) {
	int n=a.length;
	for(int i=0;i<n-1;i++) {
	int min=i;
	for(int j=i+1;j<n;j++) {
	if(a[min]>a[j]) {
		min=j;
	}
	}
	int temp=a[i];
	a[i]=a[min];
	a[min]=temp;
	
}
		
	}
 public static void  printArray(int a[]) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");

	System.out.println();}
}
}
