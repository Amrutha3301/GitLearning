package com.test.mavenproject1.p22;

public class Reverse {
//	 public int reverse(int a) {
//		 int rev=0;
//		 while(a!=0) {
//			 int n= a%10;
//			 rev=rev*10+n;
//			 a=a/10;
//			
//		 }
//		 return rev;
//	 }
	public int rev(int k) {
		return Integer.parseInt(rev(String.valueOf(k)));
	}

	
	public String rev(String k) {
		return new StringBuilder(k).reverse().toString();
	}
	
	public long rev(long k) {
		return Long.parseLong(rev(String.valueOf(k)));
		
	}
}
