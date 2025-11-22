package com.company.problems.Strings;


import com.company.problems.Read;

/*
 * check if two string are anagrams of each other
 */
public class AnagramChecker {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String 'A'");
		String a = Read.sc.nextLine();
		
		System.out.println("Enter String 'A'");
		String b = Read.sc.nextLine();
		
		if(checkAnagram(a, b)) {
			System.out.println("They are anagrams");
		}
		else {
			System.out.println("They are not anagrams");
		}
		
	}
	
	public static boolean checkAnagram(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		int [] letters = new int[26];
		
		for(char c : a.toCharArray()) {
			int index = Character.toUpperCase(c) - 65 ;
			letters[index]++;
		}
		
		for(char c : b.toCharArray()) {
			int index = Character.toUpperCase(c) - 65 ;
			letters[index]--;
		}
		
		for(int i: letters) {
			if(i != 0) {
				return false;
			}
		}
		
		return true;
		
	}

}
