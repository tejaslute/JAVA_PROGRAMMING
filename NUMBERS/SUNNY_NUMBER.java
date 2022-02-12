import java.util.Scanner;

public class SUNNY_NUMBER {

	boolean check()
	 {
		 System.out.print("Enter an number : ");
		 Scanner sc=new Scanner(System.in);
		 int number=sc.nextInt();
		 int answer=number+1;
		double answer1=Math.pow(answer, 0.5);
		double two=answer1*answer1;
		double answer2=two-1;
		 if(answer2==number)
		 {
			 return true;
		 }
		 return false;
	 }
		public static void main(String[] args) {
			
			// A number is called a sunny number if the number next to the given number is a perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square
			
			SUNNY_NUMBER sc=new SUNNY_NUMBER();
			if(sc.check()==true)
			{
				System.out.print(" Its a sunny number ! ");
			}
			else
			{
				System.out.print(" Its  not a sunny number ! ");
			}
			
		}

	}

	
