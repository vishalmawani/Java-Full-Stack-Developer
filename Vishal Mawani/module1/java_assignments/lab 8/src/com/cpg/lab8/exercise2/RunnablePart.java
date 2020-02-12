package com.cpg.lab8.exercise2;

public class RunnablePart implements Runnable {

	private int timer=0;
	@Override
	public void run() {
		while(timer!=10)
		{
			
		    try {
		    	System.out.println("Countdown: "+timer++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    if(timer==10);
		    break;
		    	//timer=0;
		   
		}
		 
		
		
		
	}
	public static void main(String ar[])
	{
		
		RunnablePart rp=new RunnablePart();
		Thread t=new Thread(rp);
		t.start();
	}
	

}
