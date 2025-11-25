package com.test.mavenproject1.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<EmployeeDto> emp=new HashSet();
		emp.add(new EmployeeDto(1,"Aria"));
		emp.add(new EmployeeDto(2,"Nisarga"));
		emp.add(new EmployeeDto(3,"Neha"));
		emp.add(new EmployeeDto(4,"Trisha"));
		emp.add(new EmployeeDto(5,"Jyothsna"));
		
		EmployeeDto dto = new EmployeeDto();
//		dto.setEmpid(1);
//		dto.setEmpname("Ria");
//		emp.add(dto);
		System.out.println(emp);
		
		emp.forEach(System.out :: print);
		//Stream api
		
		System.out.println("Even Number id's");
		emp.stream().filter((ob)->(ob.getEmpid()%2==0)).forEach(System.out::println);
		System.out.println("Emp Names");
		//forEach is a consumer
		emp.stream().map((ob)->(ob.getEmpname())).forEach(System.out::println);
		System.out.println("Emp Names that starts with A");
		emp.stream().filter((ob)->(ob.getEmpname().charAt(0)=='A')).map((ob)->(ob.getEmpname())).forEach(System.out::println);
		System.out.println("Emp Names displayed using regular expresion");
		emp.stream().filter((ob)->(ob.getEmpname().matches("[Aa].*"))).map((ob)->(ob.getEmpname())).forEach(System.out::println);
		// count is a supplier
		System.out.println("Count of emp name that stats with letter A");
		int c=(int)emp.stream().filter((ob)->(ob.getEmpname().matches("[Aa].*"))).map((ob)->(ob.getEmpname())).count();
		System.out.println("count ="+c);
		
		
		// create a separate arraylist of employees whose name is between A to M;
		// collect is supplier
		Set<EmployeeDto> emp1=(Set<EmployeeDto>) emp.stream().filter((ob)->(ob.getEmpname().matches("[A-Ma-m].*"))).collect(Collectors.toList());
		System.out.println(emp1);
		//using comparator
		//Collections.sort(emp,(x,y)->(x.getEmpname().compareTo(y.getEmpname())));
		
		// using comparable
		// we cannot apply sort as it is unordered 
		//Collections.sort(emp);
		
		
		Iterator it= emp.iterator();
		 while(it.hasNext()) {
			   System.out.println(it.next()+"\t");

	}
		// Collections.sort(emp, Comparator.comparing(EmployeeDto:: getEmpname));

         System.out.println(emp);
         
	}
}



