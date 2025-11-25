package com.test.mavenproject1.p3;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//interface N1 <T, T1>{
//	public T1 f1(T x);
//}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<LocalDateTime> datesupplier =()->LocalDateTime.now();
		System.out.println("Current DateTime:"+datesupplier.get());

	}

}

 