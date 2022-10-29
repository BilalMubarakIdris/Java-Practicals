package InsertValuesMultiDimentionArray;

import java.util.Scanner;

public class InsertValuesMultiDimentionArray {
    public static void main(String[] args) {
        int arraySize;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            arraySize = sc.nextInt();

            int myArray[] = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                System.out.print("Enter a value inside the array: ");
                myArray[i] = sc.nextInt();
            }

            System.out.println("Elements in the array are: ");
            for (int i = 0; i < arraySize; i++) {
                System.out.println(myArray[i]);
            }
        }

    }
}
