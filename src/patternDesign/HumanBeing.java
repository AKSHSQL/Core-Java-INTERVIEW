package patternDesign;

public class HumanBeing {
	
	private String name;
	private int age;
	private String color;
	private Float height;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "HumanBeing [name=" + name + ", age=" + age + ", color=" + color + ", height=" + height + "]";
	}
	
	

}
