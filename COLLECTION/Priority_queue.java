import java.util.Queue;
import java.util.PriorityQueue;
import java.util.*;
public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		Iterator<Integer>it= q.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println("Top elemt in queu is "+q.peek());
		System.out.println("Removinf an top elet "+q.poll());
		System.out.println("Top After an pop  in queu is "+q.peek());
		
	}

}
