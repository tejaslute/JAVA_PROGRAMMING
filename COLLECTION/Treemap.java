import java.util.*;
import  java.lang.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer>m=new TreeMap<>();
		m.put("Teja", 2);
		m.put("T", 21);
		m.put("Tej", 212);
		m.put("Tejas", 2);
		
		
		for(Map.Entry mp : m.entrySet())
		{
			System.out.println(mp.getKey()+" -> "+mp.getValue());
		}
		System.out.println(m.firstKey());
		System.out.println(m.firstEntry());
		
	}

}
