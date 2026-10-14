package SkillBuilders;

public class Evens {

    public static void main(String[] args) {
       
        System.out.println("Even numbers between 1 and 20:");
        System.out.println("-----------------------------");

        // Loop starting at 2, running while i is less than or equal to 20, counting by 2s
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
