
class Animal
{
	int id;
	String name="Sunny ";
	void displayAnimal()
	{
		System.out.println(" Its Animal class : "+ name );
	}
}
class Dog extends Animal
{
	String name1="Viru";
	void displayDog()
	{
		System.out.println(" Its dog class : "+ name1 );
	}
}
public class MULTILEVEl extends Dog{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Multiple object=new Multiple();
	object.displayAnimal();
	object.displayDog();

	}

}
