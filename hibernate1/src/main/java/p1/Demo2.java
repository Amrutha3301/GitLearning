package p1;

import java.util.List;

import java.util.List;

import dao.EmployeeDao;
import entity.EmployeeEntity;

public class Demo2 {
	
	public static void main(String[] args) {
		try {
			EmployeeDao dao=new EmployeeDao();
			//List<EmployeeEntity> l1=dao.getEmployeesNativeQuery();
		//	List<EmployeeEntity> l1=dao.getEmployeeById("S02");
			List<EmployeeEntity> l1=dao.getEmployeeByFname("Neha");
	   		l1.forEach(System.out:: println);
			
		
		}
		catch (Exception e) {
		
		}

}
}