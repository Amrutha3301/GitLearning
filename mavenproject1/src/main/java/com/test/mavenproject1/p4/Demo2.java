package com.test.mavenproject1.p4;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentDto> st = new ArrayList<>();
		st.add(new StudentDto(101,"Akshay"));
		st.add(new StudentDto(102,"Vishal"));
		st.add(new StudentDto(103,"Prithi"));
		st.add(new StudentDto(104,"shane"));
		st.add(new StudentDto(105,"Ryan"));
		System.out.println(st);

	}

}
