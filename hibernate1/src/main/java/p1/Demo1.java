package p1;

import java.util.Date;

import dao.EmployeeDao;
import entity.EmployeeEntity;


public class Demo1 {
	public static void main(String[] args) {
		try {
			EmployeeDao dao=new EmployeeDao();
			EmployeeEntity entity =new EmployeeEntity();
			entity.setEid("S01");
			entity.setFname("Aria");
			entity.setLname("Mendon");
			entity.setDob(new Date());
			dao.addEmployee(entity);
			entity.setEid("S02");
			entity.setFname("Neha");
			entity.setLname("Mendon");
			entity.setDob(new Date());
			dao.addEmployee(entity);
			System.out.println("Employee added successfully");
//			dao.deleteEmployee(entity);
//			System.out.println("Employee deleted");
			dao.updateEmployee(entity);
			System.out.println("Employee updated successfully");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
