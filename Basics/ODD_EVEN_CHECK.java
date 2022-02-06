import java.util.Scanner;

public class ODD_EVEN_CHECK {
	void even(int number)
	{
		if(number%2==0)
		{
			System.out.println("Number is even ");
		}
		else
		{
			System.out.println("Number is odd ");
		}
	}
	
	void year(int year)
	{
	if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400==0))
    {
	System.out.println("Leap Year ");
	
    }
else
{
	System.out.println(" Not leap ");
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter an number : ");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		ODD_EVEN_CHECK object=new ODD_EVEN_CHECK();
		object.even(number);
		object.year(number);
		

	}

}
