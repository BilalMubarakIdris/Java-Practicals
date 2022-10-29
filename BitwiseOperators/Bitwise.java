package BitwiseOperators;

public class Bitwise {
    public static void main(String[] args){
        // Binary Literal in java
        int x  = 0B101; // = 5
        System.out.println(x);

        // Bitwise Operators -> AND & OR |
        // & 1 1 -> 1
        // | 1 0 -> 1
        // | 0 0 -> 0
        // | 0 1 -> 1
        
        int a = 25; // 1 1 0 0 1
        int b = 15; // 0 1 1 1 1
                    // 1 1 1 1 1 -> 31
                    // 0 1 0 0 1 -> 9
        int c = a & b;
        int y = a | b;
        System.out.println(c);
        System.out.println(y);
    }
}
