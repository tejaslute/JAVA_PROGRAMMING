
import java.lang.*;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer>s=new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		if(s.contains(4)) {
			System.out.println("Eleemnt 4 found ");
		}
		
		s.remove(3); // Removes an elemnt from hashset
		
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
		

	}

}
