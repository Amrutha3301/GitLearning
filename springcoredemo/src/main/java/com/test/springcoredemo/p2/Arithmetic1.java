package com.test.springcoredemo.p2;

public class Arithmetic1 implements Arithmetic{

	@Override
	public Integer add(int a, int b) {
		return a+b;
	}

	@Override
	public Integer subtract(int a, int b) {
		return a-b;
	}

	@Override
	public Integer multiply(int a, int b) {
		return a*b;
	}

	@Override
	public Integer divide(int a, int b) {		
		return a/b;
	}

}
