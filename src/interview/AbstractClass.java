package interview;

public class AbstractClass {

	public static void main(String[] args) {
		
		Daughtar g = new Daughtar(5);
		g.a=10;
		System.out.println(g.a);
	}

}
abstract class Mummy
{
	int a;
	
	//constructor can be public or protected

	protected Mummy(int b) {
		super();
		this.a=b;
		System.out.println("--a---"+a);
	}
	
}
class Daughtar extends Mummy  
{

	public Daughtar(int b) {
		super(b);
		// TODO Auto-generated constructor stub
	}


}
