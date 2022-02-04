
public class OVERLOADING {
	
	int add(int a,int b)
	{
		return a+b;
	}


	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
	
OVERLOADING object=new OVERLOADING();
System.out.println("Addition of two is "+object.add(2,4));
System.out.println("Addition of three is "+object.add(2,4,4));
	}

}
