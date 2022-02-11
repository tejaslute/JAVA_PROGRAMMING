import java.util.Scanner;

public class LEFT_ROTATE {
	int size=5;
	int [] input()
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter an size of array : ");
         size=sc.nextInt();
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
    
    void left_rotate(int array[],int k)
    {
    	int temp[]=new int [size];
    	for(int i=0;i<array.length;i++)
    	{
    		temp[(i+k)% array.length]=array[i];  // left shift ... (i+k)%size==position 
    	}
    	for(int i=0;i<array.length;i++)
    	{
    		array[i]=temp[i];
    	}
    }
	public static void main(String[] args) {
		 LEFT_ROTATE sc=new LEFT_ROTATE();
		 Scanner s=new Scanner(System.in);
		 int array[]=sc.input();
		 sc.display(array);
		 System.out.print("Enter an shiftrs : ");
		 int shift=s.nextInt();
		int  left_shift=array.length -shift;
		 sc.left_rotate(array,left_shift);
		 sc.display(array);

	}

}
