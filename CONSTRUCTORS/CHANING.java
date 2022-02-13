
public class CHANING {

	int roll_no;
	String name ;
	CHANING(int roll_no,String name)
	{
		this(name);
		System.out.println("Two argument constructor ! ");
	}
	
	CHANING(String name)
	{
		this();
		System.out.println(" One argument constructo called ! ");
	}
	
	CHANING()
	{
		
		System.out.println(" Default constructor called : ");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CHANING sc=new CHANING(25,"tejas");

	}

}


/*
 
  Default constructor called : 
 One argument construct  called ! 
Two argument constructor ! 

*/
