package com.test.mavenproject1.p6;
public class Player1 extends Thread {
	Game ob;
	public Player1(Game ob)  {
		this.ob=ob;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			if(i==0)  {
				 try {
						sleep(1000);
					} catch (Exception e) {
					System.out.println(e.getMessage());
			}
			}
			ob.f2(i);
			
		
	}
	

}

}
