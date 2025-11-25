package com.company.problems.Logical;

import com.company.problems.Arrays.ReadArray;

/*
 * Given a row from a sudoku puzzle, check if it contains all digits from 1 to 9 without repetition 
 */
public class SudokuRow {
	public static void main(String[] args) {
		int sudoku[] = ReadArray.read();
		if(check(sudoku)) {
			System.out.println("Valid.");
			
		}
		else {
			System.out.println("Invalid.");
		}
	}
	
	public static boolean check(int sudoku[]) {
		
		if(sudoku.length != 9) {
			return false;
		}
		
		int check[] = new int[9];
		for(int i: sudoku) {
			check[i-1]++;
		}
		for(int i: check) {
			if(i!=1) {
				return false;
			}
		}
		return true;
	}
}
