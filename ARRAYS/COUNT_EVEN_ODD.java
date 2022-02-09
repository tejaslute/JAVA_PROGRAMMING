import java.util.Scanner;

public class COUNT_EVEN_ODD{
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
	
	void even_odd(int a[])
	{
		int even_counter=0;
		int odd_counter=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even_counter++;
			}
			else
			{
				odd_counter++;
			}
		}
		System.out.println("\n Number of even in array ! "+even_counter);
		System.out.print("Number of odds in array ! "+ odd_counter);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COUNT_EVEN_ODD object=new COUNT_EVEN_ODD();
   int a[]=object.input();                 // array created 
   object.display(a);
   object.even_odd(a);

	}

}
