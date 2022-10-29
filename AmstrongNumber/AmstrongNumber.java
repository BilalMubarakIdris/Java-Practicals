package AmstrongNumber;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        int r;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r * r * r;
        }

        if (temp == sum) {
            System.out.println("its an Amstrong Number");
        } else {
            System.out.println("its not an Amstrong Number");
        }
    }
}
