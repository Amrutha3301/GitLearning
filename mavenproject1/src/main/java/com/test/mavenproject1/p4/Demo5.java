package com.test.mavenproject1.p4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo5 {

	public static void main(String[] args) {
		try {
		BufferedReader br =new BufferedReader(new  FileReader("C:\\Users\\amrutha.bangera1\\Desktop\\Java\\mavenproject1\\src\\main\\java\\com\\test\\mavenproject1\\p4\\data.txt"));
	    BufferedWriter bw =new BufferedWriter(new  FileWriter("C:\\Users\\amrutha.bangera1\\Desktop\\Java\\mavenproject1\\src\\main\\java\\com\\test\\mavenproject1\\p4\\data1.txt"));
       String s1;
       while((s1=br.readLine())!=null) {
	    	int sum=0;
	    	for(String x:s1.split(",")) {
	    		sum=sum +Integer.parseInt(x);
	    	}
	    	bw.write(s1+"="+sum);
	    	bw.newLine();
	    }
	    bw.close();
	    br.close();
	    System.out.println("Your file is closed");
	}catch(Exception e) {
		
		e.printStackTrace();
	}

}
}
