package com.test.mavenproject1.p4;

import com.test.mavenproject1.p1.Read;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password;
		System.out.println("Enter a password:");
        String Strongpassword="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        password=Read.sc.nextLine();
        if(password.matches(Strongpassword)) {
        	System.out.println("Strong password");
        }
        else {
        	System.out.println("invalid password");
        }
        
       
	}

}
