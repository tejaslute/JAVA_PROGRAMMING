import java.util.Scanner;

public class OCCURANCE {
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
    
    void count(int array1[],int array2[])
    {
    	int visited=-1;
    	for(int i=0;i<array1.length;i++)
    	{
    		int count=1;
    		for(int j=i+1;j<array1.length;j++)
    		{
    			if(array1[i]==array1[j])
    			{
    				count++;
    				array2[j]=visited;
    			}
    		}
    		if(array2[i]!=visited)
    		{
    			array2[i]=count;
    		}
    	}
    }
	public static void main(String[] args) {
		OCCURANCE sc=new OCCURANCE();
		int []array=sc.input();
		sc.display(array);
		int array1[]=sc.input();
		sc.display(array1);
		sc.count(array,array1);
		sc.display(array1);

	}

}
