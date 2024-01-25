import java.util.*;
import java.lang.*;

class joinClass1 implements Runnable{
	
	private int start;
	private int end;
	
	joinClass1(int start,int end){
		this.start=start;
		this.end=end;
	}
	
	public void run(){
		try {
			
			for(int i=start;i<=end;i++)
			{
				System.out.print(i+" ");
			}
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}

	
}
public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		joinClass1 j = new joinClass1(1,6);
		joinClass1 j1 = new joinClass1(7,10);
		joinClass1 j2 = new joinClass1(11,20);
		Thread t= new Thread(j);
		Thread t2= new Thread(j1);
		Thread t3= new Thread(j2);
		
		try {
			t.start();
			t.join();
		
		Thread.sleep(2000);
			t2.start();
			//Thread.sleep(2000);
			t3.start();
			
		}catch(Exception e ) {
			System.out.print(e);
		}
		
		
		
		
		
		
	}

}
