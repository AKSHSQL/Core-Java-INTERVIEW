package interview;

public class InheritanceExample extends Parent11
{

	public static void main(String[] args)
	{
		InheritanceExample m= new InheritanceExample();
		m.show(null);
		m.add(null,null);
		m.demo(null,null);
		m.demo(null,null);

	}
	
	@Override
	public String add(String a,String b)
	{
		System.out.println("---overirede bua--");
		return "";
	}
	
	
	protected String demo(String a,String b)
	{
		System.out.println("---over ride 2- hua-");
		return true;
	}

}
class Parent11
{
	public void show(Object a)
	{
		System.out.println("---Object--");
	}
	
	public void show(String a)
	{
		System.out.println("---String--");
	}
	
	protected String add(String a,String b)
	{
		System.out.println("---Over ride 1--");
		return "";
	}
	
	protected Boolean demo(String a,String b)
	{
		System.out.println("---Parent Overrinding--");
		return true;
	}
	
	
	
}
