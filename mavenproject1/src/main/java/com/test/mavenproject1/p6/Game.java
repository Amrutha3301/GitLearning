package com.test.mavenproject1.p6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Game {
	
//	List<String> l1=new Vector<String>(Arrays.asList(new String[] {"Jack","Queen","Ace","Spade","Heart","Club","Joker"})) ;
//	
//	List<String> p1;
//	List<String> p2;
//	
//	public Game() {
//		Collections.shuffle(11);
//		for(int i=0;i<l1.size();i++) {
//			if(i%2==0) {
//				p1.add(l1.get(i));
//			}
//			else {
//				p2.add(l1.get(i));
//			}
//		}
//	}
	
	public synchronized void f1() {
		try{
			notify();
       
		System.out.print("Tic -" );
		wait();
		
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	public synchronized void f2(int x) {
		try{
			notify();
		
		System.out.println("Toc" );
		if(x!=9) {
		wait();
		}
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	public void finalize() {
		try {
			notifyAll();
		} catch (Exception e) {
		
		}
	}
}
