package interview;

import java.util.HashMap;

public class FindDuplicateAndShowCount {

	public static void main(String[] args)
	{
		HashMap<String,Integer> mapDupli = new HashMap<>();
		
		String nameArr[]={"RAHUL","ajinkya","RAHUL","Dhoni","Dhoni","Jadeja","Abcd","Jadeja"};
		
		for(String name:nameArr)
		{
			Integer count = mapDupli.get(name);
			if(count==null)
				mapDupli.put(name, 1);
			else{
				count++;
				mapDupli.put(name, count);
			}
		}
		System.out.println(mapDupli);
	}
}




