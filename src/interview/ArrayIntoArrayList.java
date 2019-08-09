package interview;

import java.util.LinkedList;
import java.util.List;

public class ArrayIntoArrayList {

	public ArrayIntoArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
//	   List<String> list= (List) Arrays.asList('b','a','c');
//	   Collections.sort(list);
//	   System.out.println(list);
//	   
	   
	   List<String> list = new LinkedList<String>(); 
       list.add("Geeks"); 
       list.add("for"); 
       list.add("Geeks"); 
       list.add("Practice"); 
 
       String[] arr = list.toArray(new String[0]); 
 
       for (String x : arr) 
           System.out.println(x + " "); 

	}

}
