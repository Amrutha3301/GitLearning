package com.test.mavenproject1.p6;

import java.time.LocalDate;

public class Festival {
   
	LocalDate lo;

	public Festival() {
		lo =LocalDate.now();
		
	}
   public void setData(String dt) throws Exception {
	   this.lo=LocalDate.of(Integer.parseInt(dt.substring(0,4)),Integer.parseInt(dt.substring(5,7)) ,Integer.parseInt(dt.substring(8,10)));
	   
   }
	public void display() {
		System.out.println(lo);
	}
	
	public void ramCal() {
		System.out.println("Ramzan Calendar");
		// type cast to match the lhs
		int days =(int) (12*29.5);
		for(int i=0;i<12;i++) {
		lo=lo.plusDays(days);
		display();
		
	}
		
	}
	public void diwcal() {
		System.out.println("Diwali calendar");
		int flag=3;
		int days=(int)(12*29.5);
		for(int i=0;i<12;i++) {
			 if(flag%3==0) {
				lo= lo.plusDays(29);
				 flag=0;
			 }
			 lo=lo.plusDays(days);
			 display();
			 flag++;
			 
		}
	}
}


