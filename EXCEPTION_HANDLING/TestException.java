package com;

import java.util.Scanner;

//Exception: is an abnormal condition which arrises at time of execution.
/* Exception is an event when it generated our program gets terminate and our rest of code
     is not executed.*/

/*Exception Handling : In Exception Handling we handle our exception using try-catch block,
           so that our rest of the code is executed.*/

/*
public class TestException {

	public static void main(String[] args) {
		
		int x=6,y=0;
		
		System.out.println(x+y);
		
		System.out.println(x/y);
		System.out.println(x-y);
		System.out.println(x*y);
		
		
	}

}
*/

/*
public class TestException {

	public static void main(String[] args) {
		
		int x=6,y=0;
		int a[]= {3,4,5,6};
		System.out.println(x+y);
		try
		{
		System.out.println(a[4]);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
		System.out.println(x/y);
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(x-y);
		System.out.println(x*y);
		
		
	}

}

*/


/*
public class TestException {

	public static void main(String[] args) {
		
		int x=6,y=0;
		int a[]= {3,4,5,6};
		System.out.println(x+y);
		
		
		
		try
		{
			System.out.println(a[3]);
		System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		System.out.println(x-y);
		System.out.println(x*y);
		
		
	}

}

*/


/*
public class TestException {

	public static void main(String[] args) {
		
		int x=6,y=0;
		int a[]= {3,4,5,6};
		System.out.println(x+y);
		
		
		
		try
		{
			try
			{
				System.out.println(x/y);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				
			}
		
		}		
		catch(Exception e)
		{
			System.out.println("In exception catch");
			e.printStackTrace();
		}
		
		System.out.println("Rest of the code");
		System.out.println(x-y);
		System.out.println(x*y);
		
		
	}

}
*/
// try-cathch -finally

/*
public class TestException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=6,y=0;
	
		System.out.println(x+y);
		
		try
		{
		System.out.println(x/y);
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally always");
			sc.close();
		}
		System.out.println(x-y);
		System.out.println(x*y);
		
		
	}

}

*/


//throw keyword: is used to explicitly throw the excecption.

/*
class ValidationAge
{
	void valid(int age)
	{
		if(age<18)
		{
			try
			{
			throw new ArithmeticException("Not valid Age");
			}catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
		}
		else
			System.out.println("Valid age for vote");
	}
}
public class TestException {

	public static void main(String[] args) {
		
		new ValidationAge().valid(17);
		
		System.out.println("Rest of code");
	}
	
}
	

*/



//Customize Exception

class NegatvieNumberException extends Exception
{
	String s;
	NegatvieNumberException(String s)
	{
		this.s=s;
		System.out.println(s);
	}
}



class FindValidationNumber
{
	void valid(int num)
	{
		if(num<0)
		{
			try
			{
			throw new NegatvieNumberException("Negtive number exception");
			}catch(NegatvieNumberException e)
			{
				
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Positive number");
			num=num+10;
			System.out.println(num);
		}
	}
}
public class TestException {

	public static void main(String[] args) {
		
		FindValidationNumber v=new FindValidationNumber();
	//v.valid(6);
		v.valid(-6);
		System.out.println("Rest of code");
	}
	
}
	
