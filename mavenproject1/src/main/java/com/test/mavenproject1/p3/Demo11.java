package com.test.mavenproject1.p3;

import java.util.LinkedHashMap;
import java.util.Map;

import com.test.mavenproject1.p1.Read;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String sentence;
       Map<String, Integer> m =new LinkedHashMap<>();
       System.out.println("Enter the sentence");
       sentence = Read.sc.nextLine();
       
      // String arr[] = sentence.split(" ");
       
       // using regular exp
       String arr[] = sentence.split("[,. ]");
       for(String x:arr) {
    	   int y =m.getOrDefault(x,0);
    	   y++;
    	   m.put(x, y);
          }
       System.out.println(m);
	}

}
