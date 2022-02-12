import java.util.Scanner;

public class AUTOMORPHIC {
	  
	 boolean check()
	{
		 Scanner sc=new Scanner(System.in);
			System.out.println(" ENter an numbers : ");
		int number=sc.nextInt();
		int square=number * number;
		while(number>0)
		{
         if(number%10 != square%10)
         {
       	  return false;
         }
         number=number/10;
         square=square/10;
		}
		return true ;
		
	}
	public static void main(String[] args) {
		
		// A number whose digits is equal to last digits of its square e. 25   625  25 comes in last digits .
		
		
		AUTOMORPHIC s=new AUTOMORPHIC();
		if(s.check()==true)
		{
			System.out.print(" Its automorphic ! ");
		}
		else
		{
			System.out.print("Its not automorphic !" );
		}
		

	}

}
