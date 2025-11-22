package com.company.problems.Strings;

import com.company.problems.Read;

/*
 * check if a sentence contains every letter to the alphabet at least once
 * 
 * @Example The quick brown fox jumps over the lazy dog
 */
public class Panagram {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence");
		String s = Read.sc.nextLine();
		
		if(checkPanagram(s)) {
			System.out.println("Its a Panagram");
		}
		else {
			System.out.println("Its not a Panagram");
		}
		
		
	}
	
	public static boolean checkPanagram(String a) {
		if(a.length() <= 26) {
			return false;
		}
		int [] letters = new int[26];
		
		for(char c : a.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				int index = Character.toUpperCase(c) - 65 ;
				letters[index]++;
			}
			
		}
		
		
		for(int i: letters) {
			if(i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
}
