
public class FIBONISCCHE_SERIES {
	int a=0;
	int b=1;
	int c;
	void series()
	{
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 1 2 3 5 8 13 
		FIBONISCCHE_SERIES object =new FIBONISCCHE_SERIES();
		object.series();

	}

}
