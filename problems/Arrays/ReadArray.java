package com.company.problems.Arrays;

import java.util.Arrays;

import com.company.problems.Read;

public class ReadArray {

	public static int[] read() {
		System.out.println("Enter the array ");
		String input = Read.sc.nextLine();
		return Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	
}
