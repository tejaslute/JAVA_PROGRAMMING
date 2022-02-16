
public class Method_overloading {
	int a,b,c;
	Method_overloading(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
int add(int a,int b)
{
	return a+b;
}
int add(int a,int b,int  c)
{
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading sc=new Method_overloading(10,20,30);
		int x=sc.add(2, 3);
		int y=sc.add(2,3,4);
		System.out.println(" addition is : "+ x +"  "+ y);
		
		

	}

}
