import java.util.Scanner;

public class SEARCHING {
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
	
	void search(int a[])
	{
		System.out.println("\n Enter an element to search ! ");
		Scanner sc=new Scanner(System.in);
		int element=sc.nextInt();
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.print("\n Element found sucessfully at position "+i);
				return ;
			}
		
		}
		System.out.print("\n Element  not found ");
		
		
	}
	public static void main(String[] args) {
		
		SEARCHING object=new SEARCHING();
		   int a[]=object.input();                 // array created 
		   object.display(a);
		   object.search(a);
	}

}
