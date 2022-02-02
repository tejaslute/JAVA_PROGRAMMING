public class employee 
{
	//member variables
	int eid;
	String ename, dept;
	
	int  Leaves(int totalleaves)
	{
		
		return totalleaves;
	}
	
	int Bonus(int sy)
	{
	  if(sy>=5)
	  {
		  return 2500;
	  }
	  else
	  {
		  return 0;
	  }
	}

public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		employee tejas = new employee();
		employee vishal = new employee();
		int x=tejas.Leaves(10);
		int y=vishal.Leaves(5);
		System.out.println(x);
		System.out.println(y);
		System.out.println("=====================================");
        employee e1= new employee();
        int b=e1.Bonus(13);
         System.out.println(b);
         if(b==0)
         {
        	 System.out.println("no bonus");
         }
	}
	}
