package com.test.mavenproject1.p6;

public class Demo4 {

	public static void main(String[] args) throws Exception {
	Game g1=new Game();
	Player p1=new Player(g1);
	Player1 p2=new Player1(g1);
	p1.start();
	p2.start();
	g1=null;
	System.gc();

}
}
