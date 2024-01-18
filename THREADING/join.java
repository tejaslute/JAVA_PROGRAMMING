import java.lang.*;


 class Add implements Runnable{
	 private int start;
	 private int end;
	 Add(int start,int end){
		 this.start=start;
		 this.end=end;
	 }
	 public void run() {
		 
		 for(int i=start;i<=end;i++)
		 {
			 try {
				 Thread.sleep(200);
			 //Thread.currentThread().setName("Tejas");
			 System.out.println(Thread.currentThread().getName()+" : "+i+" Priority :  "+ Thread.currentThread().getPriority());
			 
			
			 
			
			 }catch(Exception e )
			 {
				 System.out.println(e);
			 }
			 
		 }
		 
		 
	 }
	 
}
public class two_numbers {

	private static final int MAX_PRIORITY = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Add i1=new Add(1,5); 
		Thread t1=new Thread(i1,"Tejas"); 
		//System.out.println(t1.isAlive());
		Add i2 = new Add(6,10);
		Thread t2=new Thread(i2,"Lute");
		System.out.println(Thread.currentThread().isAlive());
		//t2.setDaemon(true);
		//t1.setPriority(MAX_PRIORITY);
		
		t1.start();
		t1.join();
		t2.start();
		
		for(int i=0;i<6;i++)
		{
			t2.join();
			System.out.println(i);
		}
		
		
		

	}

}
