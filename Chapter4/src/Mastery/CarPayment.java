/*

 Program: CarPayment.java
 Date: October 8 2026
 
 
 Purpose: Create a CarPayment application that calculates a monthly car payment after prompting the user for the principal owing (P), the interest rate (r) and the number of monthly payments (m).
 
 
 
 */

package Mastery;

import java.util.Scanner;

public class CarPayment {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Get user inputs
        System.out.print("Principal: ");
        double principal = reader.nextDouble();
        
        System.out.print("Interest Rate: ");
        double interestRate = reader.nextDouble();
        
        System.out.print("Number of monthly payments: ");
        int months = reader.nextInt();
        
        // Do the math formula
        double ratePerMonth = interestRate / 12;
        double bottomPart = 1 - Math.pow(1 + ratePerMonth, -months);
        double monthlyPayment = (principal * ratePerMonth) / bottomPart;
        
        //Print the output (rounded to 2 decimal places manually)
        System.out.println("The monthly payment is $" + Math.round(monthlyPayment * 100.0) / 100.0);
    }
}

/* Screen Dump
 
 Principal: 20000
Interest Rate: .07
Number of monthly payments: 48
The monthly payment is $478.92


Principal: 120000
Interest Rate: .09
Number of monthly payments: 72
The monthly payment is $2163.06




*/