package com;

//Thread using extends Thread class
/*
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("hello"+currentThread().getName());
			
			System.out.println("hello"+currentThread().getId());
			
			
			try
			{
			sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}


public class TestThread {

	public static void main(String[] args) {
	
		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		t.setName("Thread A");
		t1.setName("Thread B");
		t.start();
		try
		{
	    	//t.join();
			t.join(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		t1.start();
		

	}

}

*/


/*

class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("hello"+currentThread().getName()+" "+currentThread().getPriority());
			
			if(currentThread().isAlive())
			    System.out.println("yes");
						
			try
			{
			sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}


public class TestThread {

	public static void main(String[] args) {
	
		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		t.setName("Thread A");
		t1.setName("Thread B");
		
		t.setPriority(8);
		t1.setPriority(4);
		t.start();
		
		t1.start();
		

	}

}


*/

//Thread using Runnable interface

/*
class MyThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
			  Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}


public class TestThread {

	public static void main(String[] args) {
	
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.start();
		
		t2.start();
		

	}

}

*/



class MyThread implements Runnable
{
	public void run()
	{
			if(Thread.currentThread().isDaemon())
			   System.out.println(Thread.currentThread().getName()+"is daemon");
			   else
				   System.out.println(Thread.currentThread().getName()+"is normal thread");	   
			
		}
	}
	



public class TestThread {

	public static void main(String[] args) {
	
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		
		t1.setName("D Thread");
		t1.setDaemon(true);
		t1.start();
		t2.setName("N Thread");
		t2.start();
		

	}

}





















