package EligibilityTest;

import java.util.Scanner;

public class EligibilityTest {
    public static void main(String[] args) {
        int age, x;
        int height;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            x = 16 - age;
            System.out.print("Enter height: ");
            height = sc.nextInt();

            if (age > 16) {
                if (height > 167) {
                    System.out.println("You are qualified to play");
                } else {
                    System.out.println("You are not qualified to play");
                }
            } else {
                System.out.println("You are not qualified as of now, come back after " + x + " years");
            }
        }
    }

}
