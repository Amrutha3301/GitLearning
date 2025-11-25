package com.test.mavenproject1.p5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo4 {

	public static void main(String[] args) {
	// deserialization
		try {
			FileInputStream f1 = new FileInputStream("x.rm");
			AddTest ob=(AddTest) new ObjectInputStream(f1).readObject();
			ob.display();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
