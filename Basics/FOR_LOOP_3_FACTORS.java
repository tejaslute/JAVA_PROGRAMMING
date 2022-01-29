
public class FOR_LOOP_3_FACTORS {

	public static void main(String[] args) {
	
int number=20;
int counter=0;
for(int i=1;i<=20;i++)
{
	if(number%i==0)
	{
		System.out.println(i);
		++counter;
	}
}
   System.out.println("There are "+counter+" factors of "+number);
	
    }

}
