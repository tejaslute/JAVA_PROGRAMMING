import java.util.*;
public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer>t=new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		
		t.remove(2);
		
		TreeSet<Integer>t1=new TreeSet<Integer>();
		t1.addAll(t);
		t1.add(23);
		t1.add(34);
		
		Iterator<Integer>it=t1.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println("Smakest ekekmt is "+t1.first());
		System.out.println("Largest elemt is "+t1.last());

		
		
		System.out.println("Removinf an lowest "+t1.pollFirst()+" ekent ");
		System.out.println("Removinf an lowest "+t1.pollLast()+" ekent ");
		
		
		
Iterator<Integer>it1=t1.descendingIterator();
		
		while(it1.hasNext())
		{
			System.out.print(it1.next()+" ");
		}
		
	}

}
