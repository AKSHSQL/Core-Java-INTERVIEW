package interview;

class Parent {
	
	/*  If the superclass method does not declare an exception,
	    subclass overridden method cannot declare the checked exception but
	    can declare unchecked exception.
	*/
	public void saveData(){
		System.out.println("parent");
	}
	
	/*  If the superclass method declares an exception, subclass overridden method can declare same,
	 *  subclass exception or no exception but cannot declare parent exception.
	 */
	public void getMethod() throws ArrayIndexOutOfBoundsException {
		System.out.println("-----ArrayIndexOutOfBoundsException--In Parent");
	}
	
	/*In static method ,restriction in child class even though it is not overriding, It is method Hiding (Compiler say It is Inherited Methods)
	 * Things u cannot do:--
	 *  Parent      |    Child
	 *------------------------------------------------------------------
	 *  public      |    protected,private     Note: Compile Time Error
	 *  protected   |    private               Note: Compile Time Error
	 *  static      |    non -static           Note: Compile Time Error
	 * */
	public static void addNumber(){
		System.out.println("---Parent--addNumber--");
	}
	
	protected static void multiplyNumber(){
		System.out.println("---Parent--multiplyNumber--");
	}
}

public class MethodOverRidingWithException extends Parent {
	
	// while overriding only unchecked exception are allowed here  ,dont write checked exception IOException,SQLException
	@Override 
	public void saveData() throws NullPointerException {
		System.out.println("parent");
	}
	
	//Same, SubClass Exception ,  No exception are allowed here
	@Override
	public void getMethod() throws RuntimeException {

		System.out.println("RuntimeException--child----");
	}
	
// In static method u cannot make protected here, It should be public only	
	public static void addNumber(){
		System.out.println("--addNumber--Child----");
	}
	
	protected static void multiplyNumber(){
		System.out.println("---multiplyNumber----child----");
	}
	

	public static void main(String[] args) {

		Parent m = new MethodOverRidingWithException();
		m.getMethod();
		m.saveData();
		m.addNumber();
		m.multiplyNumber();
		
	}

}
