package exception.custom;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number");
		int babu=sc.nextInt();
		
		if(babu !=6)
		{
			System.out.println("not equal 6");
		}
		else
		{
			System.out.println("equal to six");
		}
	}

}
