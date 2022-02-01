
public class class_2_student {
	
	int roll_no;
	int course_id;
	String name;
	 void display()
	 {
		 System.out.println(" Details of student ");
		 System.out.println(roll_no+" "+ course_id + " "+ name);
	 }
	

	public static void main(String[] args) {
      
		
		class_2_student object =new class_2_student();
		object.roll_no=10;
		object.course_id=1100;
		object.name="Tejas";
		object.display();
	
	}

}
