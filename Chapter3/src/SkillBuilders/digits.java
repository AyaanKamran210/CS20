package SkillBuilders;

import java.util.Scanner;

public class digits 
{
	
	public static void main(String[] args)
	{
       //Declare variables
		int number, onePlace, tensPlace;
		
		//Create a Scanner object
				Scanner userinput = new Scanner(System.in);
	 
	  //Ask the user to enter two digit number
	  System.out.println("Enter two digit number");
	 
	 //Record what the user entered
	 number = userinput.nextInt();
	
    //Ones Place
	onePlace = number % 10;
	
    //Tens Place
	tensPlace = number / 10;
	
	//Display the ones and tens digits
	System.out.println("The tens-digit is");
	
	
	
	
	}
	
}
	
	
	
	
	

			
	
