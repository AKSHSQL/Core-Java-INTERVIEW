package interview;

public class TryWithCatchAndReturn {

	public static void main(String[] args) {
		
		TryWithCatchAndReturn t = new TryWithCatchAndReturn();
		System.out.println(t.getNmberFinally());
		System.out.println();
		System.out.println(t.getNumberTry());

	}
	
	@SuppressWarnings("finally")
	public int getNmberFinally(){
		
		int a=0;
		
		try
		{
			System.out.println("try");
//			throw new Exception("try phata");
			a=1;
			return a;
			
		}catch(Exception e)
		{
			System.out.println("catch");
			a=2;
			return a;
		}finally
		{
			System.out.println("Finally");
			a=3;
			return a;
		}
	}
	
	
	public String getNumberTry(){
		
		String a=null;
		
		try
		{
			System.out.println("try");
			return a="try111";
			
		}catch(Exception e)
		{
			System.out.println("catch");
			return a="catch111";
		}
	}
	
	

}
