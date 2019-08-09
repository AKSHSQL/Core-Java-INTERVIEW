package interview;

public class InheritanceExample extends Parent11
{

	public static void main(String[] args)
	{
		InheritanceExample m= new InheritanceExample();
		m.show(null);
		m.add(null,null);
		m.demo(null,null);
		m.demo(null,null,null);

	}
	
	@Override
	public String add(String a,String b)
	{
		System.out.println("---overirede bua--");
		return "";
	}
	
	protected String demo(String a,String b,String c)
	{
		System.out.println("---over ride 2- hua-");
		return "";
	}

}
class Parent11
{
//	public void show(Integer a)
//	{
//		System.out.println("---Integer--");
//	}
	
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
	
	protected String demo(String a,String b)
	{
		System.out.println("---Parent Overrinding--");
		return "";
	}
	
	
	
}
