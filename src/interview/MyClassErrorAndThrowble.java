package interview;

import java.util.ArrayList;
import java.util.List;

public class MyClassErrorAndThrowble extends Child{

	public static void main(String[] args)
	{
		
	 try{
			int a=10;
			int b=0;
//			int c=a/b;
		}
	    /*Working Possibility without Throwable
	     * catch(Exception e)
	     * catch(RuntimeException e)
	     * catch(Error | Exception e)
	     * catch(Exception | Error e)
	     * catch(Throwable e)  // It wont require ANY combination with any one.
	     * catch(Child Exception | Child Exception e) 
	        i.e  catch(ArithmeticException | NullPointerException | NumberFormatException e)
	     * 
	     * Compile Time Error Possibility
	     * catch(IOException e)
	     * catch(SQLException e)
	     * catch(FileNotFoundException e)
	     * catch(Throwable | Error e)
	     * catch(Error | Throwable e)
	     * catch(RuntimeException | Exception e)
	     * 
	     * 
	     * catch(FileNotFoundException | IOException e)
	     * catch(FileNotFoundException | FileAlreadyExistsException | IOException e)
	     * 
	     * */
	    catch(ArithmeticException | NullPointerException | NumberFormatException e)
		{
		 
		}
	    catch(Throwable e){
	    	System.out.println("--Catch---"+e.getStackTrace());
			System.out.println("--MEssage---"+e.getMessage());
	    }
	 }
	 
}


