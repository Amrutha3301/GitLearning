package com.test.mavenproject1.p6;

public class Player extends Thread {
	Game ob;
	public Player(Game ob)  {
		this.ob=ob;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			ob.f1();
			
		}
	}
	

}
