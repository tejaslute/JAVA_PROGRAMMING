import java.util.Scanner;

public class ARRAY_1 {
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

    public static void main(String[] args) {
	
    ARRAY_1 s=new ARRAY_1(); //Created an object .
     int array[]=s.input();  // Called an input method which returns array .
     s.display(array);       // Displayiong opf array 
     
	}

}
