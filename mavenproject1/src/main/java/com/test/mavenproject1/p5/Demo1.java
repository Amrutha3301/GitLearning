package com.test.mavenproject1.p5;

import java.io.File;

import com.test.mavenproject1.p1.Read;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  String fname;
    	  System.out.println("Enter the file with extension:");
    	  fname =Read.sc.nextLine();
    	  //File is an API
    	  File f1 =new File(fname);
    	  if(f1.exists()) {
    	  if(f1.isDirectory()) {
    		  System.out.println("Given is a directory");
    		  String arr[]=f1.list();
    		  for(String x :arr) {
    			  System.out.println(x);
    		  }
    		  
    	  }
    	  else {
    		  System.out.println("Given is a file");
    	  }
      }
    	  else {
    		  System.out.println("File doesnt exist");
    	  }
      } catch (Exception e) {
    	  
	}

}
}
