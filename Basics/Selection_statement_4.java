
public class Selection_statement_4 {

	public static void main(String[] args) {
		//WAP to print an grade of students 
		int m1=20,m2=70,m3=60;
		int avg=(m1+m2+m3)/3;
		if(avg>=80 && avg<=100)
		{
         System.out.println("Grade A ! ");
		}
		else if(avg>=65 && avg<80)
		{
			System.out.println("Grade B ! ");
		}
		else if(avg>=35 && avg<65)
		{
			System.out.println("Grade C ! ");
		}
		else
		{
			
	     System.out.println("Opps Try next time  ");
			
		}


	}

}
