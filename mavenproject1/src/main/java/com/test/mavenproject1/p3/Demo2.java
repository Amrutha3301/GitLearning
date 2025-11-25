package com.test.mavenproject1.p3;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Temp1<Integer> ob=new Temp1();
    ob.setData(100, 200);
    ob.display();
    Temp1<String> st =new Temp1();
    st.setData("Amrutha", "Mendon");
    st.display();
    
    Temp2<Integer,String> ob1 =new Temp2();
    ob1.setData(123, "Alien");
    ob1.display();
	}

}
class Temp1<T>{  
	T a,b;
	public void setData(T x,T y) {
	a=x;
	b=y;
	}
	public void display() {
		System.out.println(a+" "+b);
	}
	
}
	class Temp2<T1, T2>{
		T1 a;
		T2 b;
		public void setData(T1 x,T2 y) {
		a=x;
		b=y;
		}
	public void display() {
		System.out.println(a+" "+b);
	}
	
}

