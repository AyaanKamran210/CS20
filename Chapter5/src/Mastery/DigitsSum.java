/*
  
  Program:DigitsSum.java
  Date: October 15 2026
  
  
  Purpose: Create a DigitsSum application that prompts the user for a non-negative integer and then displays the sum of the digits.
  
  
  
*/
package Mastery;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        int sum = 0;
        
        // loop to strip away and sum each digit
        while (num > 0) {
            int lastDigit = num % 10; // gets the last digit
            sum = sum + lastDigit;    // adds it to total
            num = num / 10;           // chops off the last digit
        }
        
       
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}

/* Screen Dump
  
Enter a positive integer: 892
The sum of the digits is: 19
  
Enter a positive integer: 789
The sum of the digits is: 24

*/

