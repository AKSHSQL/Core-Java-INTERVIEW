package interview;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args)
	{
		Final finall= new Final();
		finall.addd();
	}

}

class Final
{
	final static ArrayList<String> list1= new ArrayList<>();
	
	public void addd()
	{
		list1.add("dhoni");
		list1.add("jadeja");
		list1.add("ajinkya");
		list1.add("dhawan");
		System.out.println(list1);
		String a= list1.remove(0);
		String b=list1.remove(1);
//		list1.re
//		list1.remove(3);
//		list1.remove(4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(list1);
	}

	
	
}
