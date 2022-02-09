
public class PATTERN_12 {

	public static void main(String[] args) {
    
		
		/* 
		        * 
		      * * * 
		    * * * * * 
		  * * * * * * * 
		  * * * * * * * 
		    * * * * *
		      * * *
		        *  
		 */
		
		// for upper half 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) // spaces 
			{
				System.out.print(" ");
			}
			for(int j=1;j>=2*i-1;j++) // 1st half
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// For lower half
		
		for (int i=n;i>=1;i--)
	 	{
			for(int j=1;j<=n-i;j++) // spaces 
			{
				System.out.print(" ");
			}
			for(int j=1;j>=2*i-1;j++) // 1st half
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
