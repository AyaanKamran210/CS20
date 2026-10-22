package SkillBuilders;

public class SpanishNumbers {

    // This method takes the number and prints out the Spanish word
    public static void showSpanishWord(int number) {
        if (number == 1) {
            System.out.println("uno");
        }
        if (number == 2) {
            System.out.println("dos");
        }
        if (number == 3) {
            System.out.println("tres");
        }
        if (number == 4) {
            System.out.println("cuatro");
        }
        if (number == 5) {
            System.out.println("cinco");
        }
        if (number == 6) {
            System.out.println("seis");
        }
        if (number == 7) {
            System.out.println("siete");
        }
        if (number == 8) {
            System.out.println("ocho");
        }
        if (number == 9) {
            System.out.println("nueve");
        }
        if (number == 10) {
            System.out.println("diez");
        }
    }

    public static void main(String[] args) {
        System.out.println("Counting to 10 in Spanish:");
        
        // Loop runs 10 times from 1 up to 10
        for (int i = 1; i <= 10; i++) {
            showSpanishWord(i); // Sending the current loop number to the method
        }
    }
}
