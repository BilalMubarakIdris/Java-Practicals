package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int intArray[];
        intArray = new int[1];

        // while(i < intArray.length) {
        //     intArray[i] = i + 1;
        //     i++;
        // }
        do{
            intArray[i] = i + 1;
            i++;
        }while(i < intArray.length);

        System.out.println("Value of Array are " + intArray[i] + " " + intArray[1]);

    }
}
