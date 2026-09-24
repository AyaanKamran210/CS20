package Mastery;

import java.util.Scanner;

/**
 * FastFoodOrder.java
 * Calculates food subtotals, tax, final total, and change.
 */
     public class FastFoodOrder {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prices from the textbook
        final double BURGER_PRICE = 1.69;
        final double FRIES_PRICE = 1.09;
        final double SODA_PRICE = 0.99;
        final double TAX_RATE = 0.06531; 

        // 1. Inputs
        System.out.print("Enter the number of burgers: ");
        int numBurgers = input.nextInt();
        
        System.out.print("Enter the number of fries: ");
        int numFries = input.nextInt();
        
        System.out.print("Enter the number of sodas: ");
        int numSodas = input.nextInt();

        // 2. Processing
        double subtotal = (numBurgers * BURGER_PRICE) + (numFries * FRIES_PRICE) + (numSodas * SODA_PRICE);
        double tax = subtotal * TAX_RATE;
        double finalTotal = subtotal + tax;

        // 3. Outputs
        System.out.printf("Total before tax: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Final total: $%.2f\n", finalTotal);
        System.out.println(); 

        // Part 2 Prompt: Tendered cash
        System.out.print("Enter amount tendered: $");
        double amountTendered = input.nextDouble();
        
        double changeDue = amountTendered - finalTotal;
        System.out.printf("Change: $%.2f\n", changeDue);
        
        input.close();
    }
}

