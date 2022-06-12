
public class defalut {
    int roo_no;
    String name;
     defalut()
     {
    	 System.out.println(" Default constructor  called ");
    	 roo_no=10;
    	 name="Akash";
     }
     defalut(int roo_no ,String name)
     {
    	 System.out.println(" Parameterized Constructor ");
    	 this.roo_no=roo_no;
    	 this.name=name;
     }
     void display()

     {
    	 System.out.println(roo_no + "  "+name);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defalut sc=new defalut();
		defalut  s=new defalut(3,"tejas");
		sc.display();
		s.display();
		

	}

}
