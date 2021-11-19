/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to food App");
		System.out.println("Please create your password :");
	
	   Scanner sc = new Scanner(System.in);
	  
	   String pass1 = sc.next();
	  
	   System.out.println("Your password is now :");
	   System.out.println("Please enter your password :");
	  
	   String pass = sc.next();
	  
	  while(!pass1.equals(pass1))
	  {
	   System.out.println("This is not write password plz try again");
	   
	    pass = sc.next();
	  }
	 
	   System.out.println("Access Granted");
	  
	  System.out.println("Are you hungry Yes or No");
	    
	    String ans1 = sc.next();
	   
	       if( ans1.equals("Yes"))
	       {
	    System.out.println("Choose what you want to eat between pizza,burger or fish");
	  
	    String ans2 = sc.next();
	    }
	        
	     while(!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish"))
	     {
	    System.out.println("Sorry we do not have it what would you like between pizza,burger or fish");
	    
	        ans2 = sc.next();
	      }
	       if(ans2.equals("pizza") || ans2.equals("burger") || ans2.euqals("fish"))
	   {
	    System.out.println("Do you want something drink yes or not");
	    
	       String ans3 = sc.next();
	       
	       while(!ans3.equals("yess") && !ans3.equals("no"))
	       {
	    System.out.println("Wrong command plz try again");
	     
	        ans3 = sc.next();
	       }
	        if(ans3.equals("yes"))
	       {
	    System.out.println("What would you like to drink cock or juice");
	   
	       String ans4 = sc.next(); 
	       }
	        while(!ans4.equals("cock") && !ans4.equals("juice"))
	        {
	     System.out.println("Sorry we do not have it that would between cocke or juice");
	     
	          ans4 = sc.next();
	        }
	         if(ans4.equals("cock") || ans4.equals("juice"))
	         {
	     System.out.println("Great you have ordered"+ans2+"and"+ans4);
	     
	             ans2 = sc.next();
	         }
	      System.out.println("Please confirm your password");
	   
	           pass = sc.next();
	   
	         while(!pass.equals(pass1))
	       {
	     System.out.println("This is not write password plz try again");
	   
	           pass = sc.next();
	       }
	      System.out.println("Thank you your order is on its way");
	   }
	    else
	    {
	      System.out.println("You have ordered"+ans2);
	      
	    }
	      System.out.println("Please confirm your password");
	             
	               pass = sc.next();
        
	           
	    while(!pass.equals(pass1))
	    {
	      System.out.println("This is not write password plz try again");
	       
	             pass = sc.next();
	    }
	}

	     else
	         {
           System.out.println("Alright have a good day"); 
        
	             
	         } 
            } 
          }
         
