package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

    public static void main(String[] args) {
        //Create a scanner to get input from the keyboard
        Scanner input = new Scanner(System.in);
        
        //Ask the user for the wind speed
        System.out.println("Enter the wind speed in mph:");
        int speed = input.nextInt();
        
        //Check the speed using if-else structures
        if (speed < 74) {
            System.out.println("Not a hurricane.");
        } 
        else if (speed <= 95) {
            System.out.println("Category 1");
        } 
        else if (speed <= 110) {
            System.out.println("Category 2");
        } 
        else if (speed <= 129) {
            System.out.println("Category 3");
        } 
        else if (speed <= 156) {
            System.out.println("Category 4");
        } 
        else {
            System.out.println("Category 5");
        }
        
    }
}
