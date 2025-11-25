package com.test.mavenproject1.p5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.sql.Date;


import com.test.mavenproject1.p1.Read;

public class Demo5 {

	public static void main(String[] args) {
	try {
		
		StudentDao s1=new StudentDao();
		int ch=0;
		do {
			System.out.println("Enter 0 for exit & 1 for display & 2 for display info based on the given id ");
			ch=Read.sc.nextInt();
			switch(ch) {
			case 0: System.out.println("Thank you for using the program");
			        s1=null;
			        break;
			
			case 1: List<StudentDto> l1 = s1.getAllStudent();
			        l1.forEach(System.out :: println);
			        break;
			        
			case 2: StudentDto ob=new StudentDto();
			       System.out.println("Enter sroll to display a info of a particular student");
			       ob.setSroll(Read.sc.nextInt());
			       System.out.println(s1.getbyid(ob));
			       break;
			       
			case 3:  StudentDto ob1=new StudentDto();
			         System.out.println("Enter student id:");
			         ob1.setSroll(Read.sc.nextInt());
			         System.out.println("Enter student firstname:");
			         ob1.setFirstname(Read.sc.next());
			         System.out.println("Enter student lastname:");
			         ob1.setLname(Read.sc.next());
			         System.out.println("Enter student DOB:");
			         
			         
//			         ob1.setDob(new Date().setDate(Read.sc.nextInt(),Read.sc.nextInt() , Read.sc.nextInt()));
//			         Calendar cl= Calendar.getInstance();
//			         cl.set(Read.sc.nextInt(),Read.sc.nextInt() , Read.sc.nextInt());
//			         ob1.setDob(new SimpleDateFormat().parse(Read.sc.next()));
			         
			         
			         java.util.Date UtilDate =new java.util.Date();
			         ob1.setDob(new java.sql.Date(UtilDate.getTime()));
			         ob1.setDob(Date.valueOf(Read.sc.next()));
			         System.out.println("Enter student gender:");
			         ob1.setGender(Read.sc.next());
			         s1.insert(ob1);
			         System.out.println("Student added succesfully");
			       
			         break;
			    
			case 4: StudentDto ob2=new StudentDto();
	                System.out.println("Enter student id to delete:");
	                 ob2.setSroll(Read.sc.nextInt());
	                 s1.delete(ob2);
	                 System.out.println("Deleted sucessfully");
	                 break;
			         
			         
			         
				
				default: System.out.println("Please enter the correct choice");
			}
		} while (ch!=0);
	} catch (Exception e) {
	  System.out.println(e.getMessage());
	}

	}

}
