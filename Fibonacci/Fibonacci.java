package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int k, a = 1, b = 1;
        try (Scanner sc = new Scanner(System.in)) {
            k = 0;
            System.out.print("Enter any number to generate a Fibonacci series ");
            int n = sc.nextInt();
            System.out.print("1 1 ");
            while (k <= n) {
                k = a + b;
                System.out.print(k + " ");
                a = b;
                b = k;

            }
        }
    }
}
