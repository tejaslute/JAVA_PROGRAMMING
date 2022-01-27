
public class Selection_statement_1 {

	public static void main(String[] args) {
		int number1=200,number2=200;
		if(number1>number2)
		{
			System.out.println("Greatest number is : "+number1);
		}
		
		else if(number1<number2)
		{
			System.out.println("Greatest number is : "+number2);
		}

		else
		{
			System.out.println("  Given numbers are equal !");
		}
		
		
		// WAP to to find greatest between 3 numbers using logical operators 
		
		int a=10,b=20,c=30;
		if(a>b && a>c)
		{
			System.out.println(" Greatesh number is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println(" Greatesh number is "+b);
		}
		else if (a==b && b==c)
		{
			System.out.println(" Greatesh number is "+a);
		}
		
		else
		{
			System.out.println(" Greatesh number is "+c);
		}
			
		
		// WAP to find given name and password is correct 
		
		String name="Admin";
	}

}
