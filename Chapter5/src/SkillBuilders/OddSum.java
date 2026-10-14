package SkillBuilders;

import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variables
        int num;
        int sum = 0; 
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        // check each number to see if it's odd
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i; // add it to the total
            }
        }
        
        System.out.println("The sum of the odd numbers is: " + sum);
        
        input.close();
    }
}


