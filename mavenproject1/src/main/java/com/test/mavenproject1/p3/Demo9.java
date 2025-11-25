package com.test.mavenproject1.p3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> de =new ArrayDeque<Integer>();
		de.add(100);
		de.add(350);
		de.add(400);
		System.out.println(de);
		System.out.println(de.remove());
        System.out.println(de.pop());
	}

}
