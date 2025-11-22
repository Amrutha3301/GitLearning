package com.company.problems.controlStructures;


import com.company.problems.Read;


/**
 * Print number from 1 to n, but replace multiples of 3 with Fizz, 5 with Buzz and both with FizzBuzz
 * @param args
 */
public class FizzBuzz {
	
public static void main(String[] args) {
	
	System.out.println("Enter the Value of 'n'");
	int n = Read.sc.nextInt();

	for(int i=1 ; i<=n; i++) {
		String res = "";
		if(i % 3 == 0) {
			res += "Fizz";
		}
		if(i % 5 == 0) {
			res += "Buzz";
		}
		System.out.println(res.equals("")? i:res);
	}
}
}
