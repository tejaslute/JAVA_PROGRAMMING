import java.util.*;
import java.lang.*;
public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String,Integer>mp=new HashMap();
		mp.put("Tejas", 1);
		mp.put("Sanket", 3);
		mp.put("Pranav", 3);
		mp.put("Harsahl", 3);
	
		
			System.out.println("Retring an value of an "+mp.get("Tejas"));
			System.out.println("Chekcing is key present in map "+mp.containsKey("Sanket"));
	mp.replace("Harsahl", 4);
		
		
		for(Map.Entry me : mp.entrySet())
		{
			System.out.println(me.getKey()+" -> "+me.getValue());
		}
		
		
			

	}

}
