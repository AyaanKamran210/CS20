package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

    // This method calculates the first number raised to the power of the second
    public static double powerOf(double base, int exponent) {
        double result = 1.0;
        
        // Multiply the base number by itself exponent times
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        
        return result; // Send the final answer back
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Exponent Calculator ---");
        
        // Ask the user for the two numbers
        System.out.print("Enter the base number: ");
        double userBase = input.nextDouble();
        
        System.out.print("Enter the power (exponent): ");
        int userExponent = input.nextInt();
        
        // Call our method and store the answer
        double answer = powerOf(userBase, userExponent);
        
        // Print out the final answer
        System.out.println(userBase + " raised to the power of " + userExponent + " is: " + answer);
        
        input.close();
    }
}
