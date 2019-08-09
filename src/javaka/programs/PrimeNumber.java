package javaka.programs;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the Number"); 
		 System.out.println();
		  int i,m=0,flag=0;      
		  int n=sc.nextInt();
		  System.out.println("Value of n=="+n);
		  m=n/2;   
		  System.out.println("Value of m=="+m);
		  
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
				   for(i=2;i<=m;i++)
				   {   
					   System.out.println("Value of n=="+n);
					   System.out.println("Value of i=="+i);
					    if(n%i==0)
					    {      
					     System.out.println(n+" is not prime number");      
					     flag=1;      
					     break;      
					    }      
				   } 
				   System.out.println("Break 1111111111111"); 
					   if(flag==0) 
					   { 
						   System.out.println(n+" is prime number");
						   }  
		  }//end of else 
		 
		  System.out.println("Break"); 
	}

}
