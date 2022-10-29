package array;
import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        int myArray[];
        myArray = new int[2];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first element");
            myArray[0] = scanner.nextInt();
            System.out.println("Enter the first element");
            myArray[1] = scanner.nextInt();
        }
        System.out.println("the value of the array is: " + myArray[0] +" and " + myArray[1]);
    }
}
