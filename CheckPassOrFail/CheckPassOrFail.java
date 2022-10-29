package CheckPassOrFail;

import java.util.Scanner;

public class CheckPassOrFail {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter you total mark");
            int total = scanner.nextInt();

            if (total >= 35) {
                System.out.println("You Passed");
            } else {
                System.out.println("You Failed");
            }
        }
    }
}
