
public class Single_inherirance {
int employee_id ;
String name;
}
 class Child_class extends Single_inherirance
{
	int salary;
	void get_data()
	{
		employee_id=10;
		name="Tejas";
		salary=1000;
	}
	void display()
	{
		System.out.print(employee_id + " " + name + " " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Child_class p=new Child_class();  
		p.get_data();
		p.display();
		

	}

}
