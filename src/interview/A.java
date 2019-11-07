package interview;

public class A {
	
	public static void main(String a[]){
		
		A aa= new A();
		System.out.println(aa.test());  // 3
		aa.display(5);                  //long called
		
	}
	
	@SuppressWarnings("finally")
	public int test(){
		
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	public void display(Integer i){
		System.out.println("Integer called");
	}
	
	public void display(long i){
		System.out.println("long called");
	}

}
