package com.test.mavenproject1.p6;

public class Demo3 {
 public static void main(String args[]) throws Exception { 
	 System.out.println("I am in main company thread t1");
	 CompanyThread t1=new CompanyThread("Mphasis",15);
	 CompanyThread t2=new CompanyThread("TCS",10);
	 CompanyThread t3=new CompanyThread("Accenture",25);
	 t1.start();
	 t2.start();
	 t3.start();
	 t1.join();
	 t2.join();
	 t3.join();
	 System.out.println("Program Over");
 }
}
 // 4 thread are running as main thread is also running