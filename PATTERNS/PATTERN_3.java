
public class PATTERN_3 {

	public static void main(String[] args) {
		
		
		/*
		  
		     * * * *
		       * * *
		         * * 
		           *
		                    
		 */
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			
			
			for(int k=4-i;k>0;k--)
			{
				System.out.print("*");
			}
		
			System.out.println();
		}
	}

}
