
public class PATTERN_5 {

	public static void main(String[] args) {
    /* 
      Hollow rectangle 
      
       * * * * * * 
       *         *
       *         *
       * * * * * *
     */

	int rows=4;
	int col=6;
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=col;j++)
		{
			if(i==1 || j==1 || i==rows || j==col)
			{
			  System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}

}
