package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int area;
		int width;
		int perimeter;
		
		//Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the width
		System.out.print("Enter the width: ");
		
		//ayaan
		
		//Get the width value from the user
		width = userinput.nextInt();
		
		//Ask the user to enter the length
		System.out.print("Enter the length: ");		
		
		//Get the length value from the user
		length = userinput.nextInt();		
		
		
		//Display the width and length on the console
		System.out.println("The width is: " + width);
		System.out.print("The length is: " + length);
		
	    //Calculate the area
		area = length * width;
		
		//display the area on the screen
		System.out.println("Area ="+ area);
		
		//Calculate the perimeter
		perimeter = (2 * length + 2 * width);
	    
    	//display the area on the screen
        System.out.println("perimeter = "+ perimeter);
		
		
		
		
	}

}
