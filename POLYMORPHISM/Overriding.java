

class Bank{
	int amount=1000;
	
	float intrest()
	{
		System.out.print(" Bank INTREST ");
		return (10 * amount)/100;
	}
}

class SBI extends Bank{
	float intrest()
	{
		System.out.print(" SBI INTREST ");
		return (20 * amount)/100;
	}
}
class HDFC extends Bank{
	float intrest()
	{
		System.out.print(" HDFC INTREST ");
		return (30 * amount)/100;
	}
}
class AXIS extends Bank
{
	float intrest()
	{
		System.out.print(" AXIS INTREST ");
		return (30 * amount)/100;
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank s1=new Bank();
		System.out.print(s1.intrest());

		HDFC s2=new HDFC();
		System.out.print(s2.intrest());
		
         AXIS s3=new AXIS();
		System.out.print(s3.intrest());
		
		SBI s4=new SBI();
		System.out.print(s4.intrest());


	}

}
