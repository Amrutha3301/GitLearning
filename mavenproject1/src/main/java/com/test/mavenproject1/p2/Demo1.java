package com.test.mavenproject1.p2;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add obj=new Add();
		Arithmetic obj=new Add();
		obj.setData(11,51);
		obj.cal();
		obj.display();
		
		
		obj =new Sub();
		obj.setData(34,67);
		obj.cal();
		obj.display();
		
		

	}

}
