package interview;

public class Singleton {
	
	private Singleton() {
		super();
		System.out.println("---Singleton--Object Created-");
	}
	
	private static Singleton singleton=null;
	
	public static Singleton getInstance(){
		
		if(singleton==null)
			singleton = new Singleton();
		
		return singleton;
	}

	public static void main(String[] args) {

		System.out.println("---Singleton-1--"+getInstance());
		System.out.println("---Singleton-2--"+getInstance());
		System.out.println("---Singleton-3--"+getInstance());
		System.out.println("---Singleton-4--"+getInstance());
		
	}

}
