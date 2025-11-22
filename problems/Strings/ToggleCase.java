package com.company.problems.Strings;

import com.company.problems.Read;


/*
 * convert uppercase letters to lowercase and vice versa
 */
public class ToggleCase {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s = Read.sc.nextLine();		
		
		s = toggle(s);
		System.out.println(s);
	}
	
	public static String toggle(String s) {
		String res = "";
		
		for(char c : s.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				if(Character.isUpperCase(c)) {
					res += Character.toLowerCase(c);
				}
				else {
					res += Character.toUpperCase(c);
				}
			}
			else {
				res += c;
			}
		}
		
		return res;
		
	}
	
}
