import java.util.Scanner;

public class Multi_array {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter an number of rows and columns : ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int array[][]=new int[row][column];
		System.out.println(" enter an elements ! ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;i++)
			{
				array[i] [j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;i++)
			{
				System.out.print(array[i][j] + " ");
			}
		}
	}

}
