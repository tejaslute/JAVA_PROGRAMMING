import java.util.Scanner;

public class SUM_ARRAY {
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
	
	int sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SUM_ARRAY object=new SUM_ARRAY();
   int a[]=object.input();                 // array created 
   object.display(a);
   System.out.print("\n Sum of an array is : "+ object.sum(a));
	}

}
