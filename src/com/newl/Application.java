package com.newl;

public class Application {

	public static void main(String[] args)	{
		
		Producer p1 = new Producer("elso");
		Producer p2 = new Producer("masodik");
		
		
		
		long timer;
		p1.start();
		timer = System.currentTimeMillis();
		while(System.currentTimeMillis() - timer < 500)	{}
		p2.start();
	}
}
