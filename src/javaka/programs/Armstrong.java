package javaka.programs;

import java.util.Scanner;

public class Armstrong {
	
	 public static void main(String[] args)
	 {  
		 Scanner sc = new Scanner(System.in);
			
		 System.out.println("Enter the Number"); 
		 
		  String UserInput=sc.nextLine();
		  int bms =UserInput.trim().length();
		  
		  
		  if(bms !=6)
			{
				System.out.println("not equal 6");
			}
			else
			{
				System.out.println("equal to six");
			}
		
//		    int calculate=0,a,temp;  
		   
		    /*temp=UserInput;  
		    
		    while(UserInput>0)  
		    {  
				    a=UserInput%10; 
				    System.out.println("Value of a "+a); 
				    
				    System.out.println("Initial Value of UserInput "+UserInput); 
				    UserInput=UserInput/10; 
				    System.out.println("Value of UserInput "+UserInput); 
				    
				    calculate=calculate+(a*a*a);  
				    System.out.println("calculate=="+calculate);
		    }  
		    if(temp==calculate) 
		    	
		    System.out.println("armstrong number");   
		    else  
		    	
		        System.out.println("Not armstrong number"); */  
		   }  

}
