package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindDuplicateAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Object,Object> mapDupli = new HashMap<Object,Object>();
		
		
		List<String> list = new ArrayList<>();
		list.add("RAHUL");
		list.add("ajinkya");
		list.add("RAHUL");
		list.add("Dhoni");
		list.add("Dhoni");
		list.add("Jadeja");
		list.add("Abcd");
		list.add("Jadeja");  // It never ignore Uppercase or lowercase
		System.out.println("List Size "+list.size()); 
//		for(String i :list)
//		{
////			System.out.println("Adding value in ServiceApna==>"+i);
//			sa.add(i);
//		}
		
		ServiceApna<String> sa = new ServiceApna<>(list);
		
		System.out.println("Set Size "+sa.sizeApna());
		System.out.println();
		int count =list.size()-sa.sizeApna();
		
		System.out.println("Duplicate Records "+count);
		System.out.println();

		
		mapDupli = sa.getDuplicateData();
		System.out.println("mapDupli---"+mapDupli);
		
		for(Map.Entry<Object,Object> mapping :mapDupli.entrySet())
		{
			System.out.println(mapping.getKey()+ "    "+mapping.getValue());
		}
	}
}


class ServiceApna<T>
{
	private final static  Object PRESENT = new Object();
	
	private transient HashMap<Object,Object> map;
	
	HashMap<Object,Object> mappu = new HashMap<Object,Object>();
	
	
	//Contructor 
	public  ServiceApna()
	{
		map = new HashMap<>();
	}
	
	public ServiceApna(List<String> list) {
		// TODO Auto-generated constructor stub
	}

	public boolean add(Object o)
	{
		if(map.put(o,PRESENT)==null)
		{
			return	true;
		}
		
		else
		{
			System.out.println("map.put(o,PRESENT)!!!!!=null   "+o);
			mappu.put(o,o);
			return	false;
		}
			
	}
	
	
	public int sizeApna()
	{
		return	map.size();
	}
	
	public HashMap<Object,Object> getDuplicateData()
	{
		return mappu;
	} 
	
	public Iterator<Object> iterator()
	{
		return map.keySet().iterator();
	}
	
	
	







}



