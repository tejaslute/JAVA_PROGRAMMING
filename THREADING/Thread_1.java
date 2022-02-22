class thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Hello "+ currentThread().getName());
		}
	}
}
public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      thread1 t=new thread1();
      thread1 t1=new thread1();
      t.setName("Thread A ");
      t1.setName("Thread B ");
      t.start();
      t1.start();
	}

}
