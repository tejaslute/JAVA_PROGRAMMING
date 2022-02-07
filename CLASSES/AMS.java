import java.lang.Math;
import java.util.Scanner;  
public class AMS {
	 
	boolean check(int n)
	{
		int reminder=0,count=0,sum=0;
		int temp=n;
	    while(temp>0)
	    {
	    	temp=temp/10;
	    	count++;
	    }
	    temp=n;
	    while(temp>0)
	    {
	    	reminder=temp/10;
	    	sum +=  (Math.pow(reminder, count));  
	    	temp=temp/10;
	    }
	    if(sum==n)
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	}

	public static void main(String[] args) {
	     
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter number : ");
		int number;
		number=sc.nextInt();
		AMS object=new AMS();
		for(int i=0;i<=number;i++)
		{
			if(object.check(i))
			{
				System.out.println( i + ',');
			}
		}

	}

}
