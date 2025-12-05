package p1;

import java.util.List;

import dao.EmployeeDao;
import entity.EmployeeSalary;

public class Demo4 {
	public static void main(String[] args) {
		try {
		EmployeeDao dao=new EmployeeDao();
		List<EmployeeSalary> es=dao.getEmployeeSalary();
		es.forEach((x)->{System.out.println(x.getEid()+" "+x.getOb());});
		
}catch (Exception e) {
	System.out.println(e.getMessage());
}
	}
}
	
