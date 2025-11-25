package com.test.mavenproject1.p5;
// prg to convert lowercase to uppercase if pointer encounters the alphabet a
import java.io.File;
import java.io.RandomAccessFile;

import com.test.mavenproject1.p1.Read;

public class Demo2 {

	public static void main(String[] args) {
		try {
		String fname;
		System.out.println("Enter the file with extension:");
		 fname =Read.sc.nextLine();
   	  //File is an API
   	  File f1 =new File(fname);
   	  RandomAccessFile rm =new RandomAccessFile(f1,"rw");
   	  long fp=0L;
   	  int ch;
   	  while((ch=rm.read())!=-1) {   // -1 indicates End of the file
   		  if(ch==97) {
   			  rm.seek(fp);
   			  rm.write(65);
   		  }
   		  fp++;
   	  }
   		  rm.close();
           System.out.println("File processing is done");
	}
    catch(Exception e) {
    	
    }

	}
}
