import java.util.Scanner;

public class vowel {

	void check(char a)
	{
		switch(a)
		{
		case 'a' : System.out.println("Its a vovel ");
		           break;
		case 'e' : System.out.println("Its a vovel ");
                  break;
        
		case 'i' : System.out.println("Its a vovel ");
                  break;
        
		case 'o' : System.out.println("Its a vovel ");
                  break;
        
		case 'u' : System.out.println("Its a vovel ");
                  break;
        
		case 'A' : System.out.println("Its a vovel ");
        break;
        
		case 'E':System.out.println("Its a vovel ");
        break;
        
		case 'I' : System.out.println("Its a vovel ");
        break;
        
		case 'O' : System.out.println("Its a vovel ");
        break;
        
		case 'U' : System.out.println("Its a vovel ");
        break;
        
        default : System.out.println("Its a consanant ! ");
		}
	}
	public static void main(String[] args) {
		
		char input;
System.out.println(" Enter an alphabet " );
Scanner sc=new Scanner(System.in);
input=sc.next();
vowel object=new vowel();
object.check(input);


	}

}
