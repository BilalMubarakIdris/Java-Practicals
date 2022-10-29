package Palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int number = 123;
        int remainder, temp, sum = 0;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            sum = (sum * 10) + remainder;
        }
        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
