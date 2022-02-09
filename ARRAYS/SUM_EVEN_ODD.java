import java.util.Scanner;

public class SUM_EVEN_ODD {
	int[]  input()
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		size=sc.nextInt();
		int a[]= new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();  // 4,1,2,6,1
		}
		
		return a;
	}
	
	void display(int a[])
	{
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	void even_odd_sum(int a[])
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even+=a[i];
			}
			else
			{
				odd+=a[i];
			}
		}
		System.out.println("\n Sum of even in array ! "+even);
		System.out.print("Sum of odds in array ! "+ odd);
		
	}
	public static void main(String[] args) {
		//WAP to calculate even number sum and odd number sum.
		SUM_EVEN_ODD object=new SUM_EVEN_ODD();
		   int a[]=object.input();                 // array created 
		   object.display(a);
		   object.even_odd_sum(a);
		

	}

}
