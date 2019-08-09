package interview;
class Model{
	
	private String name;
	private String age;
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
	@Override
	public String toString() {
		return "Model [name=" + name + ", age=" + age + "]";
	}
}
class OverRiding
{
	
	public String  add(Model model)
	{
		System.out.println("first method");;
		return model.getName();
	}
	
	
}

class Kyzersoftware extends OverRiding{
	
	@Override
	public String  add(Model model)
	{
		System.out.println("Second method");;
		return model.getName();
	}
}


class A{
	public static void main(String[] args) {
		
		Kyzersoftware kz = new Kyzersoftware();
		
		Model mod = new Model();
		mod.setAge("24");
		mod.setName("Balmukund");
		kz.add(mod);
		
		
		
		
}
}

	
	



