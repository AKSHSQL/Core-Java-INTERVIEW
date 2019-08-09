package deloitte;

public class MethodHiding extends Parent{

	public static void main(String[] args) {
		
		
		Parent parent = new MethodHiding();
		parent.father();
		parent.mother();

	}
	
	protected static void father()
	{
		System.out.println("----son---");
	}
	
	@Override
	public  void mother()
	{
		System.out.println("----daughter---");
	}

}
class Parent
{
	protected static void father()
	{
		System.out.println("----father---");
	}
	
	protected  void mother()
	{
		System.out.println("----mother---");
	}
}
