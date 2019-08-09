package interview;

import java.util.Scanner;

public class Programmme {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = sc.nextInt();
		if(input%2==1 || input%3==1 ||input%5==1 )
		{
			System.out.println("PRime number");
		}
		else{
			
			System.out.println("not prime");
		}

		sc.close();
	}

}
