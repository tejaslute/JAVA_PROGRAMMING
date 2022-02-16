
public class Method_overloading_2 {
	int add(int a,int b)
	{
		return a+b;
	}
double add(int a,int b)
{
	return a+b;
}
	public static void main(String[] args) {
		// Overloading not possivle if it has different data type 
		Method_overloading sc=new Method_overloading();
		sc.add(2, 3);//int add called 
		sc.add(5, 4);// double add called 

	}

}
