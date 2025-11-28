package com.test.mavenproject1.p7;

import java.util.Arrays;

import com.test.mavenproject1.p1.Read;

public class BinarySearch {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {20,35,11,55,23,144,89};
		Arrays.sort(arr);
		int key;
		System.out.println("Enter the key");
		key=Read.sc.nextInt(); 
		int x=binarySearch(key,arr,0,arr.length-1);
		if(x==-1) {
			System.out.println("Key is not present"+x);
		}else {
			System.out.println("Key is at index" +x);
		}

	}
	public static int binarySearch(int key,Integer[] arr,int low,int high) {
		if(low>high) return -1;
			int mid=low+(high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				return binarySearch(key,arr,mid+1,high);
					
				}else {
					return binarySearch(key,arr,low,mid-1);
			}
		
		
	}

}
