package com.company.problems.Strings;

import com.company.problems.Read;

/*
 * Count the number of vowels and consonants in a string;
 */
public class CountVowelsConsonants {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the String");
		String s = Read.sc.nextLine();		
		
		count(s);
	}
	
	public static void count(String s) {
		
		int vowel = 0;
		int consonants = 0;
		
		for(char c : s.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				if(isVowel(Character.toLowerCase(c))) {
					vowel++;
				}
				else {
					consonants++;
				}
			}
		}
		
		System.out.println("The number of Vowels is " + vowel);
		System.out.println("The number of Consosnants is " + consonants );
		
	}
	
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
}
