
public class Operators1 {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		//Arethamatic operators 
		
		int add,sub,div,mod,mul;
		add=x+y;
		sub=x-y;
		mul=x*y;
		div=x/y;
		mod=x%y;
		
		System.out.println("Addition is "+(x+y));
		System.out.println("Subraction is "+sub);
		System.out.println("Multiplication is "+mul);
		System.out.println("Division  is "+div);
		System.out.println("Modulas is "+mod);
		
		 System.out.println("Assignment operators : ");
		
		x=x+y; //x+=y
		
		System.out.println("Addition id "+x);
		
		x-=y; //x=x-y
		
		System.out.println("Substraction is "+x);
		
		
		 System.out.println("Equility operators" );
		
		// quility operators ..If want to compare two values
		
		int num1=10;  
        int num2=20;  
          
    boolean b1=true;  
    boolean b2=false;  
  
if(num1<num2)  
{  
    System.out.println(b1);  
}  
else  
{  
    System.out.println(b2);  
}  
		
System.out.println("Unirary operarows : ");

 int a=10;
 int b=20;
 int c=a++;
 System.out.println(c); // Firstly value is used and then updated 
 System.out.println(c); // Updaed value 
 int d=++b;
 System.out.println(d); // Firstly value is updated and then used 

	}

}
