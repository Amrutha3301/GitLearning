package com.test.mavenproject1.p6;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.test.mavenproject1.p1.Read;

public class Demo2 {

	public static void main(String[] args) {
		try {
		Date dt= new Date();
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println(sdf.format(dt));
		System.out.println("Enter Date:");
			dt=sdf.parse(Read.sc.nextLine());
			System.out.println(sdf.format(dt));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
