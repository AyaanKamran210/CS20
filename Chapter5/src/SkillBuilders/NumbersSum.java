package SkillBuilders;

import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variables
        int num;
        int sum = 0; 
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        System.out.println();
        System.out.println("Numbers:");
        
        // loop to print numbers and add them up
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            sum = sum + i; 
        }
        
        System.out.println("The sum is: " + sum);
        
        input.close();
    }
}



