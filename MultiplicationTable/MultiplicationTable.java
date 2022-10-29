package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter any number to get a list of multiplications table of it: ");
            num = scanner.nextInt();

            for (int i = 1; i < 11; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
        }
    }
}
