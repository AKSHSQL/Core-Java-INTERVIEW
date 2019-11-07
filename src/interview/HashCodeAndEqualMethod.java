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
		mm.stringCheck();
	}
	
	public void checking()
	{
		Employee emp1= new Employee("a","18","b");
		Employee emp2= new Employee("a","19","b");
		Employee emp3= new Employee("a","18","b");
		
		
		Map<Employee,String>  map=new HashMap<>();
		map.put(emp1, "Before"); //--hash code--172891
		map.put(emp1, "After"); //--hash code--172891
		map.put(emp2, "Balu"); //--hash code--172922
		map.put(emp3, "Bms"); //--hash code--172891
		
//		Note: Without overriding hashcode() and equal()
		// Size without overriding is 3
		/*---Key---Employee [name=a, age=18, Salary=b]    Value----Bms
		  ---Key---Employee [name=a, age=18, Salary=b]    Value----After
          ---Key---Employee [name=a, age=19, Salary=b]    Value----Balu
        */
		
//		Note: With overriding hashcode() and equal()
		// Size without overriding is 2
		/*---Key---Employee [name=a, age=18, Salary=b]    Value----Bms
          ---Key---Employee [name=a, age=19, Salary=b]    Value----Balu
        */

		System.out.println("---size of map---"+map.size()); 
		for(Map.Entry<Employee,String> m :map.entrySet())
		{
			System.out.println("---Key---"+m.getKey()+"    Value----"+m.getValue());
			
		}
		
		
	}
	
	public void stringCheck()
	{
		String s1="Germany";
		String s2=new String("Germany");
		String s3=new String("Germany");
		
		Map<String,String>  map=new HashMap<>();
		map.put(s1,"Amit");
		map.put(s2,"Bat");
		map.put(s3,"Chetan");
		map.put(s1,"Dinesh");
		System.out.println(map); //{Germany=Dinesh}
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	
	
	
}

