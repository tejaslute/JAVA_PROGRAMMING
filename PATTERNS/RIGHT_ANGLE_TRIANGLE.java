import java.util.Scanner;

public class RIGHT_ANGLE_TRIANGLE {
	 
	void right_angle_triangle(int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j <= i;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	   
    System.out.println("Enter a number of rows : ");
    Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
    RIGHT_ANGLE_TRIANGLE object = new RIGHT_ANGLE_TRIANGLE();
    object.right_angle_triangle(number);
    
	}

}
