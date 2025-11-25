package com.test.mavenproject1.p5;

import java.sql.Connection;

public class DemoConnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con =DbConnect.getConnection();
			System.out.println("Connection Successfull");
		}catch(Exception e) {
			System.out.println("Connection failed:"+e.getMessage());
		}

	}

}
