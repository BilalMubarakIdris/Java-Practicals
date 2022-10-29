package ProductDiscountCalculation;

import java.util.Scanner;

/*
The mathematical formula for calculating the discounted price is as follows:

Discounted_price = current_price - (current_price * discount_percentage)/100
*/

public class ProductDiscountCalculation {
    public static void main(String[] args) {
        int ticket_price[] = { 100, 150, 500, 20 };
        int discount_price[] = new int[ticket_price.length];
        int discounted_price;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the discount amount: ");
            discounted_price = sc.nextInt();

            for (int i = 0; i < ticket_price.length; i++) {
                discount_price[i] = ticket_price[i] - (ticket_price[i] * discounted_price) / 100;
            }

            for (int i = 0; i < discount_price.length; i++) {
                System.out.println(discount_price[i]);
            }
        }

    }
}
