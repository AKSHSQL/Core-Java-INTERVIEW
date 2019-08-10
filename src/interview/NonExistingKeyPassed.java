package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonExistingKeyPassed {

	public static void main(String[] args) {
		
		
		HashMap<String,String> map = new HashMap<>();
		map.put("batit","bms");
		map.put("Raju", "wwww");
	   String val	=map.put("amit","Raj");
		System.out.println("---Retunr String---"+val);
	  String val1=	map.put("amit","RajaBeta");
		System.out.println("----duplica---"+val1);
		map.put("Adarsh", "zzzz");
		map.put("Baju", "yyyy");
//		map.put(null,"Dhoni");
		
		
		System.out.println("Non exisitng key passed to kya hoga----"+map.get("bms"));
		
		TreeMap<String,String> tree = new TreeMap<>(map);
		
		for(Map.Entry<String,String> o : tree.entrySet())
		{
			System.out.println(o.getKey()+ "   "+o.getValue());
		}

	}

}
