package com.test.mavenproject1.p23;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Begin");
		  int a=10,b=0;
		  int c;
		  try {
			  c=new Demo2().cal(a,b);
			  System.out.println(c);
			  return;
		  }
		  catch(ArithmeticException e) {
			  System.out.println(e.getMessage());
		  }
		  finally {
			  System.out.println("End");
		  }

		  
	}
	public int cal(int a, int b) throws ArithmeticException{
		  return a/b;
	  }

}
