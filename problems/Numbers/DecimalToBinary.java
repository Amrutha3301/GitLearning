package com.company.problems.Numbers;

import com.company.problems.Read;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int n = Read.sc.nextInt();
		
		long bin = toBinary(n);
		System.out.println(bin);
		int deci = toDecimal(bin);
		System.out.println(deci);

	}

	private static int toDecimal(long bin) {
		int dec = 0;
		int power = 0;
		while(bin>0) {
			dec += bin%10 * Math.pow(2, power++);
			
			bin /= 10;
		}
		return dec;
		
	}

	private static long toBinary(int n) {
		
		StringBuilder bin = new StringBuilder();
		while(n>0) {
			bin.append((n % 2 == 0)?"0":"1");
			n /= 2;
		}
		bin.reverse();
		return Long.parseLong(bin.toString());
		
	}
	
	
	
	
}
