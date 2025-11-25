package com.test.mavenproject1.p1;

public class Addition {

	int num1,num2;
	static int num3;
	public Addition() {
		System.out.println("I am in Zero argument contructor");
	}
	
	public void readData() {
		System.out.println("Enter two number:");
		num1=Read.sc.nextInt();
		num2=Read.sc.nextInt();
	}
	public void setData(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public void compute() {
		this.num3=this.num1+this.num2;
	}
	public void display() {
		System.out.println("Sum is"+this.num3);
	}
	public void finalize() {
		System.out.println("I am in destructor");
	}
	
	{
		System.out.println("Welcome to the anonymous block");
	}
	static {
		System.out.println("welcome to static block");
	}
	
	}
	


