/*
 
 Program: PrintingApplication.java
 Date: October 13 2026

 
 Purpose: Create a Printing application that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.
 
 
 
 */

package Mastery;

import java.util.Scanner;

public class PrintingApplication {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter the number of copies to be printed: ");
        int copies = reader.nextInt();
        
        double pricePerCopy = 0.0;
        
        // Process tiers with if-else
        if (copies >= 0 && copies <= 99) {
            pricePerCopy = 0.30;
        } else if (copies >= 100 && copies <= 499) {
            pricePerCopy = 0.28;
        } else if (copies >= 500 && copies <= 749) {
            pricePerCopy = 0.27;
        } else if (copies >= 750 && copies <= 1000) {
            pricePerCopy = 0.26;
        } else if (copies > 1000) {
            pricePerCopy = 0.25;
        }
        
        // Calculate total
        double totalCost = copies * pricePerCopy;
        
        // Output results
        System.out.println("Price per copy is: $" + pricePerCopy);
        System.out.println("Total cost is: $" + Math.round(totalCost * 100.0) / 100.0);
    }
}

/* Screen Dump


Enter the number of copies to be printed: 10
Price per copy is: $0.3
Total cost is: $3.0


Enter the number of copies to be printed: 130
Price per copy is: $0.28
Total cost is: $36.4




*/