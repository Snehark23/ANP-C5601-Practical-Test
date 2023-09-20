//write a program of switchcase in java
package Lms;
import java.util.*;

public class SwitchCase {
	


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of Student");
		String name=sc.next();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		String grade=null;
		
		switch(marks) {
		 
	      case 1:
	        		grade = "A";
	 	           break;
	        	
	        case 2:
	           grade = "B";
	           break;
	        
	        case 3:
	           grade = "C";
	           break;
	        
	        case 4:
	           grade = "D";
	           break;
	        
	        case 5:
	           grade = "E";
	           break;
	        // for < 50
	        default:
	           grade = "F";
	           break;
	      }
	      
	      
	      System.out.println("Your Grade is  = " + grade);
	
	}
}

