 package com.test.mavenproject1.p8;

public class Employee1 {
	private int empId;
	private String empName;
	private String city;
	private String designation;
	private int managerId;
	public Employee1(Builder ob) {
		this.empId=ob.empId;
		this.empName=ob.empName;
		this.city=ob.city;
		this.designation=ob.designation;
		this.managerId=ob.managerId;
	}
	public Employee1(int empId, String empName, String city, String designation, int managerId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.designation = designation;
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", city=" + city + ", designation="
				+ designation + ", managerId=" + managerId + "]";
	}
     public static class Builder{
    	 private  int empId;
    	 private  String empName;
    	 private String city;
    	 private  String designation;
    	 private int managerId;
    	 
    	 
    	 public Builder empId(int empId) {
        	 this.empId=empId;
        	 return this;
        	 
         }
         public Builder empName(String empName) {
        	this.empName=empName;
        	return this;
        	
        	 
         }
         public Builder city(String city) {
        	 this.city=city;
        	 return this;
         }
         public Builder designation(String designation) {
        	 this.designation=designation;
        	 return this;
         }
       
         public Builder managerId(int managerId) {
        	 this.managerId=managerId;
        	 return this;
         }
         public  Employee1 build() {
         	// return new Employee(empId,empNmae,city,designation,managerId);
         	 return new Employee1(this);
          }
     }
     
    
 
   
}
