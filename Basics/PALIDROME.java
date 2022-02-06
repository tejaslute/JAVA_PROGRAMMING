
public class PALIDROME {
    void palidrome(int number)
    {
    	int rem=0,ans=0;
    	 int temp=number;
    	while(number>0)
    	{
    		rem=number%10;
    		ans=ans*10 +rem;
    		number=number/10;
    		
    	}
    	if(temp==ans)
    	{
    		System.out.println("Its palidrone !");
    	}
    	else
    	{
    		System.out.println("Its  not palidrone !");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          PALIDROME object =new PALIDROME();
          object.palidrome(20);
	}

}
