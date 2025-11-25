package com.test.mavenproject1.p5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo3 {

	public static void main(String[] args) {
		// serialization
		try {
			FileOutputStream fo = new FileOutputStream("x.rm");
			AddTest ob =new AddTest();
			ob.setdata(12,11);
			ob.cal();
			new ObjectOutputStream(fo).writeObject(ob);
			fo.close();
			System.out.println("File is processed");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
