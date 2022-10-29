package FerfectNumber;

public class FerfectNumber {
    public static void main(String[] args) {
        int num = 27, sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println("is Ferfect Number");
        } else {
            System.out.println("is not Ferfect Number");
        }
    }
}
