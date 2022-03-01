class threads implements Runnable{
	public void run()
	{
		System.out.println(" Thread 1 "); // method overrinding of an Thread class 
	}
}
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threads m1=new threads();
		Thread t1=new Thread(m1); // pAssing an refrence 
		t1.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Akash");
		System.out.println(Thread.currentThread().getName());

	}

}
