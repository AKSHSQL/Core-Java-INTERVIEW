package patternDesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Practice_1_Collection
{

	public static void main(String[] args)
	{
		
		
		Collection<Integer> value2 = new ArrayList<Integer>();
		
		value2.add(1);
		value2.add(2);
		value2.add(3);
		value2.add(4);
		
//		System.out.println(value2);
		
//		Iterator<Integer> i=value2.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		
		for(Object i: value2){
			
			System.out.println(i);
		}
		
		
	}

}
