package interview;

import java.util.HashMap;
import java.util.Map;

public class HashMapModificationException {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i =10 ;i>0;i--){
			map.put(i,i);
			System.out.println("- Main-Thread Remove---"+i);
			map.remove(i);
		}
		System.out.println("--The End---"+map);

	}

}
