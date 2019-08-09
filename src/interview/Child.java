package interview;

abstract class Bacchi
{
	int a;
	
	Bacchi(int a)
	{
		System.out.println("abstract class constructor "+a);
		this.a =a;
	}
	
}

public class Child extends Bacchi
{

	Child() 
	{
	super(5);
	System.out.println("default contrs");
		
	}
	
public static void main(String[] args) {
		
		Child chi = new Child();

	}

	
}

