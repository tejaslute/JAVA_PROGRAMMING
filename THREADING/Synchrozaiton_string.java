import java.util.*;
import java.lang.*;

class B22 implements Runnable{
	private String name;
	
	B22(String name){
		this.name=name;
	}
	public void run()
{
		
		synchronized(this) {
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i)+" "+Thread.currentThread().getName());
		}
	
		}
}
}
public class Syring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B22 b = new B22("Tejas");
		Thread t1=new Thread(b,"Thread 1 ");
		Thread t2= new Thread(b,"Thread 2 ");
		try {
			t1.start();
		
			t2.start();
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}

}
