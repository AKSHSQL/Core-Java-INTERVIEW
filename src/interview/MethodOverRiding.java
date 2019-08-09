package interview;

import java.io.*;

class Parent
{
	public void getMethod()throws ArrayIndexOutOfBoundsException
	{
		System.out.println("IOExceptionMeraaaaaaaaaaaaaa");
	}
	
	protected int  Parent(int b)
	{
		System.out.println("Parent Constructor "+b);
		return b;
		
	}
	
	public float getInterest(float a) {
		System.out.println("Parent =="+a);
		return 0.0f;
	}

}

public class MethodOverRiding extends Parent{
	
	@Override
	public void getMethod()throws RuntimeException
	{
		
		System.out.println("NullPointerExceptionMEraaaaaaaaaaaaaaaaa ");
	}
	
	@Override
	public int  Parent(int b)
	{
//		super.Parent(100);
		System.out.println("Child Constructor "+b);
		return b;
		
	}
	
	@Override
	public float getInterest(float a)
	{
//		super.getInterest(a);
		System.out.println("SBI =="+a);
		
		return a;
	}
	
	
	public static void main(String[] args) {
		
		MethodOverRiding m = new MethodOverRiding();
		m.getInterest(7.5f);
		m.Parent(5);
		
		
		m.getMethod();
	}

}
