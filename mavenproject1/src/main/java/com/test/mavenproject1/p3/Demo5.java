package com.test.mavenproject1.p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
   List<Integer> l1 =new ArrayList<>();
   l1.add(100);
   l1.add(203);
   l1.add(52);
   l1.add(457);
   l1.add(34);
   
   System.out.println(l1);
   for(int i=0;i<l1.size();i++) {
   System.out.print(l1.get(i)+" ");

	}
   System.out.println(".. using index");
   
   for(Integer x:l1) {
	   System.out.print(x+"");
   }
   System.out.println("... using for each");
   
   l1.forEach((x)->{System.out.print(x+"");});
   System.out.println("..using foreach consumer");
   
   l1.forEach(System.out :: print);
   System.out.println("... using for each consumer and method reference");
   
   l1.forEach(Demo5 :: psv);
   System.out.println("... using for each consumer and static method");
   
   Demo5 obj =new Demo5();
   l1.forEach(obj :: p1);
   System.out.println("... using for each consumer and instance method");
   
   Iterator<Integer> it =l1.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next()+"\t");
   
	}
    System.out.println("\n"+l1.get(4));
    
    l1.remove(4);
    System.out.println(l1);
    
    l1.remove(new Integer(200));
    System.out.println(l1);
    
    List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {51,67,98,101,467}));
    
//    l1.addAll(l2);
//    System.out.println(l1);
//    
//    l1.retainAll(l2);
//    System.out.println(l1);
//    
//    l1.removeAll(l2);
//    System.out.println(l1);
//    
    l1.clear();
    System.out.println(l1);
    
    Collections.sort(l1);
    Collections.shuffle(l2);
	}
	
	public static void psv(Integer x) {
		System.err.println(x+"-->"+(x*x)+"...");
	}
	public void p1(Integer x) {
		System.err.println(x+"-->"+(Math.sqrt(x))+"...");
	}
}
