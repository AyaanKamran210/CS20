package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        //Setup scanner for keyboard input
        Scanner input = new Scanner(System.in);
        
        //Ask the user for a number
        System.out.println("Enter an integer:");
        int num = input.nextInt();
        
        //Find the square root using Math.sqrt
        double root = Math.sqrt(num);
        
        //Convert it to a whole integer (this cuts off any decimal part)
        int wholeRoot = (int) root;
        
        //Check if squaring it brings us back to the original number
        if (wholeRoot * wholeRoot == num) {
            System.out.println("The number is a perfect square.");
        } else {
            System.out.println("The number is NOT a perfect square.");
        }
        
    }
}
