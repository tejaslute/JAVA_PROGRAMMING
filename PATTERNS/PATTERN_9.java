
public class PATTERN_9 {

	public static void main(String[] args) {
	
		
		/*
		  
		   
		     SOLID RHOMBUS 
		     
		           * * * * * 
		         * * * * *          
		       * * * * *
		     * * * * *
		    	   
		 */
		
		
int rows=4;
for(int i=1;i<=rows;i++)
{
    // For spaces 
	for(int j=1;j<=rows-i;j++)
	{
		System.out.print(" ");
	}
	
	// For star
	for(int j=1;j<=rows;j++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}


	}

}
