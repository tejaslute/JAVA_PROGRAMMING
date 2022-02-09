
public class PATTERN_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  BUTTERFLY_PATTERN
		    
		     
		     *             *                                           *             *
		     * *         * *                                           * *         * *
		     * * *     * * *                                           * * *     * * *
		     * * * * * * * *                                           * * * * * * * *     
		     * * * * * * * *                                           Do this patttern and just do invert of it !
		     * * *    * * * 
		     * *         * * 
		     *             *
		       
		 
		 */
		
			                                      
	                                              
		
		int rows=6;
		//upper half 
		
		for(int i=1;i<=rows;i++)
		{
			// 1st part
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			} 
			//spaces
			
			int spaces=2 *(rows-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			//2nd part
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}
		
		// lower half ...just change the i value .
		
		for(int i=rows;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			} 
			
			for(int j=1;j<=2 * (rows-i);j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}
		

	


}
};
