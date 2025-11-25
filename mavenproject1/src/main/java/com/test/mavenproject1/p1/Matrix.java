package com.test.mavenproject1.p1;

public class Matrix {
	
	int rows;
	int cols;
	int[][] mat;
	
public Matrix() {
	rows=3;
	cols=3;
	mat=new int[rows][cols];
	int value=1;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			mat[i][j]=value++;
		}
		
	}
		
}
void display() {
	System.out.println(rows+"x"+cols);
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(mat[i][j]+"");
		}
		System.out.println();
	
}
}


	public static void main(String[] args) {
		
Matrix m=new Matrix();
m.display();
	}

}
