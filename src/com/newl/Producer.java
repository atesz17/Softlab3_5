package com.newl;


public class Producer {
	
	static int szam = 0;
	
	String szoveg;

	public Producer(String sz)	{
		
		szoveg = sz;
	}

	public void go()	{
 
		
		while(true)	{
			try {  
				System.out.println(szoveg + " " + szam + " " + System.currentTimeMillis() % 100000);
				szam++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
