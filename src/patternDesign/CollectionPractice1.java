package patternDesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionPractice1 {

	public static void main(String[] args) {
		
		
		HumanBeing hb1 = new HumanBeing();
		hb1.setName("BALMUKUND");
		hb1.setAge(24);
		hb1.setColor("fair");
		hb1.setHeight((float) 6.5d);
		
		System.out.println(hb1.getName());
		
		HumanBeing hb2 = new HumanBeing();
		hb2.setName("Kailsah");
		hb2.setAge(24);
		hb2.setColor("fair");
		hb2.setHeight((float) 4.3d);
//		
//		HumanBeing hb3 = new HumanBeing();
//		hb3.setName("third");
//		hb3.setAge(24);
//		hb3.setColor("fair");
//		hb3.setHeight((float) 5.5d);
		
		List<HumanBeing> value= new ArrayList<HumanBeing>();
		
		value.add(hb1);
		
		System.out.println(value);
		value.add(hb2);
//		value.add(hb3);

		
		System.out.println("List "+value);
		
//		for(Object i :value ){
//			
//			System.out.println(i);
//		}
		
		

	}

}
