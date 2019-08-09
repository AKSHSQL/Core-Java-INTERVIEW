package javaka.programs;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args)
	 {  
		 Scanner sc = new Scanner(System.in);
		
			
		 System.out.println("Enter size of array "); 
		 
		  int UserInput=sc.nextInt();
		  int a[] = new int[UserInput];
		  
		  for(int i=0;i<UserInput;i++)
		  {
			  System.out.println("Enter the Numbers"); 
			  a[i]= sc.nextInt();
			  
		  }
		  
		  
		  
		  for(int i=0;i<UserInput ;i++)
		  {
			  if(a[i]>a[i+1])
			  {
				  
				  
			  }
			  else
			  {
				  int temp =a[i];
				  a[i]=a[i+1];
				  a[i+1] = temp;
				  
				  System.out.println("Numbers=@=i====>>"+i+"         "+a[i]); 
			  }
		  }
		  for(int i=0;i<UserInput;i++)
		  {
			  System.out.println("Array the Numbers=="+ a[i]); 
			 
			  
		  }
		  
		  
		  
		
		    
		   }  

}
