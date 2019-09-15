package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayIntoArrayList {

	public static void main(String[] args) {
		
//--------- Convert Array into List-----------------------------------------------
	   String cricketer[]= {"Sachin","Dravid","Rahul","Yuvraj","Amit","Bunty"};
		
	   List<String> arrayToList= Arrays.asList(cricketer);
	   Collections.sort(arrayToList);   // sort method is return type void
	   System.out.println(arrayToList);
	   System.out.println();
	   
	   
	   
//--------- Convert List into Array----------------------------------------------- 
       String[] arr = arrayToList.toArray(new String[0]); 
 
       int index=0;
       for (String x : arr) 
       {
    	   System.out.println(x + "-----"+index);
    	   index++;
       }
	}

}
