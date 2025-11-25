package com.company.problems.Logical;

import java.util.HashMap;
import com.company.problems.Read;

/*
 * use loops and maps to count word frequency
 */
public class WordFrequency {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the sentence: ");
		String s = Read.sc.nextLine();
		
		wordCount(s);
		
		
	}
	
	public static void wordCount(String s){
		
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		
		for(String word: s.split(" ")) {
			frequency.put(word, frequency.getOrDefault(word, 0)+1);
		}
		
		for(HashMap.Entry<String, Integer> entry: frequency.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
