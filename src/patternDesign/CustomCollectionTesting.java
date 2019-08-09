package patternDesign;

import java.util.ArrayList;
import java.util.List;

public class CustomCollectionTesting {
	
	public static void main(String args[]){
		
		List<String> list = new ArrayList<>();
		
		CustomCollection col= new CustomCollection();
		
		try{
			
			col.add("a");
			System.out.println("a");
			col.add("15");
			System.out.println("15");
			col.add("14.56");
			System.out.println("14.56");
			col.add("12345");
			System.out.println("12345");
			col.add("veena");
			System.out.println("veena");
			col.add("&&^&*^");
			System.out.println("&&^&*^");
			col.add("babu");
			System.out.println("babu");
			col.add("a");
			System.out.println("a");
			col.add("15");
			System.out.println("15");
			col.add("14.56");
			System.out.println("14.56");
			col.add("12345");
			System.out.println("12345");
			col.add("veena");
			System.out.println("veena");
			col.add("&&^&*^");
			System.out.println("&&^&*^");
			col.add("babu");
			System.out.println("babu");
			col.add("a");
			System.out.println("a");
			col.add("15");
			System.out.println("15");
			col.add("14.56");
			System.out.println("14.56");
			col.add("12345");
			System.out.println("12345");
			col.add("veena");
			
			
			
			
			System.out.println("capacity==="+col.capacity());
			
			System.out.println("size=="+col.size());
			
			
			


			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		System.out.println("DATA=="+col);
		
		
		
		
		
		
	}

}
