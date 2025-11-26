package com.test.mavenproject1.p6;

import com.test.mavenproject1.p1.Read;

public class StackDemo {

	public static void main(String[] args) {
		
		 try { 
			 StackT ob=new StackT();
			 int ch=0;
			 do {
				 System.out.println("Enter 0 to exist, 1 for insert, 2 for delete");
				 ch=Read.sc.nextInt();
				 switch(ch) {
				 case 0: System.out.println("Program ended");
				         break;
				 case 1: ob.add();
				         break;
				 case 2: ob.remove();
				         break;
				 default : System.out.println("Invalid choice");
				 
				 }
			 }while(ch!=0);
			
		} catch (Exception e) {
			
		}
			}


}
