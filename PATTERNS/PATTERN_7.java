
public class PATTERN_7 {

	public static void main(String[] args) {
		
		/* 0-1 triangle .
		 
		              1 
                      0 1 
                      1 0 1 
                      0 1 0 1 
                      1 0 1 0 1 
		 */
		
		int n=5;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
				System.out.print("1 ");
				}
				else
				{
				System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
