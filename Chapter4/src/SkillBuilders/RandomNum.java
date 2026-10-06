package SkillBuilders;

import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {
        //Create the scanner for input
        Scanner input = new Scanner(System.in);
        
        //Ask the user for the lowest and highest numbers
        System.out.println("Enter the minimum number:");
        int min = input.nextInt();
        
        System.out.println("Enter the maximum number:");
        int max = input.nextInt();
        
        //Textbook math formula to get a random integer in a specific range
        int randomNum = (int)((max - min + 1) * Math.random() + min);
        
        //Print out the final answer
        System.out.println("Your random number is: " + randomNum);
        
    }
}
