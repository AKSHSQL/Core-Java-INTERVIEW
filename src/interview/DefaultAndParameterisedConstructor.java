package interview;

public class DefaultAndParameterisedConstructor{

	public static void main(String[] args) {
		
		A a = new Bb();

	}

}
class A{
	
	public A(int a){
		System.out.println("A");
	}
}

class Bb extends A{
	
	public Bb(){
		super();   //Note Error will occur here , since default constructor is not present              
		System.out.println("B");
	}
}

/*Note: If there is no default and paramaterised construtor in the class ,
 *Object will create coz compiler will provide default construtor
 *
 *
 *But if there is paramaterised construtor in the class and No default construtor then
 * Abc a = new Abc();  will give error this time u to have manually provide default constructor
 * */
	
