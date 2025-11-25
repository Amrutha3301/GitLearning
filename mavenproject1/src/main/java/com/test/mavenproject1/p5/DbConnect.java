package com.test.mavenproject1.p5;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	public static Connection co=null;
	public static  Connection getConnection() throws Exception{
		//singleton
		if(co==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisla","root","root@39");
		}
		return co;
		
	}

}
