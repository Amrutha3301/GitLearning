package com.test.mavenproject1.p6;

public class CompanyThread extends Thread {
	String n1;
	int n;
	//zero arg constructor
	public CompanyThread() {
		n1="ABMorgan";
		n=10;
	}
	//2 arg constructor
	 public CompanyThread(String n1,int n) {
		 this.n1=n1;
		 this.n=n;
	}
	 @Override
	 public void run() {
		 for(int i=0;i<n;i++) {
			 System.out.println(n1+" "+i);
			 try {
				sleep(1000);
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		 }
	 }

}
