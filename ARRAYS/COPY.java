import java.util.Scanner;

public class COPY {
	int [] input()
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter an size of array : ");
        int size=sc.nextInt();
        int []array=new int[size];
        System.out.println(" Enter an elements in array : ");
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
         	System.out.print(array[i]+ " ");
         }
    }
    
    int []copy(int array1[],int array2[])
    {
    	for(int i=0;i<array1.length;i++)
    	{
    		array2[i]=array1[i];
    	}
    	return array2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COPY sc=new COPY();
		int array1[]=sc.input();
		sc.display(array1);
		int array2[]=sc.input();
		sc.display(array2);
		sc.copy(array1, array2);
		sc.display(array2);

	}

}
