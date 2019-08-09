package interview;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualMethod
{

	 static public void  main(String[] args) 
	{
//		HashCodeAndEqualMethod.checking();
		
		HashCodeAndEqualMethod mm= new HashCodeAndEqualMethod();
		mm.checking();
	}
	
	public void checking()
	{
		Employee emp1= new Employee("a","18","b");
		Employee emp2= new Employee("a","19","b");
		Employee emp3= new Employee("a","18","c");
		
		
		Map<Employee,String>  map=new HashMap<>();
		map.put(emp1, "Jack");
		map.put(emp2, "Bms");
		map.put(emp3, "Balu");
		
		System.out.println("---size of map---"+map.size());
		
		for(Map.Entry<Employee,String> m :map.entrySet())
		{
			System.out.println("---Key---"+m.getKey()+"    Value----"+m.getValue());
		}
		
		
	}

}

class Employee 
{
	String name;
	String age;
	String Salary;
	 
	
	
	public Employee(String name, String age, String salary) {
		super();
		this.name = name;
		this.age = age;
		Salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Salary == null) ? 0 : Salary.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		
		System.out.println("--hash code--"+result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Salary == null) {
			if (other.Salary != null)
				return false;
		} else if (!Salary.equals(other.Salary))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}

