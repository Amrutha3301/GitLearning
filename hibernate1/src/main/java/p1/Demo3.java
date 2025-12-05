package p1;

import dao.EmployeeDao;
import entity.SalaryEntity;

public class Demo3 {
	public static void main(String[] args) {
		try {
		EmployeeDao dao=new EmployeeDao();
		SalaryEntity se=new SalaryEntity();
		se.setId("61");
		se.setEid("S02");
		se.setSalary(45000L);
		se.setMonth("May");
		dao.addSalary(se);
		se=new SalaryEntity();
		se.setId("5");
		se.setEid("S02");
		se.setSalary(45000L);
		se.setMonth("April");
		dao.addSalary(se);
		System.out.println("Data added");
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
