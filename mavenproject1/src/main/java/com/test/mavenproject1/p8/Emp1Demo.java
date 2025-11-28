package com.test.mavenproject1.p8;

import com.test.mavenproject1.p8.Employee1;

public class Emp1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 ob=new Employee1(1015,"Ria","Karkala","Indore",2011);
		System.out.println(ob);
		//designer build pattern
		Employee1 ob1=new Employee1.Builder()
				      .empId(1010)
		              .empName("Amrutha")
		              .city("Udupi").managerId(2015)
		              .designation("HR").build();
		              
		              System.out.println(ob1);

	}

}
