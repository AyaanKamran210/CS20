package Mastery;

import java.util.Scanner;

/**
 * PizzaCost.java
 * Chapter 4, Exercise #2
 * Calculates the total cost of making a pizza based on its diameter.
 */
    public class PizzaCost {

    public static double calculateCost(double diameter) {
        final double LABOUR_COST = 0.75;
        final double RENT_COST = 1.00;
        double materialsCost = 0.05 * diameter * diameter;
        
        return LABOUR_COST + RENT_COST + materialsCost;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the diameter of the pizza in inches: ");
        double diameter = input.nextDouble();
        
        double totalCost = calculateCost(diameter);
        
        System.out.printf("The cost of making the pizza is $%.2f\n", totalCost);
        
        input.close();
    }
}
