package SkillBuilders;

import java.util.Scanner;

public class Delivery {
   public static void main(String[] args) {
       //Setup the scanner for keyboard input
       Scanner input = new Scanner(System.in);
      
       //Ask the user for the package statistics
       System.out.println("Enter the package weight:");
       double weight = input.nextDouble();
      
       System.out.println("Enter the package length:");
       double length = input.nextDouble();
      
       System.out.println("Enter the package width:");
       double width = input.nextDouble();
      
       System.out.println("Enter the package height:");
       double height = input.nextDouble();
      
       //Simple textbook conditional checks for rejection rules
       if (weight > 20) {
           System.out.println("Rejected: Too heavy.");
       }
       else if (length > 10) {
           System.out.println("Rejected: Too large.");
       }
       else if (width > 10) {
           System.out.println("Rejected: Too large.");
       }
       else if (height > 10) {
           System.out.println("Rejected: Too large.");
       }
       else {
           System.out.println("Accepted.");
       }
      
   }
}
