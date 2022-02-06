
public class PRIME_NUMBER {

	void prime(int number)
	{
		int count=0;
		
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		
	    if(count==0)
		{
			System.out.println("NUmber is  Prime ! ");
		}
		else
		{
			System.out.println("Number is  not prime ! ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12;
		//System.out.println("Enter an number : ");
		//Scanner s = new Scanner(System.in);  
		//number=s.nextInt();
		PRIME_NUMBER object=new PRIME_NUMBER();
		object.prime(number);

	}

}
