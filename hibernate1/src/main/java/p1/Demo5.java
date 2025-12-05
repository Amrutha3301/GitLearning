package p1;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;
import entity.EmployeeSalary;
import entity.SalaryEntity;

public class Demo5 {

	public static void main(String[] args) {
		try {
			EmployeeDao dao=new EmployeeDao();
			EmployeeSalary es1=new EmployeeSalary();
			es1.setEid("A001");
			es1.setFname("Nisarga");
			List<SalaryEntity> ob=new ArrayList<SalaryEntity>();
			SalaryEntity x=new SalaryEntity();
			x.setEid("A001");
			x.setId("1001");
			x.setSalary(90000L);
			x.setMonth("June");
			ob.add(x);
			x=new SalaryEntity();
			x.setEid("A001");
			x.setId("1002");
			x.setSalary(95000L);
			x.setMonth("July");
			ob.add(x);
			es1.setOb(ob);
			dao.addEmployeeSalary(es1);
			System.out.println("Data added");
			
		} catch (Exception e) {
			
		}

	}

}
