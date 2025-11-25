package com.test.mavenproject1.p4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.test.mavenproject1.p3.EmployeeDto;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeDto> ob=new ArrayList();
		ob.add(new EmployeeDto(1,"Aria"));
		ob.add(new EmployeeDto(2,"Nisarga"));
		ob.add(new EmployeeDto(3,"Neha"));
		Display ob1 =new Display();
		ob1.f1(ob);

	}

}
// wildcard - interface display can be created for any data type;
class Display{
	public void f1(List<? extends Object> ob) {
		ob.forEach(System.out :: println);
	}
}

interface Display1{
	public void f2(List<? extends Object> ob);
	
}
