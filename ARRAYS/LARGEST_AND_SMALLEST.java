import java.util.Scanner;

public class LARGEST_AND_SMALLEST {

	int [] input()
	{
		System.out.println(" Enter an size of array ! ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int [size];
		System.out.println(" Enter an array elements : ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		return array;
	}
	void display(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	int largest(int array[],int k)
	{
		
		for(int i=0;i<array.length;i++)
		{
			
			for (int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
				 int temp=array[j];
				 array[j]=array[i];
				 array[i]=temp;
				}
			
			}
			if(i==k-1)
			{
				return array[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		LARGEST_AND_SMALLEST sc=new LARGEST_AND_SMALLEST();
		int array[]=sc.input();
		sc.display(array);
		int x=sc.largest(array, 3);
		System.out.print("\nThird largest Is " +x);
	}

}
