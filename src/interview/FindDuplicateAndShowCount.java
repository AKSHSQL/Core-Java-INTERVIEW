package interview;

import java.util.HashMap;

public class FindDuplicateAndShowCount {

	public static void main(String[] args)
	{
		Integer a=null;
		Integer b=0;
		
		Boolean c= null;
		Boolean d=false;
		
		
		HashMap<String,Integer> mapDupli = new HashMap<>();
		
		String nameArr[]={"RAHUL","ajinkya","RAHUL","Dhoni","Dhoni","Jadeja","Abcd","Jadeja","RAHUL"};
		
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
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}




