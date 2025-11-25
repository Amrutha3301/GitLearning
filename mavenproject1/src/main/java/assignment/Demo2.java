package assignment;

import com.test.mavenproject1.p1.Read;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the day of the week");
		String s=Read.sc.next();
		try {
			DayOfTheWeek ob=DayOfTheWeek.valueOf(s);
			ob.display();
		}catch(Exception e) {
			System.out.println(e.getMessage());;
		}

	}

}
