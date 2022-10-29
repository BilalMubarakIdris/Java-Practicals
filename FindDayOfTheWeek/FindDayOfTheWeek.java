package FindDayOfTheWeek;

import java.util.Scanner;

public class FindDayOfTheWeek {
    public static void main(String[] args) {
        int day;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "\n(1) Monday \n(2) Tuesday \n(3) Wednesday \n(4) Thursday \n(5) Friday \n(6) Saturday \n(7) Sunday");
            System.out.print("Choose a number to display the name of the day: ");
            day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please choose the correct number of days");
            }
        }

    }
}
