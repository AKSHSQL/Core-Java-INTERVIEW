package deloitte;

public class Deoitte extends delo{

	public Deoitte(String name) {
		super(name);
	}

	public static void main(String[] args)
	{
		Deoitte d=new Deoitte("bms");
		d.age="24";
		new Deoitte("Angel");
//		System.out.println("--age---"+d.age);
		
	}

}

abstract class delo
{
	private String name;
	String age;

	protected delo(String name) {
		super();
		this.name=name;
		System.out.println("--name--"+name+"  Age--"+age);
	}
	
}
