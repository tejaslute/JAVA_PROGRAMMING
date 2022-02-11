import java.util.Scanner;

public class DUBLICATE {
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
    
    int dublicate(int array[])
    {
    	int ans=0;
    	for(int i=0;i<array.length;i++)
    	{
    		ans=ans^array[i];
    	}
    	System.out.println(ans);
    	for(int i=1;i<array.length;i++)
    	{
    		ans=ans^i;
    	}
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DUBLICATE sc=new DUBLICATE();
		int array[]=sc.input();
		sc.display(array);
		System.out.println(" Dublicate is : "+sc.dublicate(array));

	}

}
