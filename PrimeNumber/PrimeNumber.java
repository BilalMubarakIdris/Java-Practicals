package PrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 25;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num + " Is prime number");
        } else {
            System.out.println(num + " Is not prime number");
        }
    }
}
