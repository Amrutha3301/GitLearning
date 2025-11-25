package com.company.problems.Logical;

import com.company.problems.Read;

/*
 * transpose a given 2d matrix
 */
public class MatrixTranspose {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of Rows: ");
		int row = Read.sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int col = Read.sc.nextInt();
		
		int mat[][] = new int[row][col];
		
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(i +", " + j +":");
				mat[i][j]= Read.sc.nextInt();
				System.out.println();
			}
		}
		
		System.out.println("Matrix:");
		
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Matrix is: ");
		for(int i = 0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(mat[j][i] + " ");
			}
			System.out.println();
		}
	}

}
