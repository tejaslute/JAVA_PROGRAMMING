
public class PATTERN_11 {

	public static void main(String[] args) {
		  /*     
		   
		          1
		        2 1 2
		      3 2 1 2 3
	        4 3 2 1 2 3 4
		  5 4 3 2 1 2 3 4 5
		   
		   */

		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) // spaces 
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) // 1st half
			{
				System.out.print(j);
			}
			
			for(int j=2;j<=i;j++) //second half 
			{
				System.out.print(j );
			}
			
			System.out.println();
		}
	}

}
