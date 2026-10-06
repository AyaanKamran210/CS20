package Mastery;

import java.util.Scanner;

public class GradeConverter {

    public static boolean isValidNumber(int userNum, int minNum, int maxNum) {
        
    	if (minNum <= userNum && userNum <= maxNum) {
            return true;
        } else {
            return false;
        }
    }

    public static String getLetterGrade(int numGrade) {
        if (numGrade < 60) {
            return "F";
        } else if (numGrade < 70) {
            if (numGrade == 69) {
                return "D+";
            } else {
                return "D";
            }
        } else if (numGrade < 80) {
            if (numGrade == 79) {
                return "C+";
            } else {
                return "C";
            }
        } else if (numGrade < 90) {
            return "B";
        } else if (numGrade < 100) {
            return "A";
        } else {
            return "A+";
        }
    }

    public static void main(String[] args) {
        final int FLAG = -1;
        final int minValue = 0;
        final int maxValue = 100;

        int numericGrade;
		 String letterGrade;
		 
		 //Prepare for input
		 Scanner input = new Scanner(System.in);
		 
		 //get use input
		 System.out.println("Enter a numeric grade (-1 to quite): ");
		 
		 //record user input in numeric grade
		 numericGrade  = input.nextInt();
		 
		 while(numericGrade !=FLAG)
		 {
			 if(isValidNumber(numericGrade, minValue, maxValue))
			 {
				 letterGrade = getLetterGrade(numericGrade);
				 System.out.println("the grade"
						             + numericGrade
						             + " is a(n)"
						             + letterGrade
						             + "."
						             );	
            } else {
                System.out.println("Grade entered is not valid.");
            }

            // Continuous prompt positioned at the end of the loop block
            System.out.print("Enter a numeric grade (-1 to quit): ");
            numericGrade = input.nextInt();
        }

        input.close();
    }
}
