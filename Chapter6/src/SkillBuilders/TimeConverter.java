package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Print the menu for the user
        System.out.println("Welcome to the Time Converter!");
        System.out.println("1 - Hours to Minutes");
        System.out.println("2 - Days to Hours");
        System.out.println("3 - Minutes to Hours");
        System.out.println("4 - Hours to Days");
        System.out.print("Pick an option (1-4): ");
        
        int choice = reader.nextInt();
        
        // Hours to Minutes
        if (choice == 1) {
            System.out.print("Enter hours: ");
            double hours = reader.nextDouble();
            double ans = hours * 60;
            System.out.println("That is " + ans + " minutes.");
        }
        
        // Days to Hours
        if (choice == 2) {
            System.out.print("Enter days: ");
            double days = reader.nextDouble();
            double ans = days * 24;
            System.out.println("That is " + ans + " hours.");
        }
        
        // Minutes to Hours
        if (choice == 3) {
            System.out.print("Enter minutes: ");
            double mins = reader.nextDouble();
            double ans = mins / 60;
            System.out.println("That is " + ans + " hours.");
        }
        
        // Hours to Days
        if (choice == 4) {
            System.out.print("Enter hours: ");
            double hours = reader.nextDouble();
            double ans = hours / 24;
            System.out.println("That is " + ans + " days.");
        }
        
        // If they pick something else
        if (choice < 1 || choice > 4) {
            System.out.println("Wrong choice. Try again!");
        }
        
        reader.close();
    }
}

