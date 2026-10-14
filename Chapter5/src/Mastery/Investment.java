/*

Program: Investment.java
Date: October 14 2026


 Purpose:Create an Investment application that calculates how many years it will take for a $2,500 investment to be worth at least $5,000 if compounded annually at 7.5%



*/
package Mastery;

public class Investment {

	public static void main(String[] args) {
        
        // start values from the question
        double money = 2500.0;
        int years = 0;
        
        // keep looping until the money hits 5000 or more
        while (money < 5000.0) {
            money = money + (money * 0.075); // adds 7.5% interest each year
            years = years + 1;               // count the year
        }
        
        System.out.println("It will take " + years + " years.");
        System.out.println("The final value will be: $" + money);
    }
}

/* Screen Dump

It will take 10 years.
The final value will be: $5152.578905411779



*/