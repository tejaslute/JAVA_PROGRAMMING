import java.util.Scanner;

public class PETERSON {
 boolean check()
 {
	 System.out.print("Enter an number : ");
	 Scanner sc=new Scanner(System.in);
	 int number=sc.nextInt();
	 int answer=0;
	 for(int i=1;i<number;i++)
	 {
		 if(number%i==0)
		 {
			 answer=answer+i;
		 }
	 }
	 if(answer==number)
	 {
		 return true;
	 }
	 return false;
 }
	public static void main(String[] args) {
		
		// A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself. eg . 6,145
		
		PETERSON sc=new PETERSON();
		if(sc.check()==true)
		{
			System.out.print(" Its a peterson number ! ");
		}
		else
		{
			System.out.print(" Its not peterson number ! ");
		}
		
	}

}
