package com.test.mavenproject1.p3;

public class EmployeeDto implements Comparable<EmployeeDto> {
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public EmployeeDto() {
		super();
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public EmployeeDto(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "EmployeeDto [empid=" + empid + ", empname=" + empname + "]";
	}
	@Override
	public int compareTo(EmployeeDto o) {
	// TODO Auto-generated method stub
		return this.getEmpname().compareTo(o.empname);
	}

}
