import java.util.*;
import java.lang.*;
public class arraydequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String>q=new  ArrayDeque<String>();
		
		q.addFirst("Tejas");
		q.addFirst("Sanket");
		q.addFirst("Sanket");
		q.addFirst("Harshal");
		
		q.addLast("Kailas");
		q.addLast("Gorakh");
		
		q.forEach(it->System.out.print(it+" "));
		
		q.pollFirst();
		q.pollLast();
		System.out.println();
		q.forEach(it->System.out.print(it+" "));

	}

}
