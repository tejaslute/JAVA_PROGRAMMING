import java.util.Scanner;

public class FINALLY1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter an numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.println(" Try block started : ");
			
			int c= a/b;
			System.out.println(" Exception not occured : ");
			System.out.println("Catch block will not be executed ! ");
		}
		catch(ArithmeticException e)  // refrence created wich contains object having Exception name , description and Stack Trace ! 
		{
			System.out.println("Catch block Executed ! ");
		
		}
		finally {
			System.out.println("Finally block excuted if execption is occured or not ! ");
		}

	}

}
